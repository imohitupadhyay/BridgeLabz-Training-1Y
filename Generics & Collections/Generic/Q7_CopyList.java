import java.util.*;
class Q7_CopyList{
static void c(List<? super Number> d,List<? extends Number> s){
for(Number n:s) d.add(n);
}
public static void main(String[] a){
List<Number> d=new ArrayList<>();
c(d,Arrays.asList(1,2,3));
System.out.println(d);
}
}
