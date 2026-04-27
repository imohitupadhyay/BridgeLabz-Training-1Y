import java.util.*;
class LicensePlate{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.matches("[A-Z]{2}\\d{4}")) System.out.println("Valid");
else System.out.println("Invalid");
}
}
