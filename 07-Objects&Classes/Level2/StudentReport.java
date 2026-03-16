class Student {
    String name;
    int roll;
    int marks;

    char grade() {
        if(marks >= 90)
            return 'A';
        else if(marks >= 75)
            return 'B';
        else if(marks >= 50)
            return 'C';
        else
            return 'F';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Aman";
        s.roll = 12;
        s.marks = 82;

        s.display();
    }
}