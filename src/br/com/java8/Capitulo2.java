package br.com.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rsd on 24/11/16.
 */
public class Capitulo2 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        usuarios.forEach(u -> System.out.println(u.getNome()));

    }
}

