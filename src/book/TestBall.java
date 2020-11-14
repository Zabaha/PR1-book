package book;

public class TestBall {

    public static void main(String[] args) {
        int length = 4;
        Book[] arr = new Book[length];
        arr[0] = new Book("1984", "антиутопия", 319);
        arr[1] = new Book("Война и мир", "роман");
        arr[2] = new Book("Судьба человека");
        arr[3] = new Book();
        arr[3].setBookTitle("О дивный новый мир");
        arr[2].setGenre("рассказ");
        arr[1].setNumberOfPages(1225);
        System.out.println(arr[3].getBookTitle());
        System.out.println(arr[1].getGenre());
        System.out.println(arr[0].getNumberOfPages());
        for (int i = 0; i < length; i++){
            System.out.println(arr[i].toStr());
        }
        System.out.println(Book.searchOfBook("Война и мир",arr, length));
    }
}
