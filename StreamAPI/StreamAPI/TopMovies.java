import java.util.*;
import java.util.stream.*;

class TopMovies{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Movie> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            double rating = sc.nextDouble();
            int year = sc.nextInt();
            list.add(new Movie(name,rating,year));
        }
        list.stream().sorted((a,b)->{
            if(b.rating==a.rating) return b.year-a.year;
            return (int)(b.rating-a.rating);
        }).limit(5).forEach(m->System.out.println(m.name));
    }
}

class Movie{
    String name;
    double rating;
    int year;
    Movie(String n,double r,int y){
        name=n;
        rating=r;
        year=y;
    }
}
