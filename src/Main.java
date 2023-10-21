public class Main {
    public static void main(String[] args) {
        Author oneA = new Author("Allan","Timurovich");
        Book one = new Book("Savage",2022,oneA);
        System.out.println(one.getName());
        System.out.println(one.getYear());

        Author twoA = new Author("Boris","Akunin");
        Book two = new Book("Ves' Mir Teatr",2010,twoA);
        two.setYear(2011);
        System.out.println("two.getYear() = " + two.getYear());


    }
}