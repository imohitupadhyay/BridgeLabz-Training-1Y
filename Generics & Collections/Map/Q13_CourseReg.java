import java.util.*;
class Q13_CourseReg{
public static void main(String[] a){
Map<String,Integer> m=new HashMap<>();
m.put("CS101",60); m.put("CS102",3);
for(String k:m.keySet()){
if(m.get(k)>=50) System.out.println("full "+k);
if(m.get(k)<5) System.out.println("low "+k);
}
}
}
