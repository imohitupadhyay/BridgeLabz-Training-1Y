import java.util.*;
class Q15_Triage{
public static void main(String[] a){
PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->y[1]-x[1]);
pq.add(new int[]{1,3});
pq.add(new int[]{2,5});
pq.add(new int[]{3,2});
while(!pq.isEmpty()) System.out.println(pq.remove()[0]);
}
}
