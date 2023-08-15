package org.willian2s.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
// The package includes many date and time classes. For example:
// Class	                Description
// LocalDate	            Represents a date (year, month, day (yyyy-MM-dd))
// LocalTime	            Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
// LocalDateTime	        Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
// DateTimeFormatter	    Formatter for displaying and parsing date-time objects
//
// Format date
// Value	            Example
// yyyy-MM-dd	        "1988-09-29"
// dd/MM/yyyy	        "29/09/1988"
// dd-MMM-yyyy	      "29-Sep-1988"
// E, MMM dd yyyy	    "Thu, Sep 29 1988"
public class Dates {
  public static void main(String[] args) {
    // Current date
    LocalDate date = LocalDate.now();
    System.out.println(date);

    // Current time
    LocalTime time = LocalTime.now();
    System.out.println(time);

    // Current date and time
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.println(dateFormatter.format(dateTime));
  }
}
