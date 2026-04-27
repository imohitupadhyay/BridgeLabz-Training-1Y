import java.util.*;
class Q1_WordFrequency{
public static void main(String[] a){
String s="Hello world, hello Java!";
s=s.toLowerCase().replaceAll("[^a-z ]","");
Map<String,Integer> m=new HashMap<>();
for(String w:s.split(" ")) if(w.length()>0) m.put(w,m.getOrDefault(w,0)+1);
System.out.println(m);
}
}
