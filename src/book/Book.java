package book;

public class Book {
    private String bookTitle;
    private String genre;
    private int numberOfPages;

    public Book(){
        bookTitle = "empty";
        genre = "empty";
        numberOfPages = 0;
    }
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
        genre = "empty";
        numberOfPages = 0;
    }
    public Book(String bookTitle, String genre){
        this.bookTitle = bookTitle;
        this.genre = genre;
        numberOfPages = 0;
    }
    public Book(String bookTitle, String genre, int numberOfPages){
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getBookTitle(){
        return bookTitle;
    }
    public String getGenre(){
        return genre;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toStr(){
        return "Название книги " + bookTitle + ", Жанр " + genre + ", количество страниц " + numberOfPages;
    }
    public static String searchOfBook(String someTitle, Book[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if (someTitle.equals(arr[i].bookTitle)) {
                return arr[i].toStr();
            }
        }
        return "Ошибка";
    }
}
