package BookStore.BookStore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LineRunner implements CommandLineRunner {

    private final BookRepository repository;

    public LineRunner(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Title 1", "Author 1", 2005, 346, 25);
        Book book2 = new Book("Title 2", "Author 2", 2007, 435, 34);
        repository.save(book1);
        repository.save(book2);

    }

}
