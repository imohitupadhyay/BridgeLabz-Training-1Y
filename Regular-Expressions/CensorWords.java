import java.util.*;
class CensorWords{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
s=s.replaceAll("damn|stupid","****");
System.out.println(s);
}
}
