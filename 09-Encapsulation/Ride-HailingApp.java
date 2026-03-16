abstract class VehicleRide {
    int vehicleId;
    String driver;
    double rate;

    VehicleRide(int v,String d,double r){
        vehicleId=v;
        driver=d;
        rate=r;
    }

    abstract double calculateFare(double distance);
}

class CarRide extends VehicleRide {

    CarRide(int v,String d,double r){
        super(v,d,r);
    }

    double calculateFare(double distance){
        return distance*rate;
    }
}

class Main8{
    public static void main(String[] args){

        CarRide c=new CarRide(1,"Aman",15);

        System.out.println("Fare: "+c.calculateFare(10));
    }
}