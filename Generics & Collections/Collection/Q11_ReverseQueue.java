import java.util.*;
class Q11_ReverseQueue{
public static void main(String[] a){
Queue<Integer> q=new LinkedList<>();
q.add(1);q.add(2);q.add(3);
Stack<Integer> s=new Stack<>();
while(!q.isEmpty()) s.push(q.remove());
while(!s.isEmpty()) q.add(s.pop());
System.out.println(q);
}
}
