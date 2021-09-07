/* This class is for grading convenience
 * DO NOT modify or delete this class */

import java.util.Arrays;
import java.util.Comparator;

public class SortWrapper {
    private static Class<? extends Comparator> comparatorClass;

    public static Class<? extends Comparator> getComparatorClass() {
        return comparatorClass;
    }

    public static void sort(Star[] array) {
        Arrays.sort(array);
    }

    public static void sort(Star[] array, Comparator<? super Star> c) {
        comparatorClass = c.getClass();
        Arrays.<Star>sort(array, c);
    }
}
