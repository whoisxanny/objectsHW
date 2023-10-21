import java.util.Objects;

public class Author {
    private String surName;
    private String name;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }


    @Override
    public String toString() {
        return surName + "  " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.getName()) && Objects.equals(surName, author.getSurName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,surName);
    }
}
