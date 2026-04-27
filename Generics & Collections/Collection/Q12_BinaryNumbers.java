import java.util.*;
class Q12_BinaryNumbers{
public static void main(String[] a){
Queue<String> q=new LinkedList<>();
q.add("1");
int n=5;
for(int i=0;i<n;i++){
String s=q.remove();
System.out.print(s+" ");
q.add(s+"0");
q.add(s+"1");
}
}
}
