class Employee {
    String name;
    int id;
    double salary;

    void displayDetails(){
        System.out.println(name+" "+id+" "+salary);
    }
}

class Manager extends Employee {
    int teamSize;
    void displayDetails(){
        super.displayDetails();
        System.out.println(teamSize);
    }
}

class Developer extends Employee {
    String lang;
    void displayDetails(){
        super.displayDetails();
        System.out.println(lang);
    }
}

class Intern extends Employee {
    int duration;
    void displayDetails(){
        super.displayDetails();
        System.out.println(duration);
    }
}

class EmployeeMain {
    public static void main(String[] args){
        Manager m = new Manager();
        m.name="A"; m.id=1; m.salary=50000; m.teamSize=5;
        m.displayDetails();
    }
}
