package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    private final int sequenceNo = 3;

    /**
     * Time complexity O(n^3), space complexity O(minimum(stringSize, alphabetSize))
     *
     * @param string
     * @return
     */
    public int bruteForceSearchLengthOfLongestSubstringWithoutRepeatingCharacters(String string) {
        int length = string.length();
        int maximumValue = 0;
        for (int startIndex = 0; startIndex < length; startIndex++) {
            for (int endIndex = startIndex; endIndex < length; endIndex++) {
                if (checkAlphabetRepetition(string, startIndex, endIndex)) {
                    maximumValue = Math.max(maximumValue, endIndex - startIndex + 1);
                }
            }
        }
        return maximumValue;
    }

    private boolean checkAlphabetRepetition(String string, int start, int end) {
        Map<Character, Integer> characterToIntegerMap = new HashMap<>();
        for (int index = start; index <= end; index++) {
            Character character = Character.valueOf(string.charAt(index));
            characterToIntegerMap.put(character,
                    characterToIntegerMap.containsKey(character) ?
                            Integer.valueOf(characterToIntegerMap.get(character).intValue() + 1) : Integer.valueOf(1));
            if (characterToIntegerMap.get(character).intValue() > 1) {
                return false;
            }
        }
        return true;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

}