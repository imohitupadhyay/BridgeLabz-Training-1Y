import java.util.*;
class Q6_StudentGradeTracker{
public static void main(String[] a){
Map<String,Double> m=new TreeMap<>();
m.put("A",80.0);m.put("B",70.0);
m.put("B",75.0);
m.remove("A");
for(String k:m.keySet()) System.out.println(k+" "+m.get(k));
}
}
