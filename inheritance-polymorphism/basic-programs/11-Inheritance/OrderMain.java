class Order {
    int orderId;
}

class ShippedOrder extends Order {
    String tracking;
}

class DeliveredOrder extends ShippedOrder {
    String date;

    String getStatus(){
        return "Delivered";
    }
}
