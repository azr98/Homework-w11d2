import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList <>();
    }

    public void addBook(Book book) {
        if (totalBooks() < this.capacity) {
            this.books.add(book);
        }
    }

    public int totalBooks(){
        return this.books.size();
    }
}
