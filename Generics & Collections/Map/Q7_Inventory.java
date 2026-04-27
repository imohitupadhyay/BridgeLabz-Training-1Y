import java.util.*;
class Q7_Inventory{
public static void main(String[] a){
Map<String,Integer> m=new HashMap<>();
m.put("pen",10); m.put("book",2);
m.put("pen",m.get("pen")-3);
if(m.get("book")<=0) m.put("book",0);
m.put("book",m.get("book")+5);
System.out.println(m.getOrDefault("pencil",0));
for(String k:m.keySet()) if(m.get(k)==0) System.out.println(k);
}
}
