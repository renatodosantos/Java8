package br.com.java8;

/**
 * Created by rsd on 25/11/16.
 */
@FunctionalInterface
public interface Validador<T> {
    boolean valida(T t);
}
