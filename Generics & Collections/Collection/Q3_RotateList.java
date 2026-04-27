import java.util.*;
class Q3_RotateList{
public static void main(String[] a){
List<Integer> l=new ArrayList<>(Arrays.asList(10,20,30,40,50));
int k=2;
for(int i=0;i<k;i++){int x=l.remove(0); l.add(x);}
System.out.println(l);
}
}
