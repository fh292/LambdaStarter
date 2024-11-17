package streams;

public class Book {
    private long productId;
    private String title;
    private String author;
    private int price;

    public Book(long productId, String title, String author, int price) {
        this.productId = productId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + productId;
    }
}