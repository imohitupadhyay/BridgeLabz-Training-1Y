import java.util.*;
import java.util.regex.*;
class Dates{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Matcher m=Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(s);
while(m.find()) System.out.println(m.group());
}
}
