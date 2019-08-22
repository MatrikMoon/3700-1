import org.junit.*;

import static org.junit.Assert.assertEquals;
public class JUnitTests {
    @Test
    public void test_valid_findMax() {
        int[] test1 = { 0, 1, 4, 9, 6, 3 };
        assertEquals(9, Finder.findMax(test1));
    }

    @Test
    public void test_empty_findMax() {
        int[] test2 = { };
        assertEquals(0, Finder.findMax(test2));
    }

    @Test
    public void test_null_findMax() {
        int[] test3 = null;
        assertEquals(0, Finder.findMax(test3));
    }

    @Test
    public void test_valid_findMin() {
        int[] test1 = { 10, 1, 4, 9, 6, 3 };
        assertEquals(1, Finder.findMin(test1));
    }

    @Test
    public void test_empty_findMin() {
        int[] test2 = { };
        assertEquals(0, Finder.findMin(test2));
    }

    @Test
    public void test_null_findMin() {
        int[] test3 = null;
        assertEquals(0, Finder.findMin(test3));
    }
}
