import java.util.*;
class Q4_RemoveDuplicates{
public static void main(String[] a){
List<Integer> l=Arrays.asList(3,1,2,2,3,4);
Set<Integer> s=new LinkedHashSet<>(l);
System.out.println(s);
}
}
