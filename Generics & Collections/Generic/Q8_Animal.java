import java.util.*;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Q8_Animal{
static void p(List<? extends Animal> l){System.out.println(l.size());}
public static void main(String[] a){
p(Arrays.asList(new Dog(),new Cat()));
}
}
