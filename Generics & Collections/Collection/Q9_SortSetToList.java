import java.util.*;
class Q9_SortSetToList{
public static void main(String[] a){
Set<Integer> s=new HashSet<>(Arrays.asList(5,3,9,1));
List<Integer> l=new ArrayList<>(s);
Collections.sort(l);
System.out.println(l);
}
}
