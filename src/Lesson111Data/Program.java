package Lesson111Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {
    public static void main(String[] args){


        LocalDate d04 = LocalDate.parse("2023-09-13");
        LocalDateTime d05 = LocalDateTime.parse("2023-09-13T02:30:23");
        Instant d06 = Instant.parse("2023-09-13T02:30:23Z");
        Instant d07 = Instant.parse("2023-09-13T02:30:23Z");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //convertendo datas para texto
        System.out.println("d04 " + d04.format(fmt1));

        //instant custom global
        //não consigo formatar um instant sem usar o fuso horário
        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("instant format: " + fm3.format(d07));


    }
}
