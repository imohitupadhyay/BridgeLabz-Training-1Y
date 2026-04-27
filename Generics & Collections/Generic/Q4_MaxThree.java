class Q4_MaxThree{
static <T extends Comparable<T>> T m(T a,T b,T c){
T x=a;
if(b.compareTo(x)>0) x=b;
if(c.compareTo(x)>0) x=c;
return x;
}
public static void main(String[] a){
System.out.println(m(3,7,5));
}
}
