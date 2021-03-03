package br.com.impacta.lab;

import java.util.ArrayList;
import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme a tabela produto em uma classe separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  
		 *  Tabela de produto
		 *  
		 *  CodigoProduto	descrição do Produto		Valor do Produto
		 * 	1				Camisa						70.00
		 * 	2				Shorts						57.50
		 * 	3				Meia						9.99
		 * 	4				Toca						35.00
		 * 	5				Luvas						19.50
		 * 
		 * -----------------------------------------------------------------
		 * 
		 * Após criar a classe produto, crie objetos para representar as linhas da tabela.
		 * Deixarei um de exemplo.
		 * 
		 * 
		 * Em seguida crie um método estatico na classe Produto onde o mesmo tenho o nome de buscarProdutoPèloId
		 * Exemplo de um método estatico:
		 * 
		 * public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {
		 * 	System.out.println("exemplo");
		 * }
		 * 
		 * receba como parametro uma lista de produtos e um codigo do produto
		 * 
		 * E devolva um objeto do Tipo Produto caso nao encontre nenhum retorne nulo
		 * 
		 * (return null;)
		 * 
		 * Abaixo um pedaço do exercicio como base
		 */
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		listaDeProdutos.add(produto);
		
		Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 1);
		
		System.out.println(produtoEncontrado);
	}

}
