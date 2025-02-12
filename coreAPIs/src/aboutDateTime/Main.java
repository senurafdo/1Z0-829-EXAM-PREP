package aboutDateTime;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDate.now().toString());
        System.out.println(LocalTime.now().toString());
        System.out.println(LocalDateTime.now().toString());
        System.out.println(ZonedDateTime.now());

        var date = LocalDate.of(2025, Month.JANUARY, 22);

        System.out.println("--------");

        var time1 = LocalTime.of(6,15,16,1234567891); //
        var time2 = LocalTime.of(6,15,16); // only hour, minute and seconds

        var date01 = LocalDate.of(2025, Month.JANUARY, 22); // this is using month variable
        var date02 = LocalDate.of(2025, 10, 24); // this is only using the date as an integer

        var dateTime = LocalDateTime.of(date01, time2);
        var dateTime02 = LocalDateTime.of(2025, 6,25,4,40,
                25,4500);
        System.out.println("--------");

        var zoneId = ZoneId.of("Europe/Berlin");
        var zonedTime = ZonedDateTime.of(dateTime, zoneId);
        var zonedTime02 = ZonedDateTime.of(date01, time2, zoneId);
        var zonedDatetime03 = ZonedDateTime.of(2025, 12, 12, 13, 11, 34, 34567, zoneId);

        System.out.println("--------");

        var date0123 = LocalDate.of(2025, Month.JANUARY, 22);

    }
}
