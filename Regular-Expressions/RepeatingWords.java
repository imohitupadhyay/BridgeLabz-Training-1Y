import java.util.*;
import java.util.regex.*;
class Q14_RepeatingWords{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Matcher m=Pattern.compile("\\b(\\w+) \\1\\b").matcher(s);
while(m.find()) System.out.println(m.group(1));
}
}
