package Projetos.POO.TrabalhoPOO.Estoque;

import java.util.Scanner;
import java.util.Vector;

public class appEstoque {
    public static void main(String[] args) {

        Item[] Produtos = new Item[5];
        Scanner scan = new Scanner(System.in);
        Produtos[0] = (new RoupaPMG("Camisa", 15, 20, 15, 10, 30));
        Produtos[1] = (new RoupaPMG("Saia", 10, 25, 20, 15, 40));
        Produtos[2] = new RoupaTamanhoUnico("Cinto", 25, 20, 50);
        Produtos[3] = (new Acessorio("Pulseira", 30, 10, 50));
        Produtos[4] = new RoupaPMG("Saida de Praia", 10, 25, 20, 15, 60);

        int escolha = 0;
        while (escolha != 5) {
            for (int i = 0; i < Produtos.length; i++) {
                System.out.println(i+" - "+Produtos[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema");
            escolha = scan.nextInt();

            try {
                Produtos[escolha].venda();

                System.out.print("Venda realizada do produto "+Produtos[escolha].getDescricao());
                if (Produtos[escolha] instanceof RoupaPMG) {
                    System.out.println(" tamanho "+Produtos[escolha].getTamanho());
                } if (Produtos[escolha] instanceof Acessorio) {
                    System.out.println(" "+Produtos[escolha].getQtdVendida()+" unidades");
                } else {
                    System.out.println();
                }

                Produtos[escolha].reposicaoEstoque();

            } catch (Exception _) {}

            if (escolha > 5) {
                System.out.println("Opção inválida, tente novamente");
            }
        }
        scan.close();
    }
}
