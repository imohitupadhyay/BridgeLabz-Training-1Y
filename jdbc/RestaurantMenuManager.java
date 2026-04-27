
import java.sql.*;
import java.util.Scanner;

public class RestaurantMenuManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table if not exists menu(id INT, itemName VARCHAR(50), price DOUBLE)");

            int id=sc.nextInt();
            sc.nextLine();
            String item=sc.nextLine();
            double price=sc.nextDouble();

            stmt.executeUpdate("insert into menu values("+id+",'"+item+"',"+price+")");

            ResultSet rs=stmt.executeQuery("select * from menu where price<200");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
            }

            int uid=sc.nextInt();
            double np=sc.nextDouble();
            stmt.executeUpdate("update menu set price="+np+" where id="+uid);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from menu where id="+del);

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
