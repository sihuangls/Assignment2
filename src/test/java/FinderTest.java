import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @org.junit.jupiter.api.Test
    void findMax() {
        assertNull(Finder.findMax(new int[]{}));
        assertNull(Finder.findMax(null));

        assertEquals(4, Finder.findMax( new int[] {1, 2, 3, 4}));
    }

    @org.junit.jupiter.api.Test
    void findMin() {
        assertNull(Finder.findMin(new int[]{}));
        assertNull(Finder.findMin(null));
        assertEquals(1, Finder.findMin(new int[] {1, 2, 3, 4}));
    }
}