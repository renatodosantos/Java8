package br.com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

/**
 * Created by rsd on 25/11/16.
 */
public class Capitulo5 {
    public static void main(String[] args) {
        System.out.println("Exercicio 1");
        exercicio1();
        System.out.println("\nExercicio 2");
        exercicio2();
        System.out.println("\nExercicio 3");
        exercicio3();
    }

    private static void exercicio3() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.sort(comparingInt(u1 -> u1.getPontos()));
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }

    private static void exercicio2() {
        List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
//        Collections.sort(palavras);
        palavras.sort(Comparator.naturalOrder());
        palavras.forEach(palavra -> System.out.println(palavra));
    }

    private static void exercicio1() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.sort(comparing(u1 -> u1.getNome()));
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }
}
