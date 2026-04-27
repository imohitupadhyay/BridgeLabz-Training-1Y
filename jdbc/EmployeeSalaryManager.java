
import java.sql.*;
import java.util.Scanner;

public class EmployeeSalaryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("create table if not exists employee(id INT, name VARCHAR(50), salary DOUBLE)");

            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double salary = sc.nextDouble();

            stmt.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");

            ResultSet rs = stmt.executeQuery("select * from employee where salary>30000");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
            }

            stmt.executeUpdate("update employee set salary=salary*1.10 where id="+id);
            stmt.executeUpdate("delete from employee where salary<15000");

            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
