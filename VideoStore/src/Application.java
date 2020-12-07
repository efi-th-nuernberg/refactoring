import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main( String[] args ) {
        Application app = new Application();
        app.init();
        app.run();
        app.done();
    }

    public void init() {
        System.out.println( "initializing application" );
        movies.add( new Movie("Regular_Movie_1   ", Movie.REGULAR ) );
        movies.add( new Movie("Regular_Movie_2   ", Movie.REGULAR ) );
        movies.add( new Movie("Children_Movie_1  ", Movie.CHILDRENS ) );
        movies.add( new Movie("Children_Movie_2  ", Movie.CHILDRENS ) );
        movies.add( new Movie("NewRelease_Movie_1", Movie.NEW_RELEASE ) );
        movies.add( new Movie("NewRelease_Movie_2", Movie.NEW_RELEASE ) );


        customers.add( new Customer( "Customer_A" ) );
        customers.add( new Customer( "Customer_B" ) );
        customers.add( new Customer( "Customer_C" ) );
    }

    public void run() {
        System.out.println( "application is running" );

        Customer customer_1 = customers.get( 0 );

        customer_1.addRental( new Rental( movies.get( 0 ), 3 ) );
        customer_1.addRental( new Rental( movies.get( 2 ), 3 ) );
        customer_1.addRental( new Rental( movies.get( 4 ), 3 ) );
        String statement = customer_1.statement();
        System.out.println( statement );
    }

    public void done() {
        System.out.println( "application finished" );
    }

    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
}

