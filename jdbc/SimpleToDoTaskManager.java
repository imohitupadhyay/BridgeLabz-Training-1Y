
import java.sql.*;
import java.util.Scanner;

public class SimpleToDoTaskManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table if not exists tasks(id INT, title VARCHAR(100), status VARCHAR(20))");

            int id=sc.nextInt();
            sc.nextLine();
            String title=sc.nextLine();
            String status=sc.nextLine();

            stmt.executeUpdate("insert into tasks values("+id+",'"+title+"','"+status+"')");

            ResultSet rs=stmt.executeQuery("select * from tasks where status='Pending'");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

            int uid=sc.nextInt();
            stmt.executeUpdate("update tasks set status='Completed' where id="+uid);

            stmt.executeUpdate("delete from tasks where status='Completed'");

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
