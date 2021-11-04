public class Main {

    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.add("foo");
        bag.add("foo");
        bag.add("foo");
        bag.add("foo2");
        bag.add("foo3");

        System.out.println(bag);
        System.out.println(bag.countOf("foo"));
        bag.remove("foo");
        System.out.println(bag);
        bag.remove("foo3");
        System.out.println(bag);
        bag.remove("foo3");
    }
}