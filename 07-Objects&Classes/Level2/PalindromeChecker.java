class PalindromeChecker {
    String text;

    boolean check() {
        String r = "";
        int i;

        for(i = text.length()-1; i >= 0; i--) {
            r = r + text.charAt(i);
        }

        if(text.equals(r))
            return true;
        else
            return false;
    }

    void display() {
        if(check())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();

        p.text = "madam";

        p.display();
    }
}