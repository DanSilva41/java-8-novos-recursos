package br.com.danilo.alura.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Casa");
        palavras.add("Apartamento");
        palavras.add("Condomínio");
        palavras.add("Mansão");
        palavras.add("Pousada");

//        palavras.sort((s1, s2) -> s1.length() - s2.length());
        palavras.sort(Comparator.comparing(s -> s.length())); // method reference

        // Explicação
//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);

        // Usando foreach
        palavras.forEach(s -> System.out.println(s));

//        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
