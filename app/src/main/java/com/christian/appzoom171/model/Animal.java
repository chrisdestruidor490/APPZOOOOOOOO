package com.christian.appzoom171.model;

/**
 * Created by android on 06/09/2018.
 */

public class Animal {
    private int id;
    private String nome;
    private double idade;
    private Categoria categoria;

    public Animal() {

    }

    public Animal(int id, String nome, double quantidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.idade = quantidade;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double quantidade) {
        this.idade = idade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nome;
    }
}

