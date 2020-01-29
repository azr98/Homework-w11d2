import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("The Godfather","Mario Puzo","Crime Thriller");
        book2 = new Book("Fools Die","Mario Puzo","Crime Thriller");
        book3 = new Book("The Sicilian", "Mario Puzo","Historical Thrilller");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2,library.getCapacity());
    }

    @Test
    public void canAddAndTotalBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2,library.totalBooks());
    }

    @Test
    public void onlyAddsBookIfCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2,library.totalBooks());
    }


}
