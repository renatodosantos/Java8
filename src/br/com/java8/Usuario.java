package br.com.java8;

/**
 * Created by rsd on 24/11/16.
 */
public class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.pontos = pontos;
        this.nome = nome;
        this.moderador = false;
    }
    public String getNome() {
        return nome;
    }
    public int getPontos() {
        return pontos;
    }
    public void tornaModerador() {
        this.moderador = true;
    }
    public boolean isModerador() {
        return moderador;
    }
    public String toString() {
        return "Usuario " + nome;
    }
}
