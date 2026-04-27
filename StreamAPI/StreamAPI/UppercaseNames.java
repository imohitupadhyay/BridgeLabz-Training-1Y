import java.util.*;
import java.util.stream.*;

class UppercaseNames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        list.stream().map(x->x.toUpperCase())
        .sorted()
        .forEach(x->System.out.println(x));
    }
}
