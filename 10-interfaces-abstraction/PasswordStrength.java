interface SecurityUtils {

    static boolean checkPassword(String p) {

        if(p.length() >= 8)
            return true;
        else
            return false;
    }
}

class Main7 {
    public static void main(String[] args) {

        String pass = "mypassword";

        if(SecurityUtils.checkPassword(pass))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}