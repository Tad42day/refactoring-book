public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Thadeu");
        Movie[] movies = new Movie[3];
        Rental[] rentals = new Rental[3];
        
        movies[0] = new Movie("Rei leão", 2);
        movies[1] = new Movie("Jumanji", 0);
        movies[2] = new Movie("Vingadores", 1);
        
        for (int i = 0; i < movies.length; i++) {
            rentals[i] = new Rental(movies[i], 2);
            customer.addRental(rentals[i]);
        }
        
        System.out.println(customer.htmlStatement());
    }
}
