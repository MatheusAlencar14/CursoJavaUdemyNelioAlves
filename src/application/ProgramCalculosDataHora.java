package application;

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramCalculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-07-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-03T02:30");
        Instant d06 = Instant.parse("2023-07-03T02:30:08Z");

        //Instanciando novas datas com diferença de dias, meses ou anos
        LocalDate menosDiasLD = d04.minusDays(4);
        LocalDate maisDiasLD = d04.plusDays(8);
        LocalDate menosMesesLD = d04.minusMonths(5);
        LocalDate maisSemanasLD = d04.plusWeeks(2);
        LocalDate maisAnosLD = d04.plusYears(5);

        System.out.println("Menos Dias: " + menosDiasLD);
        System.out.println("Mais Dias" + maisDiasLD);
        System.out.println("Menos Meses: " + menosMesesLD);
        System.out.println("Mais Semanas: " + maisSemanasLD);
        System.out.println("Mais Anos: " + maisAnosLD);
        System.out.println();

        LocalDateTime menosHorasLDT = d05.minusHours(5);
        LocalDateTime maisMinutosLDT = d05.plusMinutes(15);

        System.out.println("Menos Horas: " + menosHorasLDT);
        System.out.println("Mais Minutos: " + maisMinutosLDT);
        System.out.println();

        //No Instant há um diferença na instanciação
        Instant menosDiasInstant = d06.minus(17, ChronoUnit.DAYS);

        System.out.println("Menos Dias: " + menosDiasInstant);
        System.out.println();

        //Calculando a duração entre duas datas. Obs: O LocalDate precisa ser convertido para LocalDateTime
        Duration t1 = Duration.between(menosDiasLD.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(menosHorasLDT, d05);
        Duration t3 = Duration.between(menosDiasInstant, d06);
        Duration t4 = Duration.between(d06, menosDiasInstant);

        System.out.println("T1: " + t1.toDays());
        System.out.println("T2: " + t2.toHours());
        System.out.println("T3: " + t3.toDays());
        System.out.println("T4: " + t4.toDays());

    }
}
