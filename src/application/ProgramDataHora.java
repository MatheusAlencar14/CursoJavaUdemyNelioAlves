package application;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class ProgramDataHora {
    public static void main(String[] args) {

        DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-07-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-03T11:01");
        Instant d06 = Instant.parse("2023-07-03T11:01:08Z");
        Instant d07 = Instant.parse("2023-07-03T11:01:08-03:00");

        LocalDate d08 = LocalDate.parse("03/07/2023", dtf01);
        LocalDateTime d09 = LocalDateTime.parse("03/07/2023 11:01", dtf02);

        LocalDate d10 = LocalDate.of(2023, 07, 03);
        LocalDateTime d11 = LocalDateTime.of(2023, 07, 03, 11, 01);

        System.out.println("Data d01: " + d01);
        System.out.println("Data d02: " + d02);
        System.out.println("Data d03: " + d03);
        System.out.println("Data d04: " + d04);
        System.out.println("Data d05: " + d05);
        System.out.println("Data d06: " + d06);
        System.out.println("Data d07: " + d07);
        System.out.println("Data d08: " + d08);
        System.out.println("Data d09: " + d09);
        System.out.println("Data d10: " + d10);
        System.out.println("Data d11: " + d11);
        System.out.println();
        System.out.println();

        //Imprimir Data e Hora em formato customizado
        System.out.println("Data d04: " + d04.format(dtf01));
        System.out.println("Data d05: " + dtf02.format(d05));

        //Imprime a hora global (Instant), convertendo para o fuso horário do sistema do usuário
        DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Data d06: " + dtf03.format(d06));
    }
}
