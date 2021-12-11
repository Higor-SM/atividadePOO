package com.wb.io.cadastro;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class CadastroProdutos extends Cadastro {
	private List<Produto> produtos;
	private Entrada entrada;

	public CadastroProdutos(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("                                                                        ");
		System.out.println("Nnome do produto:");
		String nome = entrada.receberTexto();
		System.out.println("Valor");
		Number valor = entrada.receberNumeroDouble();
		System.out.println("                                                                        ");
		
		Produto produto = new Produto(nome, valor);
		produto.nome = nome;
		produto.valor = valor;
		this.produtos.add(produto);

	}

}