import java.util.ArrayList;
import java.util.Iterator;

public class MyAnimeList implements Iterable<Anime> {
    private ArrayList<Anime> animeList;

    public MyAnimeList() {
        animeList = new ArrayList<Anime>();
    }

    public void add(Anime a) {
        animeList.add(a);
    }

    public String toString() {
        return animeList.toString();
    }

    /*
     * TODO: YOUR CODE BELOW
     * Fill out the method body. It should only have one line.
     **/
    public void sortByName() {
    }

    /*
     * TODO: YOUR CODE BELOW
     * Fill out the method body. It should only have at most two line.
     **/
    public void sortByYear() {
    }

    /*
     * TODO: YOUR CODE BELOW
     * change method body to return new AnimeIterator() after
     * implementing AnimeIterator.
     **/
    public Iterator<Anime> iterator() {
        return null;
    }

    private class AnimeIterator implements Iterator<Anime> {
        //TODO: YOUR CODE BELOW
        private int cursor;

        public boolean hasNext() {
            //TODO: YOUR CODE BELOW
            return true;
        }

        public Anime next() {
            //TODO: YOUR CODE BELOW
            return null;
        }

        public void remove() {
            //TODO: YOUR CODE BELOW
        }
    }
}