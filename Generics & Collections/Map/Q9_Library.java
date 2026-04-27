import java.util.*;
class Q9_Library{
public static void main(String[] a){
Map<String,String> m=new TreeMap<>();
m.put("978-1","Java"); m.put("978-2","DBMS");
System.out.println(m.getOrDefault("978-3","Book not found"));
for(String k:m.keySet()) System.out.println(k+" "+m.get(k));
}
}
