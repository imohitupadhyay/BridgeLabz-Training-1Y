import java.util.*;
class Q2_FreqElements{
public static void main(String[] a){
List<String> l=Arrays.asList("apple","banana","apple","orange");
Map<String,Integer> m=new HashMap<>();
for(String s:l) m.put(s,m.getOrDefault(s,0)+1);
System.out.println(m);
}
}
