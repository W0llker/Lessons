package KataTrening.Kata6.Difference_of_2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void sample_Tests() {
        assertArrayEquals(new int[][] {{1,3},{2,4}}, Difference_of_2.twosDifference(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[][]{{1, 3}, {4, 6}}, Difference_of_2.twosDifference(new int[]{1, 3, 4, 6}));
        assertArrayEquals(new int[][]{{1,3},{3,5},{6,8},{8,10},{10,12},{12,14}}, Difference_of_2.twosDifference(new int[]{1,3,5,6,8,10,15,32,12,14,56}));
    }
}
