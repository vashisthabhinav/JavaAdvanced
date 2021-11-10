package com.company.advanced;

import java.time.Clock;
import java.time.*;

public class java_7_TimePackage {
    public static void main(String[] args) {
        /*
        Clock class:
        This class provides access to the current instant, date and time zone using a time-zone.
        Clock class is an abstract class therefore it is not possible to create instance of the clock class.
        Some methods of the clock class :
        abstract ZoneId getZone() : This method returns the time zone being used to create date and time objects.
         */
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        // abstract instant() : This method returns the current instant of the clocks
        System.out.println(cl.instant());
           /*
        Duration class :

        This class is used to measure time in seconds and nano-seconds.
        This class is immutable.
        Some Methods of the duration class :
        boolean isNegative() : This method is used to check if the duration is negative.
        Example :
         */
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d2.isNegative());
        // isZero() : This method is used to check if the duration is zero. Returns boolean value
        System.out.println(d1.isZero());

        Duration d3 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d3.isZero());
//        LocalDate class :
//        This class is useful for representing the dates in the year-month-day format.
//        With the help of LocalDate class, dates can be represented without time.
        LocalDate d = LocalDate.now();
        System.out.println(d);
//        Some methods of the LocalDate class :
//
//        compareTo() : This method compares the equality of the two dates. Returns boolean value
        LocalDate d_ = LocalDate.parse("2021-05-27");
        LocalDate d1_= LocalDate.parse("2021-05-26");
        LocalDate d2_= LocalDate.parse("2021-05-26");

        System.out.println(d1_.equals(d_));
        System.out.println(d2_.equals(d1_));
//        withYear(int Year) : This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.
        LocalDate ld = LocalDate.parse("2021-05-27");
        System.out.println(ld.withYear(2001));
//        LocalTime class :
//        This class helps us to represent the time without the dates.
//        Instances of LocalTime class are mutable.
        LocalTime t = LocalTime.now();
        System.out.println(t);
//        LocalTime plusHours(long hoursToAdd) :
//        This method returns a copy of the LocalTime but with the specified number of hours added.
        LocalTime t_ = LocalTime.of(13,18,29);
        System.out.println("Time before : "  + t_);

        LocalTime t1= t_.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);
//        LocalTime minusMinutes(long minutesToSubtract) :
//        This method returns a copy of the LocalTime but with the specified number of minutes subtracted.
        LocalTime lt = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + lt);

        LocalTime lt1= lt.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + lt1);

    }
}
