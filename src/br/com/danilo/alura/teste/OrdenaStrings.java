package br.com.danilo.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Casa");
        palavras.add("Apartamento");
        palavras.add("Condomínio");
        palavras.add("Mansão");
        palavras.add("Pousada");

        Comparator<String> comparador = new ComparadorPorTamanho();
//        Collections.sort(palavras, comparador);
        palavras.sort(comparador);

//        for (String palavra : palavras) {
//            System.out.println(palavra);
//        }

        // Usando foreach
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
