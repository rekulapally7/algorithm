package com.binarytree;

import java.util.Arrays;

public class ReorderLogFiles
{
    public static void main(String[] args)
    {
        String[] logs = {"p2 kffypb", "i bq p sn", "1 lcltvbem", "5 452 224", "tj u t h r"};

        Arrays.sort(logs, (o1, o2) ->
        {
            String spilit1 = o1.substring(o1.indexOf(" "), o1.length()).trim();
            String spilit2 = o2.substring(o2.indexOf(" "), o2.length()).trim();
            boolean isDigit1 = Character.isDigit(spilit1.charAt(0));
            boolean isDigit2 = Character.isDigit(spilit2.charAt(0));
            if (!isDigit1 && !isDigit2)
            {
                return spilit1.compareTo(spilit2)==0?o1.compareTo(o2):spilit1.compareTo(spilit2);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;

        });
        Arrays.stream(logs).forEach(s -> System.out.println(s));
    }
}
