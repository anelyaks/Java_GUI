import java.io.Serializable;
import java.util.ArrayList;

public class Request implements Serializable {
    private Book book;
    private String operationType;
    private ArrayList<Book> books;
    private Integer id;
    private String attribute;
    private String wordBefore;
    private String wordAfter;
    public Request() {
    }

    public Request(String operationType, Integer id) {//delete
        this.operationType = operationType;
        this.id = id;
    }

    public Request(String operationType, String attribute, String wordBefore, String wordAfter) {//update
        this.operationType = operationType;
        this.attribute= attribute;
        this.wordBefore = wordBefore;
        this.wordAfter = wordAfter;
    }

    public Request(String operationType, Book book) {
        this.book = book;
        this.operationType = operationType;
    }

    public Request(String operationType) {//// Client: LIST
        this.operationType = operationType;
    }

    public Request(String operationType, ArrayList<Book> books) {////CLient: ADD
        this.operationType = operationType;
        this.books = books;
    }

    public Request(ArrayList<Book> books) {//// Server: answer to Client
        this.books = books;
    }

    public Book getBook() {
        return book;
    }

    public String getOperationType() {
        return operationType;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Integer getId() {
        return id;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getWordBefore() {
        return wordBefore;
    }

    public String getWordAfter() {
        return wordAfter;
    }
}
