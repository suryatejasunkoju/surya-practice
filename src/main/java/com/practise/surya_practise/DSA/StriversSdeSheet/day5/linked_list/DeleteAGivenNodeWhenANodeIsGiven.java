package com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class DeleteAGivenNodeWhenANodeIsGiven implements DsaSolutionInterface
{
    @Override
    public Pair<String> bruteForce()
    {
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.formLinkedList(input);
        LinkedListUtils.printLinkedList(head);
        int randomNodeIdx = new Random().nextInt(input.length - 1);
        ListNode node = LinkedListUtils.nodeAt(head, randomNodeIdx);
        log.info("node={}", node);

        ListNode next = node.next;
        int nextVal=next.val;
        node.next=next.next;
        node.val=nextVal;

        LinkedListUtils.printLinkedList(head);

        return Pair.of("O(1)", "O(1)");
    }

    @Override
    public Pair<String> goodApproach() {
        return null;
    }

    @Override
    public Pair<String> betterApproach() {
        return null;
    }

    @Override
    public Pair<String> bestApproach() {
        return null;
    }
}
