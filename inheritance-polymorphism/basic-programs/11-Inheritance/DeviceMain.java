class Device {
    int id;
    String status;
}

class Thermostat extends Device {
    int temp;

    void displayStatus(){
        System.out.println(id+" "+status+" "+temp);
    }
}
