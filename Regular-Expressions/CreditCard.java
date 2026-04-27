import java.util.*;
class CreditCard{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.matches("[45]\\d{15}")) System.out.println("Valid");
else System.out.println("Invalid");
}
}
