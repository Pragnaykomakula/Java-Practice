package day10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FlightDayCalculator{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Today's date: "+ today);
        System.out.println("Current time: "+time);

        LocalDate flightDate = LocalDate.of(2026,12,25);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = flightDate.format(myFormat);
        System.out.println("Your flight is on: " + formattedDate);

        long daysLeft = ChronoUnit.DAYS.between(today,flightDate);
        System.out.println("Days until flight: "+ daysLeft);

    }
}
