package Projetos.POO.TrabalhoPOO.Estoque;

public interface Item {

    default void venda() {
    }

    default void reposicaoEstoque() {
    }

    default String getDescricao() {
        return "";
    }

    default String getTamanho() {
        return "";
    }

    default int getQtdVendida() {
        return 0;
    }
}
