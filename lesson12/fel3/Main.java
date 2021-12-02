import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ExtendedString temp1 = new ExtendedString("Java java");

        Iterator<Character> it = temp1.iterator();

        while (it.hasNext()) {
            char ch = it.next();
            System.out.println(ch);
        }
    }
}