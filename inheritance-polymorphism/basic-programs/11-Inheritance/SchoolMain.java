class Person {
    String name;
    int age;
}

class Teacher extends Person {
    void displayRole(){ System.out.println("Teacher"); }
}

class Student extends Person {
    void displayRole(){ System.out.println("Student"); }
}

class Staff extends Person {
    void displayRole(){ System.out.println("Staff"); }
}
