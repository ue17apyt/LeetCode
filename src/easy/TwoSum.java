package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers <strong>numbers</strong> and an integer <strong>target</strong>,
 * return indices of the two numbers such that they add up to target.<br /><br />
 * You may assume that each input would have <strong>exactly</strong> <strong>one</strong> solution,
 * and you may not use the same element twice.<br /><br />
 * You can return the answer in any order.
 */
public class TwoSum {

    private int sequenceNo = 1;

    /**
     * Time complexity o(n^2), space complexity o(1)
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] bruteForce(int[] numbers, int target) {
        // Iterate all elements of numbers from the very index to the second last one for the augend
        for (int augendIndex = 0; augendIndex < numbers.length - 1; augendIndex++) {
            // Iterate all elements of numbers after the augend index to the last one for the addend
            for (int addendIndex = augendIndex + 1; addendIndex < numbers.length; addendIndex++) {
                if (numbers[augendIndex] + numbers[addendIndex] == target) {
                    return new int[]{augendIndex, addendIndex};
                }
            }
        }
        return null;
    }

    public List<int[]> extendedBruteForce(int[] numbers, int target) {
        List<int[]> resultList = new ArrayList<>();
        for (int augendIndex = 0; augendIndex < numbers.length - 1; augendIndex++) {
            for (int addendIndex = augendIndex + 1; addendIndex < numbers.length; addendIndex++) {
                if (numbers[augendIndex] + numbers[addendIndex] == target) {
                    resultList.add(new int[]{augendIndex, addendIndex});
                }
            }
        }
        return resultList;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

}