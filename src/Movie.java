public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    private int _priceCode;
    
    public Movie(String title, int priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public double getCharge(int days){
        double result = 0; 
        
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (days > 2)
                    result += (days - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += days * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (days > 3)
                result += (days - 3) * 1.5;
                break;
        }   
        
        return result;
    }    
    
    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        this._priceCode = arg;
    }
    
    public String getTitle() {
        return _title;
    }
    
}
