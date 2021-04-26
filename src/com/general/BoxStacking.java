package com.general;

public class BoxStacking
{
    static class Box
    {
        int height;
        int width;
        int d;

        public Box(int height, int w, int d)
        {
            this.height = height;
            this.width = w;
            this.d = d;
        }

    }


    /* Driver program to test above function */
    public static void main(String[] args) {

        Box[] arr = new Box[4];
        arr[0] = new Box(4, 6, 7);
        arr[1] = new Box(1, 2, 3);
        arr[2] = new Box(4, 5, 6);
        arr[3] = new Box(10, 12, 32);

        System.out.println("The maximum possible "+
                "height of stack is " +
                maxStackHeight(arr,4));
    }

    private static int maxStackHeight(Box[] arr, int i)
    {



        return 0;
    }


}
