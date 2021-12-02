public class Main {
    public static void foo(Printable obj) {
        obj.print();
    }

    public static void main(String[] args) {
        Book b = new Book("author", "Title");
        PrintablePoint p1 = new PrintablePoint(2,3);

        ReverseablePoint p2 = new ReverseablePoint(2,3);
        System.out.println("x=" + p2.getX());
        p2.setX(10);
        System.out.println("x=" + p2.getX());
        p2.reverse();
        System.out.println("x=" + p2.getX());

        foo(b);
        foo(p1);

        PrintableAndReverseablePoint p3 = new PrintableAndReverseablePoint(2,5);
        System.out.println("x=" + p3.getX());
        p3.setX(10);
        System.out.println("x=" + p3.getX());
        p3.reverse();
        System.out.println("x=" + p3.getX());
        foo(p3);
    }
}