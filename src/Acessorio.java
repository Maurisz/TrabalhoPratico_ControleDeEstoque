package Projetos.POO.TrabalhoPOO.Estoque;

import java.util.Scanner;

public class Acessorio extends Peca implements Item{
    Scanner scan = new Scanner(System.in);
    private int qtdVendida;
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void venda() {
        System.out.println("Insira a quantidade desejada");
        this.qtdVendida = scan.nextInt();
        super.setQuantidade(getQuantidade()-qtdVendida);
    }

    public int getQtdVendida() {
        return this.qtdVendida;
    }
}
