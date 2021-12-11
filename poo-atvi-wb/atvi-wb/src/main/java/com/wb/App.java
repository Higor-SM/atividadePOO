package com.wb;
import com.wb.io.Entrada;
import com.wb.io.cadastro.Cadastro;
import com.wb.io.cadastro.CadastroCliente;
import com.wb.io.cadastro.CadastroProdutos;
import com.wb.io.listagem.Listagem;
import com.wb.io.listagem.ListagemClientes;
import com.wb.io.listagem.ListagemProdutos;
import com.wb.modelo.Empresa;
import com.wb.modelo.Trabalho;
import com.wb.io.remocao.RemoverCliente;
import com.wb.io.remocao.RemoverProduto;

public class App {
		public static void main(String[] args) {
		System.out.println("SISTEMA RODANDO");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Editar");
			System.out.println("4 - Remover");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("                                                                        ");
				System.out.println("END !");
				break;
			case 1:
				System.out.println("                                                                        ");
				System.out.println("CADASTRO");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Cadastro cadastro = new CadastroCliente(empresa.getClientes());
					cadastro.cadastrar();
					break;
				case 2:
					cadastro = new CadastroProdutos(empresa.getProdutos());
					cadastro.cadastrar();
					break;
				case 3:
					break;
				}
				break;
			case 2:
				System.out.println("                                                                        ");
				System.out.println("LISTAR");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 1:
					System.out.println("                                                                        ");
					System.out.println("Qual lista de clientes deseja obter?");
					System.out.println("1 - Todos os clientes");
					System.out.println("0 - Voltar");
					
					operacao = entrada.receberNumeroInteiro();
					
					switch(operacao) {
					case 0:
						break;
					case 1:
						Listagem listagem = new ListagemClientes(empresa.getClientes());
						listagem.listar();
						break;
					}
					break;
				case 2:
					Listagem listagem = new ListagemProdutos(empresa.getProdutos());
					listagem.listar();
					break;
				case 3:
					break;
				}
				break;
			}
		}
	}
}