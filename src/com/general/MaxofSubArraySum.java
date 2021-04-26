package com.general;

public class MaxofSubArraySum
{

    public static int maxSumTwoNoOverlap(int[] A, int K, int L) {

        if(A.length==0 || A.length < (K+L))
        {
            return -1;
        }
            return Math.max(getMaxApplePick(A, K, L), getMaxApplePick(A, L, K));
    }


    private static int getMaxApplePick(int[] A, int L, int M) {
        int sumFirstPerson = 0;
        int end1 = 0;
        for (int i = 0; i < L; i++) {
            sumFirstPerson += A[end1++];
        }
        int maxSum1 = sumFirstPerson;

        int sumSecondPerson = 0;
        int end2 = L;
        for (int i = 0; i < M; i++) {
            sumSecondPerson += A[end2++];
        }

        int res = maxSum1 + sumSecondPerson;
        while (end2 < A.length) {
            sumFirstPerson += A[end1] - A[end1 - L];
            sumSecondPerson += A[end2] - A[end2 - M];
            maxSum1 = Math.max(maxSum1, sumFirstPerson);
            res = Math.max(res, maxSum1 + sumSecondPerson);
            end1++;
            end2++;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int k=2,L=2;

        System.out.println(maxSumTwoNoOverlap(a,k,L));
    }

}
