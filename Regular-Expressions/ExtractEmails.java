import java.util.*;
import java.util.regex.*;
class ExtractEmails{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Matcher m=Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(s);
while(m.find()) System.out.println(m.group());
}
}
