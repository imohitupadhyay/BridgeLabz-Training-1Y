class CartItem {
    String itemName;
    double price;
    int quantity;

    void add(String n, double p, int q) {
        itemName = n;
        price = p;
        quantity = q;
    }

    void remove() {
        quantity = 0;
    }

    void total() {
        double t = price * quantity;
        System.out.println("Total Cost: " + t);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();

        c.add("Shoes", 2000, 2);

        c.total();

        c.remove();

        c.total();
    }
}