package com.company.advanced;

import java.util.Calendar;

public class java_5_Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());  //getCalendarType() returns the type of the calendar
        /*
        get(int field) :
        This method returns the value of the specified calendar field
         */
        System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND));
        /*
        add(int field, int amount) :
        This method is useful for calculating the time after or before of a specified calendar field
         */
        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());
        /*
        getWeeksInWeekYear() :
        Returns the number of weeks
         */
        System.out.println(c.getWeeksInWeekYear());
        /*
        getMaximum(int field) :
        Returns the maximum value for the specified calendar field
         */
        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));

    }
}
