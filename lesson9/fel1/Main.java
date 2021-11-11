import java.util.Arrays;

public class Main {
    public static <T> void swap(T[] t, int i, int j) {
        T temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 3, 5, 9, 7};
        System.out.println(Arrays.toString(array1));
        swap(array1, 3, 4);
        System.out.println(Arrays.toString(array1));

        Double[] array2 = {1.5, 3.6, 5.1, 9.9, 7.3};
        System.out.println(Arrays.toString(array2));
        swap(array2, 3, 4);
        System.out.println(Arrays.toString(array2));
    }
}