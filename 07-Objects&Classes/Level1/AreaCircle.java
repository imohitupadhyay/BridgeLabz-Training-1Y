class Circle {
    double r;

    void area() {
        double a = 3.14 * r * r;
        System.out.println("Area = " + a);
    }

    void circumference() {
        double c = 2 * 3.14 * r;
        System.out.println("Circumference = " + c);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.r = 5;

        c.area();
        c.circumference();
    }
}