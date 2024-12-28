public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Book object
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Displaying book details
        myBook.displayBookDetails();
    }
}
