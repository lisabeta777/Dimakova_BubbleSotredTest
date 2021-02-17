import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortedTest {

    @Test
    public void SimpleTest() {
        int Array[] = {1, 4, 9, 5, 3};
        BubbleSorted.sort(Array);
        int SortedArray[] = {1, 3, 4, 5, 9};
        Assertions.assertArrayEquals(SortedArray, Array);
    }

    @Test
    public void ZeroTest() {
        int Array[] = {0, 0, 0};
        BubbleSorted.sort(Array);
        int SortedArray[] = {0, 0, 0};
        Assertions.assertArrayEquals(SortedArray, Array);
    }

    @Test
    public void NegativeTest() {
        int Array[] = {-1, 5, -8, -9, 9};
        BubbleSorted.sort(Array);
        int SortedArray[] = {-9, -8, -1, 5, 9};
        Assertions.assertArrayEquals(SortedArray, Array);
    }

    @Test
    public void NullTest() {
        int Array[] = {};
        BubbleSorted.sort(Array);
        int SortedArray[] = {};
        Assertions.assertArrayEquals(SortedArray, Array);
    }

    @Test
    public void PlusTest() {
        int Array[] = {-9221, +9221, 45, -98, 9221};
        BubbleSorted.sort(Array);
        int SortedArray[] = {-9221, -98, 45, 9221, +9221};
        Assertions.assertArrayEquals(SortedArray, Array);
    }
}
