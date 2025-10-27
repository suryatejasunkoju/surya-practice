package com.practise.surya_practise.DSA.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListUtils
{
    public static void printLinkedList(ListNode head)
    {
        StringBuilder sb=new StringBuilder();
        while(head!=null)
        {
            sb.append("->");
            sb.append(head.val);
            head=head.next;
        }
        log.info(sb.toString());
    }

    public static ListNode formLinkedList(int[] arr)
    {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++)
        {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static ListNode nodeAt(ListNode head, int randomNodeIdx)
    {
        if (head == null || randomNodeIdx < 0){
            return null;
        }
        ListNode current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < randomNodeIdx)
        {
            current = current.next;
            currentIndex++;
        }
        return current;
    }
}
