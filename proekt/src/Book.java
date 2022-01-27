import java.io.Serializable;

public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
    private String Genre;
    private Long price;
    private Long ISBN;
    private Integer year;
    private String publisher;

    public Book() {
    }

    public Book(Integer id, String name, String author, String genre, Long price, Long ISBN, Integer year, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        Genre = genre;
        this.price = price;
        this.ISBN = ISBN;
        this.year = year;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return id + " " + name +
                " " + author  +
                " " + Genre +
                " " + price +
                " " + ISBN +
                " " + year +
                " " + publisher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
