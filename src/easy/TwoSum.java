package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers <strong>numbers</strong> and an integer <strong>target</strong>,
 * return indices of the two numbers such that they add up to target.<br /><br />
 * You may assume that each input would have <strong>exactly</strong> <strong>one</strong> solution,
 * and you may not use the same element twice.<br /><br />
 * You can return the answer in any order.
 */
public class TwoSum {

    private final int sequenceNo = 1;

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

    /**
     * Time complexity o(n^2), space complexity o(n)
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoPassHashTable(int[] numbers, int target) {
        // Build a hash map of number to index list
        Map<Integer, List<Integer>> numberToIndexMap = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
            if (!numberToIndexMap.containsKey(numbers[index])) {
                numberToIndexMap.put(numbers[index], new ArrayList<>());
            }
            numberToIndexMap.get(numbers[index]).add(index);
        }
        for (int index = 0; index < numbers.length; index++) {
            int complement = target - numbers[index];
            // If the hash map contains the complement as a key
            if (numberToIndexMap.containsKey(complement)) {
                // If the complement does not equal to the actual number
                if (!numberToIndexMap.get(complement).contains(index)) {
                    return new int[]{index, numberToIndexMap.get(complement).get(0)};
                }
                // Iterate the index list of the complement and choose a pair of indices
                for (Integer complementIndex : numberToIndexMap.get(complement)) {
                    if (!complementIndex.equals(index)) {
                        return new int[]{index, complementIndex};
                    }
                }
            }
        }
        return null;
    }

    public List<int[]> extendedTwoPassHashTable(int[] numbers, int target) {
        List<int[]> resultList = new ArrayList<>();
        Map<Integer, List<Integer>> numberToIndexMap = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
            if (!numberToIndexMap.containsKey(numbers[index])) {
                numberToIndexMap.put(numbers[index], new ArrayList<>());
            }
            numberToIndexMap.get(numbers[index]).add(index);
        }
        for (int index = 0; index < numbers.length; index++) {
            int complement = target - numbers[index];
            if (numberToIndexMap.containsKey(complement)) {
                List<Integer> complementIndices = numberToIndexMap.get(complement);
                for (int complementIndexIndex = 0; complementIndexIndex < complementIndices.size(); complementIndexIndex++) {
                    int complementIndex = complementIndices.get(complementIndexIndex);
                    int[] actualPair = new int[]{index, complementIndex};
                    if (index != complementIndex && !resultList.contains(actualPair) && index < complementIndex) {
                        resultList.add(actualPair);
                    }
                }
            }
        }
        return resultList;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

}