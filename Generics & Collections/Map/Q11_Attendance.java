import java.util.*;
class Q11_Attendance{
public static void main(String[] a){
Map<String,Integer> m=new HashMap<>();
String[] names={"A","B","C","D","E"};
for(String n:names) m.put(n,0);
String[][] days={{"A","B"},{"A","C"},{"B","C","D"},{"A","E"}};
for(String[] d:days){
for(String n:d) m.put(n,m.get(n)+1);
}
for(String k:m.keySet()) if(m.get(k)<2) System.out.println(k);
}
}
