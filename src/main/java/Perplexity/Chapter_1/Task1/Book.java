package Perplexity.Chapter_1.Task1;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return book.author.equals(this.author) && book.title.equals(this.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author) + Objects.hashCode(title);
    }
}
