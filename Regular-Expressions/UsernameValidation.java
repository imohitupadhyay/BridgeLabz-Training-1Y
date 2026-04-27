import java.util.*;
class UsernameValidation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.matches("[a-zA-Z][a-zA-Z0-9_]{4,14}")) System.out.println("Valid");
else System.out.println("Invalid");
}
}
