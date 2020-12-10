public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String title;
    private int priceCode;

    public Movie( String title, int priceCode ) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode( int priceCode ) {
        this.priceCode = priceCode;
    }

    public double calculateFee( int daysRented ) {
        double thisAmount = 0;

        // determine amounts for each line
        switch( getPriceCode() ) {
            case Movie.REGULAR:
                thisAmount += 2;
                if(daysRented > 2 )
                    thisAmount += ( daysRented - 2 ) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if( daysRented > 3 )
                    thisAmount += ( daysRented - 3 ) * 1.5;
                break;

        }
        return thisAmount;
    }

    public  int calculateBonus( int daysRented ) {
        if( ( getPriceCode() == Movie.NEW_RELEASE ) && daysRented > 1 )
            // extra bonus point for new released movies
            return 2;
        else
            return 1;
    }
}