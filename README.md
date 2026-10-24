# Sistema de Controle de Estoque

Trabalho prático da disciplina de **Programação Orientada a Objetos** do curso de Engenharia de Software da Universidade Católica de Salvador (UCSAL).

O sistema simula o controle de estoque de uma loja de roupas e acessórios, em modo console. O usuário escolhe um produto, registra uma venda e o sistema repõe o estoque automaticamente quando a quantidade fica abaixo do mínimo definido (ponto de ressuprimento).

## Funcionalidades

- Cadastro de produtos com descrição, quantidade, estoque mínimo e estoque máximo
- Venda de roupas por tamanho (P, M ou G), de roupas de tamanho único e de acessórios por quantidade
- Reposição automática: quando o estoque de um produto (ou de um tamanho) fica abaixo do mínimo, ele volta ao máximo
- Menu interativo no terminal

## Estrutura

| Arquivo | Descrição |
|---|---|
| `Item.java` | Interface comum a todos os produtos (venda, reposição, descrição) |
| `Peca.java` | Classe abstrata com os atributos e a reposição de estoque compartilhados |
| `RoupaPMG.java` | Roupa com estoque separado por tamanho P, M e G |
| `RoupaTamanhoUnico.java` | Roupa de tamanho único, vendida uma unidade por vez |
| `Acessorio.java` | Acessório vendido em quantidade informada pelo usuário |
| `appEstoque.java` | Classe principal com o menu e o fluxo de vendas |

## Conceitos de POO aplicados

- **Herança:** `RoupaTamanhoUnico` e `Acessorio` estendem `Peca`
- **Classe abstrata:** `Peca` define o método abstrato `venda()`
- **Interface:** `Item` padroniza o comportamento de todos os produtos
- **Polimorfismo:** o menu trata todos os produtos como `Item`, e cada classe implementa a venda à sua maneira
- **Encapsulamento:** atributos privados acessados por getters e setters

## Como executar

Requer **Java 22 ou superior**.

```bash
javac -d out src/*.java
java -cp out Projetos.POO.TrabalhoPOO.Estoque.appEstoque
```

## Autor

**Maurício Cardoso Barreto**
[LinkedIn](https://www.linkedin.com/in/mauriciocbarreto) · [GitHub](https://github.com/Maurisz)
