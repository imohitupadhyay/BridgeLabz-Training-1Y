class Animal {
    String name;
    int age;

    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound(){ System.out.println("Bark"); }
}

class Cat extends Animal {
    void makeSound(){ System.out.println("Meow"); }
}

class Bird extends Animal {
    void makeSound(){ System.out.println("Chirp"); }
}

class AnimalMain {
    public static void main(String[] args){
        Animal a;
        a = new Dog(); a.makeSound();
        a = new Cat(); a.makeSound();
        a = new Bird(); a.makeSound();
    }
}
