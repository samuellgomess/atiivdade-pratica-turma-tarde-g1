package org.senai.exemplos;

// Superclasse
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public double calcularDesconto(double percentual) {

        double desconto = preco * percentual;
        return preco - desconto;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " - Preço: " + preco);
    }
}
