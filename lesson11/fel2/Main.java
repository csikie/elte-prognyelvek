interface Reverseable {
    void reverse();
}

class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
}

class ReverseablePoint extends Point implements Reverseable {
    private int prev_x, prev_y;

    public ReverseablePoint(int x, int y) {
        super(x,y);
        prev_x = x;
        prev_y = y;
    }

    @Override
    public void setX(int x) {
        prev_x = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        prev_y = this.y;
        super.setY(y);
    }

    public void reverse() {
        x = prev_x;
        y = prev_y;
    }
}

interface Printable {
    void print();
}

class PrintablePoint extends Point implements Printable {
    public PrintablePoint(int x, int y) {
        super(x,y);
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Book implements Printable {
    private String author, title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void print() {
        System.out.println(author + ": " + title);
    }
}

// interface PrintableAndReverseable extends Printable, Reverseable {}
// class PrintableAndReverseablePoint extends Point implements PrintableAndReverseable

class PrintableAndReverseablePoint extends Point implements Printable, Reverseable {
    private int prev_x, prev_y;

    public PrintableAndReverseablePoint(int x, int y) {
        super(x,y);
        prev_x = x;
        prev_y = y;
    }

    @Override
    public void setX(int x) {
        prev_x = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        prev_y = this.y;
        super.setY(y);
    }

    public void reverse() {
        x = prev_x;
        y = prev_y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

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