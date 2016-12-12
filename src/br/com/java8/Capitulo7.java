package br.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;

/**
 * Created by rsd on 30/11/16.
 */
public class Capitulo7 {
    public static void main(String[] args) {
        System.out.println("Exercicio 1");
        exercicio1();
        System.out.println("\nExercicio 2");
        exercicio2();
        System.out.println("\nExercicio 3");
        exercicio3();
    }

    /**
     * Como obter de volta uma Lista?
     */
    private static void exercicio3() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 90);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        List<Usuario> maisQue100 = new ArrayList<>();
        usuarios.stream()
                .filter(u -> u.getPontos() > 100)
                .forEach(maisQue100::add);

    }

    /**
     * tornando moderadores os usuários com mais de 100 pontos
     */
    private static void exercicio2() {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 90);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.stream()
                .filter(u -> u.getPontos() > 100)
                .forEach(Usuario::tornaModerador);

        usuarios.stream()
                .filter(Usuario::isModerador)
                .forEach(System.out::println);

    }

    /**
     * Tornando moderadores os 10 usuários com mais pontos
     */
    private static void exercicio1() {
        Usuario user14 = new Usuario("Guilherme Silveira", 190);
        Usuario user15 = new Usuario("Paulo Silveira", 150);
        Usuario user16 = new Usuario("Rodrigo Turini", 120);
        Usuario user1 = new Usuario("User1 ", 1);
        Usuario user2 = new Usuario("User2 ", 2);
        Usuario user3 = new Usuario("User3 ", 3);
        Usuario user4 = new Usuario("User4 ", 4);
        Usuario user5 = new Usuario("User5 ", 5);
        Usuario user6 = new Usuario("User6 ", 6);
        Usuario user7 = new Usuario("User7 ", 7);
        Usuario user8 = new Usuario("User8 ", 8);
        Usuario user9 = new Usuario("User9 ", 9);
        Usuario user10= new Usuario("User10 ", 10);
        Usuario user11= new Usuario("User11 ", 11);
        Usuario user12= new Usuario("User12 ", 12);
        Usuario user13= new Usuario("User13 ", 13);

        List<Usuario> usuarios = Arrays.asList(user14, user15, user16, user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12, user13);

        usuarios.sort(comparing(Usuario :: getPontos).reversed());
        usuarios.subList(0,10).forEach(Usuario :: tornaModerador);

    }
}
