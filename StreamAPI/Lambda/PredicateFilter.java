import java.util.*;
import java.util.function.*;

class PredicateFilter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        Predicate<String> p = x->x.startsWith("A");
        for(String s:list){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }
}
