import java.util.*;
class Q8_SymmetricDiff{
public static void main(String[] a){
Set<Integer> a1=new HashSet<>(Arrays.asList(1,2,3));
Set<Integer> a2=new HashSet<>(Arrays.asList(3,4,5));
Set<Integer> r=new HashSet<>(a1);
for(int x:a2){ if(!r.add(x)) r.remove(x); }
System.out.println(r);
}
}
