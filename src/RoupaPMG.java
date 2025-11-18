package Projetos.POO.TrabalhoPOO.Estoque;

import java.util.Scanner;

public class RoupaPMG implements Item {
    Scanner scan = new Scanner(System.in);
    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private String tamanho;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
    public void venda() {
        this.tamanho = "";
        System.out.println("Insira o tamanho desejado :\nP, M ou G");
        switch (scan.nextLine()) {
            case "P": this.quantidadeP--;
            this.tamanho = "P";
            break;
            case "M": this.quantidadeM--;
            this.tamanho = "M";
            break;
            case "G": this.quantidadeG--;
            this.tamanho = "G";
            break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void reposicaoEstoque() {
        if (this.quantidadeP < this.estoqueMinimo) {
            this.quantidadeP = this.estoqueMaximo;
            System.out.println("Estoque reposto do produto "+this.descricao+" tamanho P");
        }
        if (this.quantidadeM < this.estoqueMinimo) {
            this.quantidadeM = this.estoqueMaximo;
            System.out.println("Estoque reposto do produto "+this.descricao+" tamanho M");
        }
        if (this.quantidadeG < this.estoqueMinimo) {
            this.quantidadeG = this.estoqueMaximo;
            System.out.println("Estoque reposto do produto "+this.descricao+" tamanho G");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getDescricao() {
        return descricao;
    }
}
