package com.general;

import java.time.LocalDate;

public class DateDiff
{
    public static void main(String[] args)
    {
        System.out.println(daysBetweenDates("2019-06-01", "2019-07-01"));
    }

    public static int daysBetweenDates(String date1Str, String date2Str)
    {
        Long days = 0l;
        try
        {
            LocalDate localDate1 = LocalDate.parse(date1Str);
            LocalDate localDate2 = LocalDate.parse(date2Str);
            System.out.println(Math.abs(localDate1.toEpochDay() - localDate2.toEpochDay()));
        } catch (Exception e)
        {

        }

        return days.intValue();
    }
}
