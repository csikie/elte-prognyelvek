import java.util.Iterator;

class ExtendedString implements Comparable<ExtendedString>, Iterable<Character> {
    String data;

    public ExtendedString(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public int compareTo(ExtendedString that) {
        return this.data.length() - that.data.length();
    }

    @Override
    public Iterator<Character> iterator() {
        return new ExtendedStringIterator(data);
    }
}