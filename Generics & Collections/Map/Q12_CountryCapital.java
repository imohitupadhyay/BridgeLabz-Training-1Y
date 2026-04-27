import java.util.*;
class Q12_CountryCapital{
public static void main(String[] a){
Map<String,String> m=new TreeMap<>();
m.put("India","Delhi"); m.put("USA","Washington");
System.out.println(m.getOrDefault("India","Unknown country"));
for(String k:m.keySet()) System.out.println(k+" "+m.get(k));
}
}
