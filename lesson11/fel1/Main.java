public class Main {
    public static void main(String[] args) {
        System.out.println("Books:");
        Book b1 = new PrintedBook();
        System.out.println(b1.getShortName());
        Book b2 = new PrintedBook("author", "Title", 100, CoverType.Hardcover);
        System.out.println(b2.getShortName());

        System.out.println("PrintedBook:");
        PrintedBook pb1 = new PrintedBook();
        System.out.println(pb1.getShortName());
        System.out.println(pb1.getPrice());

        System.out.println("EBook:");
        EBook eb1 = new EBook("author", "Title", 101, 200);
        System.out.println(eb1.getShortName());
        System.out.println(eb1.getPrice());

        System.out.println("createReference:");
        System.out.println(b1.createReference("article", 10, 20));
        System.out.println(b2.createReference("article", 20, 30));
        System.out.println(pb1.createReference("article", 30, 40));
        System.out.println(eb1.createReference("article", 30, 40));
        System.out.println(eb1.createReference("article", "2021"));
    }
}