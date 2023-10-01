package Lesson112datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args){
        LocalDate d04 = LocalDate.parse("2023-09-13");
        LocalDateTime d05 = LocalDateTime.parse("2023-09-13T02:30:23");
        Instant d06 = Instant.parse("2023-09-13T02:30:23Z");
    }
}
