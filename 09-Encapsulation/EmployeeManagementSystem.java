abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String n, double s) {
        employeeId = id;
        name = n;
        baseSalary = s;
    }

    public int getId() { return employeeId; }
    public String getName() { return name; }
    public double getSalary() { return baseSalary; }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String d);
    void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    String dept;

    public FullTimeEmployee(int id,String n,double s) {
        super(id,n,s);
    }

    double calculateSalary() {
        return getSalary();
    }

    public void assignDepartment(String d) {
        dept = d;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + dept);
    }
}

class PartTimeEmployee extends Employee implements Department {
    int hours;
    String dept;

    public PartTimeEmployee(int id,String n,double rate,int h) {
        super(id,n,rate);
        hours = h;
    }

    double calculateSalary() {
        return getSalary() * hours;
    }

    public void assignDepartment(String d) {
        dept = d;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + dept);
    }
}

class Main1 {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee(1,"Rahul",50000);
        PartTimeEmployee e2 = new PartTimeEmployee(2,"Aman",200,5);

        e1.assignDepartment("IT");
        e2.assignDepartment("Support");

        e1.displayDetails();
        e1.getDepartmentDetails();

        e2.displayDetails();
        e2.getDepartmentDetails();
    }
}