package com.company.advanced;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_8_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formatting : "+ myDate);
//        SO_LOCAL_DATE :
//        Formats the date according to the International Standard for the representation of dates
        LocalDateTime dt1 = LocalDateTime.now();

        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format

        String myDate1 = dt1.format(df1); // Creating date string using date and format
        System.out.println("Date in ISO format : "+ myDate1);
//        ISO_WEEK_DATE :
//        Returns the number of weeks and year
        DateTimeFormatter df2 = DateTimeFormatter.ISO_WEEK_DATE;//

        String myDate2 = dt.format(df2);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate2);
        DateTimeFormatter df3 = DateTimeFormatter.ISO_ORDINAL_DATE;//

        String myDate3 = dt.format(df3);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate3);

    }
}
