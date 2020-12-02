//*******************************************************************
//  BookInventory Class
//
// Represents a book inventory based on the book code

//*******************************************************************


public class BookInventory {
    
    public Book getProduct(String productCode) {
        
       
      Book book;   // create the  Book object

        // add data to the book object based on the code
        if (productCode.equalsIgnoreCase("mystery")) {
            book = new Book(productCode, "The ABC Murders by Agatha Christie", 29.99);
        } else if (productCode.equalsIgnoreCase("nonfiction")) {
            book = new Book(productCode, "Astrophysics for People in a Hurry by Neil deGrasse Tyson", 39.99);
        } else if (productCode.equalsIgnoreCase("children")) {
            book = new Book(productCode, "The Lorax by Dr. Seuss", 17.50);
        } else if (productCode.equalsIgnoreCase("poetry")) {
            book = new Book(productCode, "The Wasteland by T.S. Eliot", 22.00);
        } else {
            book = new Book(productCode, "Out of stock", 0);
        }
        return book;
    }
}