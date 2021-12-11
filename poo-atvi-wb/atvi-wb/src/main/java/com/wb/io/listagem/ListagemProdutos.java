package com.wb.io.listagem;

import java.util.List;

import com.wb.modelo.Produto;

public class ListagemProdutos extends Listagem {
	private List<Produto> produtos;

	public ListagemProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void listar() {
		System.out.println("                                                                        ");
		System.out.println("LISTA DOS PRODUTOS:");
		for (Produto produto : produtos) {
			System.out.println("___________________________________________________");
			System.out.println("Nome: " + produto.nome);
			System.out.println("Valor: R$ " + produto.valor);
		}
		System.out.println("                                                                        ");
	}

}