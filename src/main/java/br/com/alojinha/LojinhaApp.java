package br.com.alojinha;

import br.com.alojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.nome = "Play Station 4";
        meuProduto.valor = 4999.99;
        meuProduto.marca = "Sony";
        meuProduto.tamanho = "Medio";
        meuProduto.itensInclusos = "Dois controles e três jogos";

        System.out.println(meuProduto.nome);

    }
}
