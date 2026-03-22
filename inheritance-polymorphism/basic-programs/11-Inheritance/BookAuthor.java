class Book {
    String title;
    int year;
}

class Author extends Book {
    String name;
    String bio;

    void displayInfo(){
        System.out.println(title+" "+year+" "+name+" "+bio);
    }
}
