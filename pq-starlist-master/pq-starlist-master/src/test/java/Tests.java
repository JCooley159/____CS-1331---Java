import static org.junit.Assert.*;
import static org.junit.Assume.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.lang.reflect.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import java.util.regex.Pattern;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests {
    
    private static final List<Star> STARS = Arrays.asList(
        new Star("Aquarius", Star.Color.ORANGE, 0),
        new Star("Canis Minor", Star.Color.WHITE, 0),
        new Star("Eridanus", Star.Color.YELLOW, 0),
        new Star("Cancer", Star.Color.RED, 0),
        new Star("Bootes", Star.Color.BLUE, 0));


    /* Problem 1: Provide a natural ordering for Star */

    @Test
    public void starIsComparable() {
        // TODO: make sure Comparable interface is type parameterized
        try {
            assertTrue("-5 Star does not implement Comparable",
                Arrays.asList(Class.forName("Star").getInterfaces()).contains(Comparable.class));
        } catch (ClassNotFoundException e) {
            fail("-5 Star class doesn't exist, can't check if it is Comparable");
        }
    }

    @Test
    public void starImplementsTypeParameterizedComparable() {
        try {
            Type comparableInterface = Class.forName("Star")
                .getGenericInterfaces()[0];
            if (comparableInterface instanceof ParameterizedType) {
                assertEquals("-5 Star implements Comparable, but it is"
                    + " type-parameterized to "
                    + ((ParameterizedType) comparableInterface)
                        .getActualTypeArguments()[0]
                    + " instead of Star",
                    Class.forName("Star"),
                    ((ParameterizedType) comparableInterface)
                        .getActualTypeArguments()[0]);
            } else {
                fail("-5 Star implements Comparable, but it is"
                    + " not type-parameterized to only be compared to other"
                    + " Stars");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            fail("-5 Star class doen't implement Comparable, can't check"
                + " if it is type-parameterized.");
        } catch (ClassNotFoundException e) {
            fail("-5 Star class doesn't exist, can't check if Comparable is "
                + "type parameterized");
        }
    }

    @Test
    public void starCompareTo() {
        try {
            Method compareTo = Star.class.getMethod("compareTo", Star.class);

            for (Star s1 : STARS) {
                for (Star s2 : STARS) {
                    assertEquals("-5 Star compareTo is incorrect",
                        s1.getName().compareTo(s2.getName()),
                        (int) compareTo.invoke(s1, s2));
                }
            }

        } catch (ClassCastException e) {
            fail("-5 Star compareTo should return an int");
        } catch (NoSuchMethodException | IllegalAccessException
            | InvocationTargetException e) {
            fail("-5 Star compareTo method not found");
        }
    }

    @Test
    public void sortByName() {
        StarList starList = new StarList(STARS.size());
        STARS.forEach(starList::add);
        List<Star> sortedStars = Arrays.asList(
            new Star("Aquarius", Star.Color.ORANGE, 0),
            new Star("Bootes", Star.Color.BLUE, 0),
            new Star("Cancer", Star.Color.RED, 0),
            new Star("Canis Minor", Star.Color.WHITE, 0),
            new Star("Eridanus", Star.Color.YELLOW, 0));
        
        starList.sortByName();

        for (int i = 0; i < sortedStars.size(); i++) {
            assertEquals("-5 sortByName sorts list incorrectly",
                sortedStars.get(i), starList.get(i));
        }
    }

    /* Problem 2: sortByColor */
    
    @Test
    public void sortByColor() {
        StarList starList = new StarList(STARS.size());
        STARS.forEach(starList::add);
        List<Star> sortedStars = Arrays.asList(
            new Star("Cancer", Star.Color.RED, 0),
            new Star("Aquarius", Star.Color.ORANGE, 0),
            new Star("Eridanus", Star.Color.YELLOW, 0),
            new Star("Canis Minor", Star.Color.WHITE, 0),
            new Star("Bootes", Star.Color.BLUE, 0));
        
        starList.sortByColor();

        for (int i = 0; i < sortedStars.size(); i++) {
            assertEquals("-20 sortByColor sorts list incorrectly",
                sortedStars.get(i), starList.get(i));
        }
    }

    @Test
    public void sortByColorUsesLambda() {
        StarList starList = new StarList(STARS.size());
        STARS.forEach(starList::add);
        starList.sortByColor();
        assertTrue("-10 sortByColor does not use a lambda expression",
            SortWrapper.getComparatorClass() != null && Pattern
                .matches("StarList\\$\\$Lambda\\$\\d/\\d+", SortWrapper
                .getComparatorClass().getName()));
    }

    /* Problem 3: StarIterator */
    
    public Class<?> getStarIterator() {
        try {
            return Class.forName("StarList$StarIterator");
        } catch (ClassNotFoundException e) {
            try {
                return Class.forName("StarIterator");
            } catch (ClassNotFoundException e2) {
                return null;
            }
        }

    }

    @Test
    public void starIteratorExists() {
        assertTrue("-10 No StarIterator class found",
            getStarIterator() != null);
    }


    @Test
    public void starIteratorIsInnerClass() {
        assumeTrue(getStarIterator() != null);
        assertTrue("-5 StarIterator is not an inner class",
            Arrays.asList(StarList.class.getDeclaredClasses())
            .contains(getStarIterator()));
    }

    @Test
    public void starIteratorImplementsIterator() {
        assumeTrue(getStarIterator() != null);
        assertTrue("-5 StarIterator should implement the Iterator interface",
            Arrays.asList(getStarIterator().getInterfaces()).contains(
                Iterator.class));
    }

    @Test
    public void listIteratorTypeParameterizedIterator() {
        assumeTrue(getStarIterator() != null);
        assumeTrue(Arrays.asList(getStarIterator().getInterfaces()).contains(
                Iterator.class));
        try {
            Type iteratorInterface = getStarIterator()
                .getGenericInterfaces()[0];
            if (iteratorInterface instanceof ParameterizedType) {
                assertEquals("-5 StarIterator implements Iterator, but it is"
                    + " type-parameterized to "
                    + ((ParameterizedType) iteratorInterface)
                        .getActualTypeArguments()[0]
                    + " instead of Star",
                    Class.forName("Star"),
                    ((ParameterizedType) iteratorInterface)
                        .getActualTypeArguments()[0]);
            } else {
                fail("-5 StarIterator implements Iterator, but it is"
                    + " not type-parameterized to only be an iterator for"
                    + " Stars");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            fail("-5 StarIterator class doen't implement Iterator, can't check"
                + " if it is type-parameterized.");
        } catch (ClassNotFoundException e) {
            fail("-5 StarIterator class doesn't exist, can't check if Iterator is "
                + "type parameterized");
        }
    }



    /* Problem 4: Iterable / iterator() */

    @Test
    public void isIterable() {
        assertTrue("-10 StarList is not Iterable",
            Arrays.asList(StarList.class.getInterfaces()).contains(
                Iterable.class));
    }

    @Test
    public void starListImplementsTypeParameterizedIterable() {
        assumeTrue(Arrays.asList(StarList.class.getInterfaces()).contains(
                Iterable.class));
        try {
            Type iterableInterface = Class.forName("StarList")
                .getGenericInterfaces()[0];
            if (iterableInterface instanceof ParameterizedType) {
                assertEquals("-5 StarList implements Iterable, but it is"
                    + " type-parameterized to "
                    + ((ParameterizedType) iterableInterface)
                        .getActualTypeArguments()[0]
                    + " instead of Star",
                    Class.forName("Star"),
                    ((ParameterizedType) iterableInterface)
                        .getActualTypeArguments()[0]);
            } else {
                fail("-5 StarList implements Iterable, but it is"
                    + " not type-parameterized to only be iterable over "
                    + " Stars");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            fail("-5 StarList class doen't implement Iterable, can't check"
                + " if it is type-parameterized.");
        } catch (ClassNotFoundException e) {
            fail("-5 StarList class doesn't exist, can't check if Iterable is "
                + "type parameterized");
        }
    }



    @Test
    public void hasIteratorMethod() {
        StarList starList = new StarList(STARS.size());
        try {
            Method iteratorMeth = StarList.class.getMethod("iterator");
            Iterator iterator = (Iterator) iteratorMeth.invoke(starList);

            // TODO: check type parameterized?
        } catch (ClassCastException e) {
            fail("-10 iterator() doesn't return an Iterator");
        } catch (Exception e) {
            fail("-10 does not have an iterator() method");
        }
    }

    @Test
    public void iteratorHasNext() {
        try {
            StarList starList = new StarList(STARS.size());
            STARS.forEach(starList::add);
            Method iteratorMeth = StarList.class.getMethod("iterator");
            Iterator iterator = (Iterator) iteratorMeth.invoke(starList);

            for (int i = 0; i < STARS.size(); i++) {
                assertTrue("-10 iterator's hasNext returns incorrect values",
                    iterator.hasNext());
            }
        } catch (Exception e) {
            fail("-10 Can't find iterator method to test hasNext");
        }
    }

    @Test
    public void iteratorNext() {
        try {
            StarList starList = new StarList(STARS.size());
            STARS.forEach(starList::add);
            Method iteratorMeth = StarList.class.getMethod("iterator");
            Iterator iterator = (Iterator) iteratorMeth.invoke(starList);

            for (int i = 0; i < STARS.size(); i++) {
                assertEquals("-10 iterator's next returns incorrect values",
                    starList.get(i),
                    iterator.next());
            }
        } catch (Exception e) {
            fail("-10 Can't find iterator method to test next");
        }
    }
}
