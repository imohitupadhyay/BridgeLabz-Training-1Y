
import java.sql.*;
import java.util.Scanner;

public class HospitalPatientRecordSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table if not exists patients(id INT, name VARCHAR(50), disease VARCHAR(50))");

            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String disease=sc.nextLine();

            stmt.executeUpdate("insert into patients values("+id+",'"+name+"','"+disease+"')");

            String d=sc.nextLine();
            ResultSet rs=stmt.executeQuery("select * from patients where disease='"+d+"'");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

            int uid=sc.nextInt();
            sc.nextLine();
            String nd=sc.nextLine();
            stmt.executeUpdate("update patients set disease='"+nd+"' where id="+uid);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from patients where id="+del);

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
