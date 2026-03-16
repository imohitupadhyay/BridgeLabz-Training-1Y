abstract class Patient {
    int id;
    String name;
    int age;

    Patient(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }

    abstract double calculateBill();
}

class InPatient extends Patient {

    int days;

    InPatient(int i,String n,int a,int d){
        super(i,n,a);
        days=d;
    }

    double calculateBill(){
        return days*2000;
    }
}