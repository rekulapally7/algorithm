package com.general;

class ListNode
{
    int val;
    ListNode next;

    ListNode()
    {
    }

    ListNode(int val)
    {
        this.val = val;
    }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

public class MergeKList
{
    public ListNode mergeKListsHelper(ListNode[] lists)
    {
        if (lists.length == 0)
        {
            return null;
        }
        if (lists.length == 1)
        {
            return lists[0];
        }
        ListNode head = null;
        ListNode nextNode = null;
        ListNode firstNode = lists[0];
        ListNode secondNode = lists[0];
        while (firstNode != null && secondNode != null)
        {
            Integer nextVal = null;
            if (firstNode.val > secondNode.val)
            {
                nextVal = secondNode.val;
                secondNode = secondNode.next;
            } else
            {
                nextVal = secondNode.val;
                firstNode = firstNode.next;
            }
            if (head == null)
            {
                head = new ListNode(nextVal);
                nextNode = head;
            } else
            {
                nextNode.next = new ListNode(nextVal);
                nextNode = nextNode.next;
            }
        }
        if(firstNode != null)
        {
            nextNode.next = firstNode;
        }
        if (secondNode != null)
        {
            nextNode.next = secondNode;
        }
        return head;
    }



}
