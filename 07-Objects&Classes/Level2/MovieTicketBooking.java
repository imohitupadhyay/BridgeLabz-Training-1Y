class MovieTicket {
    String movieName;
    int seatNo;
    double price;

    void book(String m, int s, double p) {
        movieName = m;
        seatNo = s;
        price = p;
    }

    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNo);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();

        t.book("Avengers", 15, 300);

        t.display();
    }
}