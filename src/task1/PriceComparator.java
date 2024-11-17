package task1;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getPrice() - b2.getPrice();
    }
}
