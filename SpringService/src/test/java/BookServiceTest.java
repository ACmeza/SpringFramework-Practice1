import com.accenture.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by antonio on 05/03/17.
 */
public class BookServiceTest extends ServiceContexTest {

    @Test
    public void findByTitle(){
        String titleExpected = "Java";
        List<Book> books = bookService.findByTitle(titleExpected);

       for(Book book : books)  {
            String titleActual = book.getTitle();
            System.out.println(titleActual);
            Assert.assertTrue(titleActual.contains(titleExpected));
        }
    }
}
