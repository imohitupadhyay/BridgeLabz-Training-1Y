abstract class FoodItem {
    String name;
    double price;
    int qty;

    FoodItem(String n,double p,int q){
        name=n;
        price=p;
        qty=q;
    }

    abstract double calculateTotalPrice();
}

interface Discountable{
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable{

    VegItem(String n,double p,int q){
        super(n,p,q);
    }

    double calculateTotalPrice(){
        return price*qty;
    }

    public double applyDiscount(){
        return 20;
    }
}