abstract class Vehicle {
    String vehicleNumber;
    double rate;

    Vehicle(String v,double r) {
        vehicleNumber=v;
        rate=r;
    }

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {

    Car(String v,double r){
        super(v,r);
    }

    double calculateRentalCost(int d){
        return rate*d;
    }

    public double calculateInsurance(){
        return 500;
    }
}

class Main3 {
    public static void main(String[] args) {

        Car c=new Car("DL01AB1234",2000);

        System.out.println("Rental: "+c.calculateRentalCost(3));
        System.out.println("Insurance: "+c.calculateInsurance());
    }
}