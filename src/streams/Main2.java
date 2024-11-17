package streams;

import task1.Book;

import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        List<task1.Book> books = new ArrayList<>();
        books.add(new task1.Book(1, "The Iliad", "Homer", 300));
        books.add(new task1.Book(2, "Pippi Longstocking", "Lindgren Astrid", 250));
        books.add(new Book(3, "The Hitchhiker's Guide to the Galaxy", "Adams Douglas", 500));

        System.out.println(books);

        books.stream().sorted(
                (book1, book2)->{
                    return book1.getAuthor().compareTo(book2.getAuthor());
                }
        ) ;
    }
}
