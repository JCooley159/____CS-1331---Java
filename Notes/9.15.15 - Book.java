public class Book {
    //instance variables
    private String title;
    private int numPages;

    //constructor
    public Book(String bookTitle, int pages) {
        title = bookTitle;
        numPages = pages;
    }

    //instance methods
    public void changePages(int newPages) {
        numPages = newPages
    }

    public static int getNumberOfBooksCreated() {
        return numberOfBooksCreated;
    }

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 200)
        harryPotter.changePages(10);

        int n = Book.getNumberOfBooksCreated();
    }
}
