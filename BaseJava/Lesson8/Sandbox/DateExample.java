package BaseJava.Lesson8.Sandbox;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    static Date date = new Date();

    public static void main(String[] args) {
        System.out.println(date);
        System.out.println(date.getTime()); // количество милисекунд с 1 января 1970 г.
        System.out.println(System.currentTimeMillis()); // то же самое

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println(sdf.format(date));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(dtf.format(localDateTime));
    }
}
