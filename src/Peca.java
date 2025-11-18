package Projetos.POO.TrabalhoPOO.Estoque;

public abstract class Peca {
    private String descricao;
    private int quantidade;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
    }

    public abstract void venda();

    public void reposicaoEstoque() {
        if (this.quantidade < this.estoqueMinimo) {
            this.quantidade = this.estoqueMaximo;
            System.out.println("Estoque reposto do produto "+this.descricao);
        }
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getDescricao() {
        return descricao;
    }
}
