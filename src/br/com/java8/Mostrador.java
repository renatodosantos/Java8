package br.com.java8;

import java.util.function.Consumer;

/**
 * Created by rsd on 24/11/16.
 */
public class Mostrador implements Consumer<Usuario> {
    public void accept(Usuario u) {
        System.out.println(u.getNome());
    }
}
