package com.wb.io.cadastro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class CadastroCliente extends Cadastro {
	private List<Cliente> clientes;
	private Entrada entrada;

	public CadastroCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	private boolean cadastraNumero = true;
	

	@Override
	public void cadastrar() {
		System.out.println("                                                                        ");
		System.out.println("CADASTRO DE CLIENTE\n");
		System.out.println("Nome do cliente:");
		String nome = entrada.receberTexto(); 
		System.out.println("Informe o nome social do cliente:");
		String nomeSocial = entrada.receberTexto();
		System.out.println("Genero");
		System.out.println("1 - Masculino");
		System.out.println("2 - Feminino");
		String gen = entrada.receberTexto();
		String genero = null;
		if (gen.equals("1")) {
			genero = "Masculino";
		} else {
			genero = "Feminino";
		}
		System.out.println("                                                                        ");
		System.out.println("DOCUMENTOS\n");
		System.out.println("Numero do cpf");
		String valor = entrada.receberTexto();
		System.out.println("Data de emissão do CPF");
		String data = entrada.receberTexto();
		System.out.println("Numero do RG");
		String valorrg = entrada.receberTexto();
		System.out.println("Data de emissão do RG");
		String datarg = entrada.receberTexto();
		System.out.println("                                                                        ");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		CPF cpf = new CPF(dataEmissao, valor);
		LocalDate dataEmissaorg = LocalDate.parse(datarg, formato);
		RG rg = new RG(dataEmissaorg, valorrg);
		Cliente cliente = new Cliente(nome, nomeSocial, genero, cpf, rg);
		this.clientes.add(cliente);
		System.out.println("TELEFONE\n");
		while (cadastraNumero) {
			System.out.println("DDD");
			String ddd = entrada.receberTexto();
			System.out.println("Telefone");
			String numero = entrada.receberTexto();
			Telefone telefone = new Telefone(ddd, numero);
			cliente.getTelefones().add(telefone);
			System.out.println("Cadastrar outro numero");
			System.out.println("1 - Sim");
			System.out.println("2 - Finalizar o cadastro");
			String outroNumero = entrada.receberTexto();
			if(outroNumero.equals("1")) {
				cadastraNumero = true;
			} else {
				cadastraNumero = false;
			}
		}
		System.out.println("                                                                        ");
	}
}