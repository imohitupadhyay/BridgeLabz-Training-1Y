class Item {
    int itemCode;
    String itemName;
    double price;

    void display() {
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void totalCost(int q) {
        double t = price * q;
        System.out.println("Total Cost = " + t);
    }

    public static void main(String[] args) {
        Item i = new Item();

        i.itemCode = 1;
        i.itemName = "Pen";
        i.price = 10;

        i.display();
        i.totalCost(5);
    }
}