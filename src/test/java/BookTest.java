import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

   private Book book;

    @Before
    public void before(){
        book = new Book("The Godfather", "Mario Puzo", "Crime Thriller");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Godfather", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Mario Puzo", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Crime Thriller", book.getGenre());
    }

}
