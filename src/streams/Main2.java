package streams;


import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Iliad", "Homer", 300));
        books.add(new Book(2, "Pippi Longstocking", "Lindgren Astrid", 250));
        books.add(new Book(3, "The Hitchhiker's Guide to the Galaxy", "Adams Douglas", 500));

        System.out.println(books);

        books.stream().sorted(
                (book1, book2)->{
                    return book1.getTitle().compareTo(book2.getTitle());
                }
        ).map(book->new Book(book.getProductId(), book.getTitle(), book.getAuthor(), book.getPrice())).forEach(b->System.out.println(b));
    }
}
