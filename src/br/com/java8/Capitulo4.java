package br.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by rsd on 25/11/16.
 */
public class Capitulo4 {
    public static void main(String ... args) {
        System.out.println("Exercicio 1");
        exercicio1();
        System.out.println("\nExercicio 2");
        exercicio2();
    }

    private static void exercicio2() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        usuarios.removeIf(u1 -> u1.getPontos() > 160);
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }

    private static void exercicio1() {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> mostraMensagem = u ->
                System.out.println("antes de imprimir os nomes");

        Consumer<Usuario> imprimeNome = u ->
                System.out.println(u.getNome());

        usuarios.forEach(mostraMensagem.andThen(imprimeNome));
    }

}
