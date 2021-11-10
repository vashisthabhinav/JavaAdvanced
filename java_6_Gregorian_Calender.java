package com.company.advanced;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class java_6_Gregorian_Calender {
    public static void main(String[] args) {
        /*
        Constructors of the GregorianCalendar class :
        GregorianCalendar(): This constructor is used to initialize an object with the current time in the default time zone.
        GregorianCalendar(int year, int month, int day): This constructor is used to initialize an object with the date-set specified as parameters in the default time zone and default locale.
        GregorianCalendar(int year, int month, int day, int hours, int minutes): This constructor initializes an object with the given date and time set in the default locale and time zone.
        GregorianCalendar(int year, int month, int day, int hours, int minutes, int seconds): This constructor initializes an object with the more specific time and date-set passed as a parameter in the default locale and time zone.
        GregorianCalendar(Locale locale): Initializes a GregorianCalendar object with the current date and time in the default time zone and the specified locale.
        GregorianCalendar(TimeZone timeZone): Initializes a GregorianCalendar object with the current date and time in the default locale and the specified time zone.
        GregorianCalendar(TimeZone timeZone, Locale locale): Initializes an object with the locale and timezone passed as parameters.
         */
        /*
        isLeapYear(int year) :
        Checks if the year passed as a parameter is a leap year or not.
        This method returns a boolean value
         */

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));
        /*
        roll(int field, boolean up) :
        This method adds/subtracts a single unit of time from the specified time field.
        true = rolls up the value by 1.
        false = rolls down the value by 1
         */
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling : " + c.getTime());
        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + c.getTime());
        /*
        hashcode():
        This method returns the hashcode of the calendar object
         */
        GregorianCalendar c1 = new GregorianCalendar();
        System.out.println("Calendar : " + c1.getTime());

        System.out.println("The hashcode for this calendar is : "+ c1.hashCode());
        // Video in Code
        Calendar c2 = Calendar.getInstance();
        System.out.println(c2.getTime());
        System.out.println(c2.get(Calendar.DATE));
        System.out.println(c2.get(Calendar.SECOND));
        System.out.println(c2.get(Calendar.HOUR));
        System.out.println(c2.get(Calendar.HOUR_OF_DAY) + ":" + c2.get(Calendar.MINUTE) + ":" + c2.get(Calendar.SECOND));
        GregorianCalendar cal1 = new GregorianCalendar();
        System.out.println(cal1.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
