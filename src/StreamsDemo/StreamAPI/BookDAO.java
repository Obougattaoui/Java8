package StreamsDemo.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "aava", 400));
        books.add(new Book(363, "hibernate", 100));
        books.add(new Book(275, "spring", 300));
        return  books;
    }
}
