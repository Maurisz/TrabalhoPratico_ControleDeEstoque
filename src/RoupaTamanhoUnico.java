package Projetos.POO.TrabalhoPOO.Estoque;

public class RoupaTamanhoUnico extends Peca implements Item {

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        super.setQuantidade(getQuantidade()-1);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }
}
