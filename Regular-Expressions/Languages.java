import java.util.*;
import java.util.regex.*;
class Q12_Languages{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
Matcher m=Pattern.compile("Java|Python|JavaScript|Go").matcher(s);
while(m.find()) System.out.println(m.group());
}
}
