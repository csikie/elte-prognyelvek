import java.util.Iterator;

class ExtendedStringIterator implements Iterator<Character> {
    String stringToIterate;
    int counter;

    public ExtendedStringIterator(String stringToIterate) {
        this.stringToIterate = stringToIterate;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < stringToIterate.length();
    }

    @Override
    public Character next() {
        return stringToIterate.charAt(counter++);
    }

    @Override
    public void remove() {
        counter++;
    }
}