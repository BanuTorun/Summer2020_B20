package day34_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
use the LocalDate & Time get the current date and time in the following format:
sunday, 09:51 AM,Jul/26/2020
 */
public class Warmup {
    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, hh:mm a,MMM/dd/yyyy");
        LocalDateTime today= LocalDateTime.now();
        System.out.println(today.format(dtf));

    }
}
