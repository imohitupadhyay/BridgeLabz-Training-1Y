class Fruit{}
class Apple extends Fruit{}
class Mango extends Fruit{}
class Q5_FruitBox<T extends Fruit>{
T f;
void add(T x){f=x;}
void show(){System.out.println(f);}
public static void main(String[] a){
Q5_FruitBox<Apple> b=new Q5_FruitBox<>();
b.add(new Apple());
b.show();
}
}
