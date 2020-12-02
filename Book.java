//*******************************************************************
//  Book Class
//
// Represents a book with genre, description and a price
//*******************************************************************

import java.text.NumberFormat;

public class Book {

    private String genre;
    private String description;
    private double price;

    public Book() {
        genre = "";
        description = "";
        price = 0;
    }
    
    public Book(String genre, String description, double price) {
        this.genre = genre;
        this.description = description;
        this.price = price;
    }    

    public void seGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(price);
        return priceFormatted;
    }    
    
    public String getPriceNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        number.setMinimumFractionDigits(2);        
        String priceFormatted = number.format(price);
        return priceFormatted;
    }    
    
}