abstract class Product {
    private int id;
    private String name;
    private double price;

    Product(int i,String n,double p) {
        id=i;
        name=n;
        price=p;
    }

    double getPrice() { return price; }

    abstract double calculateDiscount();

    void show() {
        System.out.println("Product: "+name);
        System.out.println("Price: "+price);
    }
}

interface Taxable {
    double calculateTax();
}

class Electronics extends Product implements Taxable {

    Electronics(int i,String n,double p){
        super(i,n,p);
    }

    double calculateDiscount() {
        return getPrice()*0.10;
    }

    public double calculateTax() {
        return getPrice()*0.18;
    }
}

class Main2 {
    public static void main(String[] args) {

        Electronics e = new Electronics(1,"Laptop",50000);

        double finalPrice = e.getPrice() + e.calculateTax() - e.calculateDiscount();

        e.show();
        System.out.println("Final Price: "+finalPrice);
    }
}