package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Using classes in files that implements Comparator
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Iliad", "Homer", 300));
        books.add(new Book(2, "Pippi Longstocking", "Lindgren Astrid", 250));
        books.add(new Book(3, "The Hitchhiker's Guide to the Galaxy", "Adams Douglas", 500));

        System.out.println(books);

        // todo create a Comparator for title and use it here in a Collections.sort before the printout

        System.out.println(books);

        // todo create a Comparator for author and use it here in a Collections.sort before the printout

        System.out.println(books);

        // todo create a Comparator for price and use it here in a Collections.sort before the printout

        System.out.println(books);

    }
}
