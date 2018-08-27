package br.com.danilo.alura.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

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
    }
}
