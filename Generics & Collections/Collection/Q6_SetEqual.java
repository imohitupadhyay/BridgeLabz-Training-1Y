import java.util.*;
class Q6_SetEqual{
public static void main(String[] a){
Set<Integer> a1=new HashSet<>(Arrays.asList(1,2,3));
Set<Integer> a2=new HashSet<>(Arrays.asList(3,2,1));
System.out.println(a1.equals(a2));
}
}
