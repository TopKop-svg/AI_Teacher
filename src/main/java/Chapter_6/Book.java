package Chapter_6;

public class Book implements Printable{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        if (!title.trim().isEmpty() && !author.trim().isEmpty()
        && title != null && author != null && year > 0 && year < 100) {
            this.title = title;
            this.author = author;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }

    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + title + " by " + author + ", " + year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.trim().isEmpty() && title != null) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.trim().isEmpty() && author != null) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year < 100) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }
    }


}
