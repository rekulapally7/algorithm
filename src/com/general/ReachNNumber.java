package com.general;

public class ReachNNumber
{
    public static void main(String[] args)
    {
        System.out.println(reachNumber(2));
    }

    public static int reachNumber(int target)
    {

        return reachNumber(target, 0);
    }

    public static int reachNumber(int target, int n)
    {
        if (target == 0)
            return 0;
        n=n+1;
        reachNumber(target -n , n );
        return n;
    }
}
