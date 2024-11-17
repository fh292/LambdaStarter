package task3;

import task1.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Using classes in files that implements Comparator
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Iliad", "Homer", 300));
        books.add(new Book(2, "Pippi Longstocking", "Lindgren Astrid", 250));
        books.add(new Book(3, "The Hitchhiker's Guide to the Galaxy", "Adams Douglas", 500));

        System.out.println(books);

        // todo use a labmda expression here to implement a Comparator interface for title and use it in a Collections.sort before the printout
        Collections.sort(books, Comparator.comparing(book -> book.getTitle()));
        System.out.println(books);

        // todo use a labmda expression here to implement a Comparator interface for author and use it in a Collections.sort before the printout
        Collections.sort(books, Comparator.comparing(book -> book.getAuthor()));
        System.out.println(books);

        // todo use a labmda expression here to implement a Comparator interface for price and use it in a Collections.sort before the printout
        Collections.sort(books, Comparator.comparing(book ->book.getPrice()));
        System.out.println(books);

    }
}
