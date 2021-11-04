import java.util.Map;
import java.util.HashMap;

public class Bag<T> {
    private final Map<T, Integer> map = new HashMap<>();

    public void add(T elem) {
        int count = 1;

        Integer currentCount = map.get(elem);
        if (currentCount != null) {
            count = currentCount + 1;
        }

        map.put(elem, count);        
    }

    public int countOf(T elem) {
        Integer currentCount = map.get(elem);
        if (currentCount != null) {
            return currentCount;
        } else {
            return 0;
        }
    }

    public void remove(T elem) {
        Integer currentCount = map.get(elem);

        if (currentCount == null) {
            throw new IllegalArgumentException("Elem: " + elem + "nincs a zsakban.");
        }
        if (currentCount == 1) {
            map.remove(elem);
        } else {
            map.put(elem, currentCount - 1);
        }
    }

    public String toString() {
        return map.toString();
    }
}