import java.util.*;
class Q5_NthFromEnd{
public static void main(String[] a){
LinkedList<String> l=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
int n=2;
ListIterator<String> it1=l.listIterator(), it2=l.listIterator();
for(int i=0;i<n;i++) it2.next();
while(it2.hasNext()){it1.next(); it2.next();}
System.out.println(it1.next());
}
}
