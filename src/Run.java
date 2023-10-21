public class Run {
    public static void main(String[] args){
        Author oneA = new Author("Allan","Timurovich");
        Book one = new Book("Savage",2022,oneA);
        System.out.println(one.getName() + " " + one.getYear() + " " + one.getAuthor().getName() + " " + one.getAuthor().getSurName());


        Author twoA = new Author("Boris","Akunin");
        Book two = new Book("Ves' Mir Teatr",2010,twoA);
        two.setYear(2011);
        System.out.println("two.getYear() = " + two.getYear());
        System.out.println(two.getName() + " " + two.getYear() + " " + two.getAuthor().getName() +  " " + two.getAuthor().getSurName());
    }

}
