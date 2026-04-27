
import java.sql.*;
import java.util.Scanner;

public class SimpleBankingAccountManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table if not exists accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");

            int acc=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            double bal=sc.nextDouble();

            stmt.executeUpdate("insert into accounts values("+acc+",'"+name+"',"+bal+")");

            ResultSet rs=stmt.executeQuery("select * from accounts where balance>10000");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
            }

            int accno=sc.nextInt();
            double amt=sc.nextDouble();
            stmt.executeUpdate("update accounts set balance=balance+"+amt+" where accNo="+accno);

            int del=sc.nextInt();
            stmt.executeUpdate("delete from accounts where accNo="+del);

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
