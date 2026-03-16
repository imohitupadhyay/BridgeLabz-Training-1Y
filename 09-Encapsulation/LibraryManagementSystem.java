abstract class LibraryItem {
    int itemId;
    String title;
    String author;

    LibraryItem(int i,String t,String a){
        itemId=i;
        title=t;
        author=a;
    }

    abstract int getLoanDuration();

    void getItemDetails(){
        System.out.println(title+" by "+author);
    }
}

interface Reservable{
    void reserveItem();
}

class Book extends LibraryItem implements Reservable{

    Book(int i,String t,String a){
        super(i,t,a);
    }

    int getLoanDuration(){
        return 14;
    }

    public void reserveItem(){
        System.out.println("Book Reserved");
    }
}