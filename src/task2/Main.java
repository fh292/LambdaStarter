package task2;

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

        // todo use an anonymous Comparator class here for title and use it here in a Collections.sort before the printout
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println(books);

        // todo use an anonymous Comparator class here for author and use it here in a Collections.sort before the printout
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getAuthor().compareTo(o1.getAuthor());
            }
        });
        System.out.println(books);

        // todo use an anonymous Comparator class here for price and use it here in a Collections.sort before the printout
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println(books);

    }
}
