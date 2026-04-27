import java.util.*;
class Q8_Voting{
public static void main(String[] a){
Map<String,Integer> m=new HashMap<>();
String[] v={"A","B","A","C","A","B","C","A","B","A"};
for(String s:v) m.put(s,m.getOrDefault(s,0)+1);
String r=""; int mx=0;
for(String k:m.keySet()) if(m.get(k)>mx){mx=m.get(k); r=k;}
System.out.println(r);
System.out.println(m);
}
}
