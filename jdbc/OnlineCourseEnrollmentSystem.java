
import java.sql.*;
import java.util.Scanner;

public class OnlineCourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table if not exists enrollments(id INT, student VARCHAR(50), course VARCHAR(50))");

            int id=sc.nextInt();
            sc.nextLine();
            String student=sc.nextLine();
            String course=sc.nextLine();

            stmt.executeUpdate("insert into enrollments values("+id+",'"+student+"','"+course+"')");

            String c=sc.nextLine();
            ResultSet rs=stmt.executeQuery("select * from enrollments where course='"+c+"'");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

            int uid=sc.nextInt();
            sc.nextLine();
            String nc=sc.nextLine();
            stmt.executeUpdate("update enrollments set course='"+nc+"' where id="+uid);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from enrollments where id="+del);

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
