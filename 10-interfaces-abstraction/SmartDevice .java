interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("Light ON");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

class AC implements SmartDevice {

    public void turnOn() {
        System.out.println("AC ON");
    }

    public void turnOff() {
        System.out.println("AC OFF");
    }
}

class Main1 {
    public static void main(String[] args) {

        Light l = new Light();
        AC a = new AC();

        l.turnOn();
        l.turnOff();

        a.turnOn();
        a.turnOff();
    }
}