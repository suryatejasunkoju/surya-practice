package com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseALinkedList  implements DsaSolutionInterface {
    @Override
    public Pair<String> bruteForce()
    {
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.formLinkedList(input);
        LinkedListUtils.printLinkedList(head);
        ListNode reversedHead=null;
        if(head==null || head.next==null)
        {
            reversedHead=head;
        }
        else
        {
            ListNode prev=null, nextNode=null;
            while(head!=null)
            {
                nextNode=head.next;
                head.next=prev;
                prev=head;
                head=nextNode;
                log.info("nextNode="+nextNode+",prev="+prev+",head="+head);
            }
            reversedHead=prev;
        }
        LinkedListUtils.printLinkedList(reversedHead);
        return null;
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
