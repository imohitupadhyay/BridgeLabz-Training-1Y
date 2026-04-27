import java.util.*;
class Q10_Subset{
public static void main(String[] a){
Set<Integer> a1=new HashSet<>(Arrays.asList(2,3));
Set<Integer> a2=new HashSet<>(Arrays.asList(1,2,3,4));
System.out.println(a2.containsAll(a1));
}
}
