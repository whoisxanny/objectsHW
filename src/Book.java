import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(String name,int year,Author author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + ". year of publication - " + year + ". Author: " + author.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.getName()) && Objects.equals(year, book.getYear());
    }



    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,year);
    }
}


