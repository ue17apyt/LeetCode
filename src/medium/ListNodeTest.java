package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListNodeTest {

    private ListNode testListNode;
    private ListNode sumNode;
    private ListNode augendNode1;
    private ListNode addendNode1;
    private ListNode augendNode2;
    private ListNode addendNode2;
    private ListNode augendNode3;
    private ListNode addendNode3;

    @BeforeEach
    public void setup() {
        testListNode = new ListNode();
        augendNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        addendNode1 = new ListNode(5, new ListNode(6, new ListNode(4)));
        augendNode2 = new ListNode(0);
        addendNode2 = new ListNode(0);
        augendNode3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        addendNode3 = new ListNode(9, new ListNode(9, new ListNode(9)));
    }

    @Test
    public void testAddTwoNumbersAsElementaryMathematics() {
        System.out.println("Add Two Numbers as Elementary Mathematics ...");
        long startTimestamp = System.nanoTime();
        sumNode = testListNode.addTwoNumbersAsElementaryMathematics(augendNode1, addendNode1);
        long endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 1: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        assertEquals(7, sumNode.getValue());
        assertEquals(0, sumNode.getNext().getValue());
        assertEquals(8, sumNode.getNext().getNext().getValue());
        startTimestamp = System.nanoTime();
        sumNode = testListNode.addTwoNumbersAsElementaryMathematics(augendNode2, addendNode2);
        endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 2: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        assertEquals(0, sumNode.getValue());
        startTimestamp = System.nanoTime();
        sumNode = testListNode.addTwoNumbersAsElementaryMathematics(augendNode3, addendNode3);
        endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 3: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        assertEquals(8, sumNode.getValue());
        assertEquals(9, sumNode.getNext().getValue());
        assertEquals(9, sumNode.getNext().getNext().getValue());
        assertEquals(0, sumNode.getNext().getNext().getNext().getValue());
        assertEquals(0, sumNode.getNext().getNext().getNext().getNext().getValue());
        assertEquals(1, sumNode.getNext().getNext().getNext().getNext().getNext().getValue());
    }

    @Test
    public void testAddTwoNumbersRecursively() {
        System.out.println("Add Two Numbers Recursively ...");
        long startTimestamp = System.nanoTime();
        sumNode = testListNode.addTwoNumbersRecursively(augendNode1, addendNode1);
        long endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 1: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        assertEquals(7, sumNode.getValue());
        assertEquals(0, sumNode.getNext().getValue());
        assertEquals(8, sumNode.getNext().getNext().getValue());
        startTimestamp = System.nanoTime();
        sumNode = testListNode.addTwoNumbersRecursively(augendNode2, addendNode2);
        endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 2: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        assertEquals(0, sumNode.getValue());
        startTimestamp = System.nanoTime();
        sumNode = testListNode.addTwoNumbersRecursively(augendNode3, addendNode3);
        endTimestamp = System.nanoTime();
        System.out.println("Execution Time of Test Case 3: " + (endTimestamp - startTimestamp) + " Nanoseconds");
        assertEquals(8, sumNode.getValue());
        assertEquals(9, sumNode.getNext().getValue());
        assertEquals(9, sumNode.getNext().getNext().getValue());
        assertEquals(0, sumNode.getNext().getNext().getNext().getValue());
        assertEquals(0, sumNode.getNext().getNext().getNext().getNext().getValue());
        assertEquals(1, sumNode.getNext().getNext().getNext().getNext().getNext().getValue());
    }

    @Test
    public void testGetSequenceNo() {
        assertEquals(2, testListNode.getSequenceNo());
    }

}