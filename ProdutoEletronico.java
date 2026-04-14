package org.senai.exemplos;

public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String xbox, int garantiaMeses) {
        super();
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularDesconto(double percentual) {
        return calcularDesconto(percentual) - 10;
    }

    public void exibirGarantia() {
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}
