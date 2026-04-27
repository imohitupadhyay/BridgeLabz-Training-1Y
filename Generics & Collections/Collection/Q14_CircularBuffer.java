import java.util.*;
class Q14_CircularBuffer{
public static void main(String[] a){
int[] b=new int[3];
int i=0;
for(int x:new int[]{1,2,3,4}){ b[i%3]=x; i++; }
System.out.println(Arrays.toString(b));
}
}
