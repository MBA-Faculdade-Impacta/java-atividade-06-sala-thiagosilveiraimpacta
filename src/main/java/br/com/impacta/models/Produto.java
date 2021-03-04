package br.com.impacta.models;

import java.util.List;

public class Produto {

  public int codigo;

  public String descricao;

  public Double valor;

  public static Produto buscarProdutoPeloId(List<Produto> listaDeProdutos, Integer codProduto) {
    Produto produtoSelecionado = new Produto();

    for(Produto produto : listaDeProdutos) {
      if(produto.codigo == codProduto) {
        produtoSelecionado = produto;
      }
    }

    return produtoSelecionado;    
  }

}