class Q1_Box<T>{
T v;
void set(T x){v=x;}
T get(){return v;}
public static void main(String[] a){
Q1_Box<Integer> b=new Q1_Box<>();
b.set(10);
System.out.println(b.get());
}
}
