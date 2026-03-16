interface SensitiveData { }

class UserData implements SensitiveData {

    String name = "Rahul";
}

class Main10 {
    public static void main(String[] args) {

        UserData u = new UserData();

        if(u instanceof SensitiveData)
            System.out.println("Encrypt this data");
    }
}