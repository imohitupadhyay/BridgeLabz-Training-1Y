import java.util.*;

class LambdaSortProducts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int price = sc.nextInt();
            list.add(new Product(name,price));
        }
        list.sort((a,b)->a.price-b.price);
        for(Product p:list){
            System.out.println(p.name);
        }
    }
}

class Product{
    String name;
    int price;
    Product(String n,int p){
        name=n;
        price=p;
    }
}
