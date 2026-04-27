
import java.sql.*;
import java.util.Scanner;

public class ProductInventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("create table if not exists product(pid INT, pname VARCHAR(50), qty INT)");

            for(int i=0;i<3;i++){
                int pid=sc.nextInt();
                sc.nextLine();
                String pname=sc.nextLine();
                int qty=sc.nextInt();
                stmt.executeUpdate("insert into product values("+pid+",'"+pname+"',"+qty+")");
            }

            ResultSet rs = stmt.executeQuery("select * from product where qty<10");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            int id=sc.nextInt();
            int add=sc.nextInt();
            stmt.executeUpdate("update product set qty=qty+"+add+" where pid="+id);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from product where pid="+del);

            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
