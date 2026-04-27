import java.util.*;
import java.util.regex.*;
class Q13_Currency{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Matcher m=Pattern.compile("\\$?\\d+\\.\\d+").matcher(s);
while(m.find()) System.out.println(m.group());
}
}
