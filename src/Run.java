public class Run {
    public static void main(String[] args){
        Author oneA = new Author("Allan","Timurovich");
        Book one = new Book("Savage",2022,oneA);
        System.out.println("FirstBook: " + one);

        Author twoA = new Author("Boris","Akunin");
        Book two = new Book("Ves' Mir Teatr",2010,twoA);
        two.setYear(2011);
        System.out.println("two.getYear() = " + two.getYear());
        System.out.println("secondBook: " + two);

        System.out.println("two.equals(one()) = " + two.equals(one));
        System.out.println("two.equals(one()) = " + twoA.equals(oneA));

        System.out.println("two.hashCode() = " + two.hashCode());
        System.out.println("twoA.hashCode() = " + twoA.hashCode());
    }

}
