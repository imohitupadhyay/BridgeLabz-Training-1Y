import java.util.*;
class Q10_WordFreqSentence{
public static void main(String[] a){
String s="Java is fun and Java is powerful";
s=s.toLowerCase().replaceAll("[^a-z ]","");
Map<String,Integer> m=new HashMap<>();
for(String w:s.split(" ")) if(w.length()>0) m.put(w,m.getOrDefault(w,0)+1);
for(String k:m.keySet()) System.out.println(k+" "+m.get(k));
}
}
