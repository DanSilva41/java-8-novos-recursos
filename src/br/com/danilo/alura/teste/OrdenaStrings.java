package br.com.danilo.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Casa");
        palavras.add("Apartamento");
        palavras.add("Condomínio");
        palavras.add("Mansão");
        palavras.add("Pousada");

        Collections.sort(palavras);
        System.out.println(palavras);
    }
}
