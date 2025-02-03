package chronoUnits;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Durations {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDateTime now = LocalDateTime.now();

        System.out.println(today);

        System.out.println(today.plus(1, ChronoUnit.MONTHS));
        System.out.println(today.plus(1, ChronoUnit.CENTURIES));
        System.out.println(now.plus(1, ChronoUnit.HOURS));
    }
}
