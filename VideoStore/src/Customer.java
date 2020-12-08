import java.util.ArrayList;

public class Customer {

    private final String name;
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public Customer( String name ) {
        this.name = name;
    }

    public void addRental( Rental arg ) {
        rentals.add( arg );
    }

    public String getName() {
        return name;
    }

    public String statement() {
        // add header line
        StringBuilder result = new StringBuilder();
        result.append( "Rental Record for " + getName() + "\n" );

        // add line for each rental
        for( Rental curRental : rentals ) {
            result.append( "\t" + curRental.getMovie().getTitle() + "\tdays rented: " + curRental.getDaysRented() + "  = " +  String.valueOf( curRental.getFee() ) + "\n" );
        }

        // add footer lines
        result.append( "Amount owed is " + String.valueOf( getTotalAmount() ) + "\n" );
        result.append( "You earned " + String.valueOf( getFrequentRenterPoints() ) + " frequent renter points" );
        return result.toString();
    }

    private double getTotalAmount() {
        double totalAmount = 0.0;
        for( Rental curRental : rentals ) {
            totalAmount += curRental.getFee();
        }
        return totalAmount;
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for( Rental curRental : rentals ) {
            frequentRenterPoints += curRental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
