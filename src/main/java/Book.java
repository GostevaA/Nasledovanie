public class Book extends Product {

    protected String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int id, int price, String author) {
        super(name, id, price);
        this.author = author;
    }
}
