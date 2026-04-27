import java.util.*;
class IPAddress{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.matches("((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)")) System.out.println("Valid");
else System.out.println("Invalid");
}
}
