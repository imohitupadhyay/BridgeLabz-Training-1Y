interface Refuelable {
    void refuel();
}

class Vehicle {
    int speed;
}

class ElectricVehicle extends Vehicle {
    void charge(){
        System.out.println("Charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel(){
        System.out.println("Refueling");
    }
}
