package com.wb.io.listagem;

import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class ListagemClientes extends Listagem {
	private List<Cliente> clientes;

	public ListagemClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("                                                                        ");
		System.out.println("LISTA DE CLIENTES");
		for (Cliente cliente : clientes) {
			System.out.println("                                                                        ");
			System.out.println("Nome: " + cliente.nome);
			System.out.println("Nome social: " + cliente.nomeSocial);
			System.out.println("Gênero: " + cliente.genero);
			System.out.println("CPF: " + cliente.getCpf().getValor());
			System.out.println("RG: " + cliente.getRgs().getValor());
			for(Telefone telefone: cliente.getTelefones()) {
				System.out.println("Telefone: ("+ telefone.getDdd()+") "+telefone.getNumero());
			}
		}
		System.out.println("                                                                        ");
	}
}