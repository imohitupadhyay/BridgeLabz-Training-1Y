
import java.sql.*;
import java.util.Scanner;

public class CustomerContactDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("create table if not exists customers(id INT, name VARCHAR(50), phone VARCHAR(15))");

            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String phone=sc.nextLine();

            stmt.executeUpdate("insert into customers values("+id+",'"+name+"','"+phone+"')");

            String search=sc.nextLine();
            ResultSet rs=stmt.executeQuery("select * from customers where name like '%"+search+"%'");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

            int uid=sc.nextInt();
            sc.nextLine();
            String newphone=sc.nextLine();
            stmt.executeUpdate("update customers set phone='"+newphone+"' where id="+uid);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from customers where id="+del);

            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
