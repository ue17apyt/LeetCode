package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();
    private int[] numbers1 = {1, 5, 3, 8, 7, 2, 6, 4};
    private int target1 = 9;
    private int[] numbers2 = {8, 4, 2, 7, 5, 3, 4, 6, 1};
    private int target2 = 8;

    @Test
    public void testBruteForce() {
        assertArrayEquals(new int[]{0, 3}, twoSum.bruteForce(numbers1, target1));
        assertArrayEquals(new int[]{1, 6}, twoSum.bruteForce(numbers2, target2));
    }

    @Test
    public void testExtendedBruteForce() {
        assertArrayEquals(new int[]{0, 3}, twoSum.extendedBruteForce(numbers1, target1).get(0));
        assertArrayEquals(new int[]{1, 7}, twoSum.extendedBruteForce(numbers1, target1).get(1));
        assertArrayEquals(new int[]{2, 6}, twoSum.extendedBruteForce(numbers1, target1).get(2));
        assertArrayEquals(new int[]{4, 5}, twoSum.extendedBruteForce(numbers1, target1).get(3));
        assertArrayEquals(new int[]{1, 6}, twoSum.extendedBruteForce(numbers2, target2).get(0));
        assertArrayEquals(new int[]{2, 7}, twoSum.extendedBruteForce(numbers2, target2).get(1));
        assertArrayEquals(new int[]{3, 8}, twoSum.extendedBruteForce(numbers2, target2).get(2));
        assertArrayEquals(new int[]{4, 5}, twoSum.extendedBruteForce(numbers2, target2).get(3));
    }

    @Test
    public void testGetSequenceNo() {
        assertEquals(1, twoSum.getSequenceNo());
    }

}