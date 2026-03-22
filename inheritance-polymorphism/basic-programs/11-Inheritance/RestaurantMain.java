interface Worker {
    void performDuties();
}

class Person {
    String name;
}

class Chef extends Person implements Worker {
    public void performDuties(){
        System.out.println("Cooking");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties(){
        System.out.println("Serving");
    }
}
