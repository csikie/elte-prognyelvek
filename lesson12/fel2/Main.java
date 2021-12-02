import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList<>();
        list.add(new Point (2,3));
        list.add(new Point (-2,-3));
        list.add(new Point (-2,3));
        list.add(new Point (1,3));
        list.add(new Point (0,0));
        list.add(new Point (5,-10));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}