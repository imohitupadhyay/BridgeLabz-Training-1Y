
import java.sql.*;
import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table if not exists movies(id INT, name VARCHAR(50), seats INT)");

            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int seats=sc.nextInt();

            stmt.executeUpdate("insert into movies values("+id+",'"+name+"',"+seats+")");

            ResultSet rs=stmt.executeQuery("select * from movies where seats>0");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            int mid=sc.nextInt();
            stmt.executeUpdate("update movies set seats=seats-1 where id="+mid);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from movies where id="+del);

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
