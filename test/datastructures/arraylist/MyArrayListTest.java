package datastructures.arraylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void testAddMethodShouldIncreaseTheSizeOfTheList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("sdsdf");
        myArrayList.add("dsdf");
        myArrayList.add("hello");

        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testToString() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("world");
        myArrayList.add("hello");
        myArrayList.add("gat");
        assertEquals("[world, hello, gat]", myArrayList.toString());
    }

    @Test
    public void testGetMethodShouldReturnTheValueOfTheNodeOnTheSpecifiedIndex() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("world");
        myArrayList.add("people");
        myArrayList.add("hello");

        assertEquals("world", myArrayList.get(0));
        assertEquals("people", myArrayList.get(1));
        assertEquals("hello", myArrayList.get(2));
    }


    @Test
    public void testContainsShouldReturnTrueIfExists() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("world");
        myArrayList.add("people");
        myArrayList.add("hello");

        assertFalse(myArrayList.contains("hola"));
        assertTrue(myArrayList.contains("people"));
    }


    @Test
    public void testClearArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("world");
        myArrayList.add("people");
        myArrayList.add("hello");

        assertEquals(3, myArrayList.size());
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }

    @Test
    public void testRemoveElementInTheMiddleOfTheList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("people");
        myArrayList.add("hello");
        myArrayList.add("world");

        assertEquals(3, myArrayList.size());
        assertEquals("hello", myArrayList.get(1));

        assertTrue(myArrayList.remove("hello"));

        assertEquals(2, myArrayList.size());
        assertEquals("world", myArrayList.get(1));
    }

    @Test
    public void testRemoveFirstElement() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("people");
        myArrayList.add("hello");
        myArrayList.add("world");

        assertEquals(3, myArrayList.size());
        assertEquals("people", myArrayList.get(0));

        assertTrue(myArrayList.remove("people"));

        assertEquals(2, myArrayList.size());
        assertEquals("hello", myArrayList.get(0));
    }

    @Test
    public void testRemoveLastElement() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("people");
        myArrayList.add("hello");
        myArrayList.add("world");

        assertEquals(3, myArrayList.size());
        assertEquals("world", myArrayList.get(2));

        assertTrue(myArrayList.remove("world"));

        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testRemoveNonExistentElement() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("people");
        myArrayList.add("hello");
        myArrayList.add("world");

        assertEquals(3, myArrayList.size());

        assertFalse(myArrayList.remove("worlds"));

        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testRemoveTheOnlyElement() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("people");

        assertEquals(1, myArrayList.size());

        assertTrue(myArrayList.remove("people"));

        assertEquals(0, myArrayList.size());
    }
}
