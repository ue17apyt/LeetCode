package medium;

import java.util.Objects;

/**
 * You are given two non-empty linked lists representing two non-negative integers. <br />
 * The digits are stored in reverse order, and each of their nodes contains a single digit. <br />
 * Add the two numbers and return the sum as a unidirectional linked list. <br />
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 */
public class ListNode {

    private int sequenceNo = 2;
    private int value;
    private ListNode next;

    public ListNode() {

    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Time complexity o(max(augend.length, addend.length))
     * Space complexity o(max(augend.length, addend.length) + 1)
     */
    public ListNode addTwoNumbersAsElementaryMathematics(ListNode augendNode, ListNode addendNode) {

        ListNode dummyHeadNode = new ListNode(0);
        ListNode tempAugendNode = augendNode;
        ListNode tempAddendNode = addendNode;
        ListNode tempSumNode = dummyHeadNode;
        int carry = 0;

        // If both the augend and the addend are of different lengths
        // complement the shorter node list with leading 0
        while (Objects.nonNull(tempAugendNode) || Objects.nonNull(tempAddendNode)) {
            int augend = Objects.nonNull(tempAugendNode) ? tempAugendNode.value : 0;
            int addend = Objects.nonNull(tempAddendNode) ? tempAddendNode.value : 0;
            int sum = augend + addend + carry;
            carry = sum / 10;
            tempSumNode.next = new ListNode(sum % 10);
            // All augend, addend and sum move to the next digit
            tempSumNode = tempSumNode.next;
            if (Objects.nonNull(tempAugendNode)) {
                tempAugendNode = tempAugendNode.next;
            }
            if (Objects.nonNull(tempAddendNode)) {
                tempAddendNode = tempAddendNode.next;
            }
        }

        // The sum of the augend and the addend can have more digit for the augend and the addend
        if (carry > 0) {
            tempSumNode.next = new ListNode(carry);
        }

        return dummyHeadNode.next;

    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

}