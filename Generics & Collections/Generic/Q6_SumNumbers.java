import java.util.*;
class Q6_SumNumbers{
static double s(List<? extends Number> l){
double x=0;
for(Number n:l) x+=n.doubleValue();
return x;
}
public static void main(String[] a){
System.out.println(s(Arrays.asList(1,2,3)));
}
}
