package com.heap;

public class MinHeap extends Heap
{
    public MinHeap(int size)
    {
        super(size);
    }

    public void siftDown(int index)
    {
        int smallIndex = -1;
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);
        if (leftIndex != -1 && rightIndex != -1)
        {
            smallIndex = getElementAtIndex(leftIndex) < getElementAtIndex(rightIndex) ? leftIndex : rightIndex;
        }
        if (smallIndex == -1)
            return;

        if (getElementAtIndex(smallIndex) < getElementAtIndex(index))
        {
            swap(smallIndex, index);
            siftDown(smallIndex);
        }
    }


    public void siftUp(int index)
    {
        int parentIndex = getParentIndex(index);
        if (parentIndex != -1 && getElementAtIndex(parentIndex) < getElementAtIndex(index))
        {
            swap(index, parentIndex);
            siftUp(parentIndex);
        }
    }

    public void insert(int value)
    {
        //Edge case makesure heap is not full.
        if (isFull())
            return;
        array[count] = value;
        siftUp(count);
    }


    /**
     * remove the height priority element.
     * 1. move last element to top position
     * 2. use siftdown to move right position.
     *
     * @return
     */
    public int remove()
    {
        if (isEmpty())
            return -1;
        int topElement = array[0];
        count=count-1;
        array[0] = array[count - 1];
        siftDown(count - 1);
        return topElement;
    }





}
