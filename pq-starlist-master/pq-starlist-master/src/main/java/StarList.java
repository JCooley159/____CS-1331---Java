import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class StarList implements Iterator<Star> {

    private int size;
    private final int capacity;
    private Star[] starList;

    public StarList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.starList = new Star[capacity];
    }

    public void add(Star s) {
        if (size >= capacity) {
            throw new ArrayIndexOutOfBoundsException("List is full");
        }

        starList[size++] = s;
    }

    public Star get(int index) {
        return starList[index];
    }

    public boolean isEmpty() {
        return 0 == size;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; ++i) {
            str += starList[i].toString();
            str += "\n";
        }
        return str;
    }

    public void sortByName() {


        SortWrapper.sort(starList);
    }



    public void sortByColor() {

        SortWrapper.sort(starList, (s1, s2) -> {
             return s1.Enum.ordinal() - s2.Enum.ordinal();
        });
    }

    /* TODO: implement the required method of the Iterable<Star> interface */
    interface starListIterator extends java.util.Iterator<Star> {
        public Star next() {
        }

        public boolean hasNext() {
        }
    }


}
