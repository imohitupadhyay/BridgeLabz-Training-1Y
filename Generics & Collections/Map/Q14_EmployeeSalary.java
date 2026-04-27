import java.util.*;
class Q14_EmployeeSalary{
public static void main(String[] a){
Map<String,Double> m=new HashMap<>();
m.put("A",1000.0); m.put("B",2000.0); m.put("C",1500.0);
double sum=0, mx=0; String r="";
for(String k:m.keySet()){
double v=m.get(k);
sum+=v;
if(v>mx){mx=v; r=k;}
}
System.out.println(sum/m.size());
System.out.println(r);
}
}
