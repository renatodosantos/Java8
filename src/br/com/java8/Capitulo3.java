package br.com.java8;

/**
 * Created by rsd on 24/11/16.
 */
public class Capitulo3 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        }).start();

        Validador<String> validadorCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        System.out.println("13186-362 ? " +validadorCep.valida("13186-362"));
        System.out.println(validadorCep.getClass());
        System.out.println(validadorCep);

    }
}
