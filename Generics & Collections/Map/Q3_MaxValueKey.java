import java.util.*;
class Q3_MaxValueKey{
public static void main(String[] a){
Map<String,Integer> m=new HashMap<>();
m.put("A",10);m.put("B",20);m.put("C",15);
String ans=""; int mx=Integer.MIN_VALUE;
for(String k:m.keySet()){
if(m.get(k)>mx){mx=m.get(k); ans=k;}
}
System.out.println(ans);
}
}
