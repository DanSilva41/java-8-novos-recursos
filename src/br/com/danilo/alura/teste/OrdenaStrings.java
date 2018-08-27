package br.com.danilo.alura.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Casa");
        palavras.add("Apartamento");
        palavras.add("Condomínio");
        palavras.add("Mansão");
        palavras.add("Pousada");

        palavras.sort(new ComparadorPorTamanho());

        // Usando foreach
        palavras.forEach(s -> System.out.println(s));

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
