package parkour.office.groovy.model;

public class Message {
    private String quote;
    private String author;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Message{" +
                "quote='" + quote + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
