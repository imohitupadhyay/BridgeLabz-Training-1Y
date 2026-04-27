import java.util.*;
import java.util.stream.*;

class DoctorAvailability{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Doctor> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            String day = sc.next();
            String spec = sc.next();
            list.add(new Doctor(name,day,spec));
        }
        list.stream().filter(d->d.day.equals("weekend"))
        .sorted((a,b)->a.spec.compareTo(b.spec))
        .forEach(d->System.out.println(d.name));
    }
}

class Doctor{
    String name;
    String day;
    String spec;
    Doctor(String n,String d,String s){
        name=n;
        day=d;
        spec=s;
    }
}
