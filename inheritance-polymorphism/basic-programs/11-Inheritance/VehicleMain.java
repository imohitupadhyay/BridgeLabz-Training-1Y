class Vehicle {
    int maxSpeed;
    String fuel;

    void displayInfo(){
        System.out.println(maxSpeed+" "+fuel);
    }
}

class Car extends Vehicle {
    int seats;
    void displayInfo(){
        super.displayInfo();
        System.out.println(seats);
    }
}

class Truck extends Vehicle {
    int load;
    void displayInfo(){
        super.displayInfo();
        System.out.println(load);
    }
}

class Motorcycle extends Vehicle {
    boolean gear;
    void displayInfo(){
        super.displayInfo();
        System.out.println(gear);
    }
}

class VehicleMain {
    public static void main(String[] args){
        Vehicle v = new Car();
        v.displayInfo();
    }
}
