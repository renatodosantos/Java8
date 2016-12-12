package br.com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;

/**
 * Created by rsd on 25/11/16.
 */
public class Capitulo6 {
    public static void main(String[] args) {
        System.out.println("Exercicio 1");
        exercicio1();
        System.out.println("\nExercicio 2");
        exercicio2();
        System.out.println("\nExercicio 3");
        exercicio3();
        System.out.println("\nExercicio 4");
        exercicio4();
        System.out.println("\nExercicio 5");
        exercicio5();
    }

    private static void exercicio6() {
        Supplier<String> criadorString = String::new;
        String string = criadorString.get();

//        Para um contrutor com um parametro
//        Function<String, Usuario> criadorDeUsuarios = Usuario::new;

        BiFunction<String, Integer, Usuario> criadorDeUsuarios = Usuario::new;
        criadorDeUsuarios.apply("Paulo Silveira", 150);
        criadorDeUsuarios.apply("Rodrigo Turini", 120);
        criadorDeUsuarios.apply("Guilherme Silveira", 190);

        int max = Math.max(1, 3);
        BiFunction<Integer,Integer,Integer> integerComparator = Math::max;
        ToIntBiFunction<Integer,Integer> integerComparator1 = Math::max;
    }

    private static void exercicio5() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

//        for(Usuario u : usuarios) {
//            System.out.println(u);
//        }

//        usuarios.forEach(u ->  System.out.println(u));
        usuarios.forEach(System.out::println);

    }

    private static void exercicio4() {
        Usuario rodrigo = new Usuario("Rodrigo Turini", 50);
        Consumer<Usuario> cosumidor = Usuario::tornaModerador;
        cosumidor.accept(rodrigo);

    }

    private static void exercicio3() {
        Usuario rodrigo = new Usuario("Rodrigo Turini", 50);

//        Runnable bloco = new Runnable() {
//            public void run() {
//                rodrigo.tornaModerador();
//            }
//        };

//        Runnable bloco = () -> rodrigo.tornaModerador();
        Runnable bloco = rodrigo::tornaModerador;
        bloco.run();

    }

    private static void exercicio2() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.sort(nullsFirst(Comparator
                .comparingInt(Usuario :: getPontos)
                .reversed()
                .thenComparing(Usuario :: getNome)));

        usuarios.forEach(u -> System.out.println(u.getNome()));
    }

    private static void exercicio1() {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.sort(comparing( Usuario :: getNome));
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }
}
