package com.general;

public class RomanToInt
{
    public static void main(String[] args)
    {
        int[] romanValue=new int[26];
        romanValue['I'-'A']= 1;
        romanValue['V'-'A']= 5;
        romanValue['X'-'A']= 10;
        romanValue['L'-'A']= 50;
        romanValue['C'-'A']= 100;
        romanValue['D'-'A']= 500;
        romanValue['M'-'A']= 1000;
        String roman="MCMXCIV";
        int sum=0;
        int current;
        int prev=0;
       for (int i=roman.length()-1;i>=0;i--)
       {
           current=romanValue[roman.charAt(i)-'A'];
           if(prev <= current)
           {
               sum += current;
           }
           else
           {
               sum -= current;
           }
           prev=current;
       }
        System.out.println(sum);
    }

}
