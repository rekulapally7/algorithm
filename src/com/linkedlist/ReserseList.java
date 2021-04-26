package com.linkedlist;


public class ReserseList
{

    public static void main(String[] args)
    {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode newRoot = new ReserseList().reverseRecNode(root,null);
        while (newRoot != null)
        {
            System.out.println(newRoot.val);
            newRoot = newRoot.next;
        }
    }


    public ListNode reverseRecNode(ListNode root,ListNode prev)
    {
        if (root == null)
            return null;
        reverseRecNode(root.next,root);
        root.next=prev;
        return root;
    }


    public ListNode reverseNode(ListNode root)
    {
        if (root == null)
            return null;
        ListNode prevNode = null;
        while (root != null)
        {
            ListNode nextNode = root.next;
            root.next = prevNode;
            prevNode = root;
            root = nextNode;
        }
        return prevNode;
    }

    static class ListNode
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


}
