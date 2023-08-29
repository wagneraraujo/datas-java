import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //formats
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //docs datefimeformats
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate df = LocalDate.parse("22/03/2023", fmt1);

        //parse
        LocalDateTime d05 = LocalDateTime.parse(d02.toString());

        //menos 03h
        Instant d06 = Instant.parse("2023-08-27T09:25:20-03:00");

        //data isolada
        LocalDate d10 = LocalDate.of(2023,5,23);



        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println("Parse:" + d05);
        System.out.println("Parse Menos 3:" + d06);
        System.out.println("format: "+ df);
        System.out.println("isolado: "+ d10.toString());

    }
}