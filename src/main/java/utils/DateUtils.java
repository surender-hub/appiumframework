package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    // ✅ Method to get the current date in a specific format
    public static String getCurrentDate(String dateFormat) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        return currentDate.format(formatter);
    }

    // ✅ Method to get a future date by adding 'n' days
    public static String getDateAfterDays(int daysToAdd, String dateFormat) {
        LocalDate futureDate = LocalDate.now().plusDays(daysToAdd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        return futureDate.format(formatter);
    }
}