package basics;

public class Sept17Book {
    String title;
    String author;
    int yearPublished;

    public static void main(String[] args) {
        Sept17Book obj1 = new Sept17Book();
        obj1.yearPublished = 1998;
        obj1.author = "Nixon";
        obj1.title = "1999 winning";
        System.out.println(obj1.toString());  //will include @hashCode
        Sept17Book obj2 = new Sept17Book();
        obj2.yearPublished = 2018;
        System.out.println(findBook(obj1.title));
        obj2.author = "Andy Weir";
        System.out.println(findBook(obj2.author));
    }

    public static String findBook (String author) {
        return author.toUpperCase();
    }

}
