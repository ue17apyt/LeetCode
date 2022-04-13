package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private static final String TEST_STRING_1 = "abcabcbb";
    private static final String TEST_STRING_2 = "bbbbb";
    private static final String TEST_STRING_3 = "pwwkew";

    private LongestSubstringWithoutRepeatingCharacters testLongestSubstringWithoutRepeatingCharacters =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void testBruteForceSearchLengthOfLongestSubstringWithoutRepeatingCharacters() {
        long startTimestamp = System.nanoTime();
        assertEquals(3,
                testLongestSubstringWithoutRepeatingCharacters
                        .bruteForceSearchLengthOfLongestSubstringWithoutRepeatingCharacters(TEST_STRING_1));
        long endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 1: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        startTimestamp = System.nanoTime();
        assertEquals(1,
                testLongestSubstringWithoutRepeatingCharacters
                        .bruteForceSearchLengthOfLongestSubstringWithoutRepeatingCharacters(TEST_STRING_2));
        endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 2: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        startTimestamp = System.nanoTime();
        assertEquals(3,
                testLongestSubstringWithoutRepeatingCharacters
                        .bruteForceSearchLengthOfLongestSubstringWithoutRepeatingCharacters(TEST_STRING_3));
        endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 3: " + (endTimestamp - startTimestamp) + " Nanoseconds");
    }

    @Test
    public void testGetSequenceNo() {
        assertEquals(1, testLongestSubstringWithoutRepeatingCharacters.getSequenceNo());
    }

}