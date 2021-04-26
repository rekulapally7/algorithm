package com.general;

import java.util.Stack;

public class AddLInkedList
{

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        Stack<Integer> storeFirstNum = new Stack<>();
        while (l1 != null)
        {
            storeFirstNum.push(l1.val);
            l1 = l1.next;
        }

        Stack<Integer> storeCecondNum = new Stack<>();
        while (l2 != null)
        {
            storeCecondNum.push(l2.val);
            l2 = l2.next;
        }
        StringBuffer finalNUm = new StringBuffer();
        int remainder = 0;
        while (!storeFirstNum.isEmpty() && !storeCecondNum.isEmpty())
        {
            int firstNum = storeFirstNum.pop();
            int secondNum = storeCecondNum.pop();
            int sum = firstNum + secondNum + remainder;
            finalNUm.append(sum % 10);
            remainder = sum / 10;
        }
        while (!storeFirstNum.isEmpty())
        {
            finalNUm.append(storeFirstNum.pop());
        }

        while (!storeCecondNum.isEmpty())
        {
            finalNUm.append(storeCecondNum.pop());
        }
        String finalNumber = finalNUm.toString();
        ListNode headNode=null;
        ListNode currentNode=null;
        for (int i = finalNUm.length() - 1; i > 0; i--)
        {
            if(headNode==null)
            {
                headNode=new ListNode(Integer.parseInt(finalNUm.charAt(i)+""));
                currentNode=headNode;
            }
            else
            {
                ListNode nextNode=new ListNode(Integer.parseInt(finalNUm.charAt(i)+""));
                currentNode.next=nextNode;
                currentNode=currentNode.next;
            }
        }
        return headNode;
    }

}
