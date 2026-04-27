import java.util.*;
class Q7_UnionIntersection{
public static void main(String[] a){
Set<Integer> a1=new HashSet<>(Arrays.asList(1,2,3));
Set<Integer> a2=new HashSet<>(Arrays.asList(3,4,5));
Set<Integer> u=new HashSet<>(a1); u.addAll(a2);
Set<Integer> i=new HashSet<>(a1); i.retainAll(a2);
System.out.println(u);
System.out.println(i);
}
}
