package lesson21;

import extend.RubberArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RubberArrayTest {

    @Test
    // Test adding elements to the array and getting them by index
    public void testGet() {
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        Assertions.assertEquals(10, ra.get(0));
        Assertions.assertEquals(20, ra.get(1));
    }
    @Test
    public void testAddByIndex() {
        // Test adding an element at a specific index
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        ra.add(1, 1);
        Assertions.assertEquals(1, ra.get(1));
        Assertions.assertEquals(20, ra.get(2));
    }

    @Test
    public void testRemove() {
        // Test removing an element at a specific index
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        ra.add(30);
        ra.remove(1);
        Assertions.assertEquals(10, ra.get(0));
        Assertions.assertEquals(30, ra.get(1));
    }

    @Test
    public void testContains() {
        // Test checking if an element exists in the array
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        ra.add(30);
        Assertions.assertTrue(ra.contains(20));
        Assertions.assertFalse(ra.contains(40));
    }

    @Test
    public void testIndexOf() {
        // Test finding the index of an element in the array
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        ra.add(30);
        Assertions.assertEquals(1, ra.indexOf(20));
        Assertions. assertEquals(-1, ra.indexOf(40));
    }

    @Test
    public void testToString() {
        // Test converting the array to a string representation
        RubberArray ra = new RubberArray();
        ra.add(10);
        ra.add(20);
        ra.add(30);
        Assertions.assertEquals("[10, 20, 30]", ra.toString());
    }
}

