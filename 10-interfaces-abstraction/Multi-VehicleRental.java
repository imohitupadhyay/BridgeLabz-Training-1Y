interface Rental {
    void rent();
    void returnVehicle();
}

class Car implements Rental {

    public void rent() {
        System.out.println("Car Rented");
    }

    public void returnVehicle() {
        System.out.println("Car Returned");
    }
}

class Bike implements Rental {

    public void rent() {
        System.out.println("Bike Rented");
    }

    public void returnVehicle() {
        System.out.println("Bike Returned");
    }
}

class Main2 {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        c.rent();
        b.rent();

        c.returnVehicle();
        b.returnVehicle();
    }
}