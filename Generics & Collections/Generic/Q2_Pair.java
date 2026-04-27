class Q2_Pair<T,U>{
T a; U b;
Q2_Pair(T x,U y){a=x;b=y;}
T getFirst(){return a;}
U getSecond(){return b;}
public static void main(String[] a){
Q2_Pair<String,Integer> p=new Q2_Pair<>("A",1);
System.out.println(p.getFirst());
}
}
