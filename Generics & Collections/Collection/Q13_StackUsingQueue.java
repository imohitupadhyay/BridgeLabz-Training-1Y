import java.util.*;
class Q13_StackUsingQueue{
public static void main(String[] a){
Queue<Integer> q1=new LinkedList<>(), q2=new LinkedList<>();
q1.add(1);q1.add(2);q1.add(3);
while(q1.size()>1) q2.add(q1.remove());
System.out.println(q1.remove());
}
}
