package com.binarytree;

import java.util.*;

public class FindAvgOfBinaryTreeLevel
{

   static List<Integer> binaryTreeAvgATLevel(Node root)
    {
        List<Integer> binaryTreeResults=new ArrayList<>();
        Queue<Node> bfs=new LinkedList();
        bfs.add(root);


        while(!bfs.isEmpty())
        {
           long sum=0;
           int count=bfs.size();
           for (int i=0;i<count;i++)
           {
               Node temp= bfs.remove();
               sum+=temp.val;
               if(null!=temp.right)
               {
                   bfs.add(temp.right);
               }
               if(null!=temp.left)
               {
                   bfs.add(temp.left);
               }
           }
            binaryTreeResults.add(Math.round(sum/count));

        }
        return binaryTreeResults;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left = new Node(4);
        root.left.left.right = new Node(5);
        root.left.left.right.left = new Node(9);
        root.left.left.right.right = new Node(10);
        List<Integer> binaryTreeResults= binaryTreeAvgATLevel(root);
        binaryTreeResults.forEach(avgValue-> System.out.println(avgValue));
    }
}
