package br.com.danilo.alura.teste;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
        System.out.println(olimpiadasRio);

//        int anosDepois = hoje.getYear() - olimpiadasRio.getYear();

        Period periodo = Period.between(olimpiadasRio, hoje);
        System.out.println(periodo.getYears());

        LocalDate novaData = olimpiadasRio.plusYears(4);
        System.out.println(novaData);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = novaData.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(3, 20);
        System.out.println(intervalo);

        Year ano = Year.now();
        System.out.println(ano);

        YearMonth anoEMes = YearMonth.now();
        System.out.println(anoEMes);

        Instant instante = Instant.now();
        System.out.println(instante);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
