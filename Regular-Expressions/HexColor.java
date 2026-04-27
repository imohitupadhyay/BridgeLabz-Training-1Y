import java.util.*;
class HexColor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.matches("#[0-9a-fA-F]{6}")) System.out.println("Valid");
else System.out.println("Invalid");
}
}
