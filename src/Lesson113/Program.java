package Lesson113;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static  void main(String[] args){
        LocalDate d04 = LocalDate.parse("2023-07-20");
//        LocalDateTime d05 = LocalDateTime.parse("2022-07-21T01:01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //calculos
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        //calculos com instant
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);

        //duracao entre duas data / hora
//        Duration t1 = Duration.between(pastWeekLocalDate, d06);
//
        //atStartOfDay()

//        System.out.println("Duration = " + t1);
//        System.out.println("Duration = " + t1.toDays());



    }
}
