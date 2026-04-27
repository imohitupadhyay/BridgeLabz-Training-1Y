
import java.sql.*;
import java.util.Scanner;

public class LibraryBookManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("create table if not exists books(id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))");

            int id=sc.nextInt();
            sc.nextLine();
            String title=sc.nextLine();
            String author=sc.nextLine();
            String status=sc.nextLine();

            stmt.executeUpdate("insert into books values("+id+",'"+title+"','"+author+"','"+status+"')");

            ResultSet rs = stmt.executeQuery("select * from books where status='Available'");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }

            int issue=sc.nextInt();
            stmt.executeUpdate("update books set status='Issued' where id="+issue);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from books where id="+del);

            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
