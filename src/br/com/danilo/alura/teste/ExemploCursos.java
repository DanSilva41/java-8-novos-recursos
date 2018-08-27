package br.com.danilo.alura.teste;

import br.com.danilo.alura.dominio.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // Ordenar pelo número de alunos
        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(System.out::println);

        // Filtrar por cursos com mais de 100 alunos
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);

        // Depois de filtrar vamos mapear  para saber a quantidade de alunos destes cursos
        cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);

        // Somar usando IntStream
        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(soma);

        Optional<Curso> qualquerCurso = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny();

        Curso curso = qualquerCurso.orElseThrow(null);// Devolve um Curso ou null

        qualquerCurso.ifPresent(System.out::println);

        System.out.println("Media de todos os cursos = "+ cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average());

        cursos = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());// retorna uma lista

        cursos.forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap( // Retornando Map
                        c -> c.getNome(),
                        c -> c.getAlunos()
                ))
                .forEach((nome, alunos) -> System.out.println(nome + " tem "+ alunos + " alunos")); // Iterar sobre Map

    }
}
