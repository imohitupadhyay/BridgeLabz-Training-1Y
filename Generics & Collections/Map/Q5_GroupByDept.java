import java.util.*;
class Emp{String n,d;Emp(String n,String d){this.n=n;this.d=d;}}
class Q5_GroupByDept{
public static void main(String[] a){
List<Emp> l=Arrays.asList(new Emp("Alice","HR"),new Emp("Bob","IT"),new Emp("Carol","HR"));
Map<String,List<String>> m=new HashMap<>();
for(Emp e:l){
if(!m.containsKey(e.d)) m.put(e.d,new ArrayList<>());
m.get(e.d).add(e.n);
}
System.out.println(m);
}
}
