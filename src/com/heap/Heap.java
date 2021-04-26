package com.heap;

public abstract class Heap
{
    public int size;
    public int[] array;
    public int count = 0;

    public Heap(int size)
    {
        this.size = size;
        this.array = new int[size];
    }


    public int getLeftChildIndex(int index)
    {
        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex > count)
            return -1;
        return leftChildIndex;
    }


    public int getRightChildIndex(int index)
    {
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex > count)
            return -1;
        return rightChildIndex;
    }

    public int getParentIndex(int index)
    {
        if (index < 0 || index > count)
            return -1;
        int parentIndex = (index - 1) / 2;
        return parentIndex;
    }


    public void swap(int index1, int index2)
    {
        int t=array[index1];
        array[index1]=array[index2];
        array[index2]=t;
    }

    public int getCount()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return count==0;
    }

    public boolean isFull()
    {
        return array.length==size;
    }

    public int getElementAtIndex(int index)
    {
        return array[index];
    }



    public static int getLeftChildIndex(int index, int endIndex)
    {
        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex > endIndex)
            return -1;
        return leftChildIndex;
    }


    public  int getRightChildIndex(int index, int endIndex)
    {
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex > endIndex)
            return -1;
        return rightChildIndex;
    }

    public  int getParentIndex(int index, int endIndex)
    {
        if (index > endIndex)
            return -1;

        return (index - 1) / 2;
    }

    public void percolate(int index, int endIndex)
    {
        int leftIndex=getLeftChildIndex(index,endIndex);
        int rightIndex=getRightChildIndex(index,endIndex);

        if(leftIndex!=-1 &&  getElementAtIndex(leftIndex) > getElementAtIndex(index) )
        {
            swap(leftIndex,index);
            percolate(leftIndex,index);
        }


        if(rightIndex!=-1 &&  getElementAtIndex(rightIndex) > getElementAtIndex(index) )
        {
            swap(rightIndex,index);
            percolate(rightIndex,index);
        }
    }

    public void  heapfy(int endIndex)
    {
        int index=getParentIndex(endIndex,endIndex);
        while (index>0)
        {
            percolate(index,endIndex);
            index--;
        }

    }



}
