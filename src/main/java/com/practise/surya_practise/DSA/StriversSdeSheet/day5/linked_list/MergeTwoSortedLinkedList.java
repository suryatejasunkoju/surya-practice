package com.practise.surya_practise.DSA.StriversSdeSheet.day5.linked_list;

import com.practise.surya_practise.DSA.StriversSdeSheet.DsaSolutionInterface;
import com.practise.surya_practise.DSA.utils.LinkedListUtils;
import com.practise.surya_practise.DSA.utils.ListNode;
import com.practise.surya_practise.DSA.utils.Pair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeTwoSortedLinkedList implements DsaSolutionInterface {

    @Override
    public Pair<String> bruteForce() {
        ListNode list1 = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode list2 = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});
        LinkedListUtils.printLinkedList(list1);
        LinkedListUtils.printLinkedList(list2);
        //add nodes of both lists into single arr & sort arr based on node's values
        //then make each node point to next from start to end of arr

        return null;
    }

    @Override
    public Pair<String> goodApproach() {
        ListNode list1 = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode list2 = LinkedListUtils.formLinkedList(new int[]{1, 2, 3, 4, 5});
        LinkedListUtils.printLinkedList(list1);
        LinkedListUtils.printLinkedList(list2);
        ListNode mergedListHead = null;
        if(list1==null){
            mergedListHead = list2;
        }
        else if(list2==null){
            mergedListHead = list1;
        }
        else
        {
            //Now both of linked lists are non empty
            ListNode prev=null, curr = null;;
            while(list1!=null && list2!=null)
            {
                if(list1.val<list2.val)
                {
                    curr = new ListNode(list1.val);
                    list1=list1.next;
                }
                else{
                    curr = new ListNode(list2.val);
                    list2=list2.next;
                }
                if(mergedListHead==null)
                {
                    mergedListHead=curr;
                    prev=curr;
                }
                else
                {
                    if(prev!=null){
                        prev.next=curr;
                    }
                    prev=curr;
                }
            }
            log.info("prev={}, curr={}", prev, curr);
            while (list1!=null)
            {
                list1=list1.next;
            }
        }
        LinkedListUtils.printLinkedList(mergedListHead);
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
