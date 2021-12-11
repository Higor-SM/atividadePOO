package com.wb.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String nome;
	public String nomeSocial;
	public String genero;
	private CPF cpf;
	private RG rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<Produto> produtosConsumidos;
	private List<Servico> servicosConsumidos;
	public Cliente(String nome, String nomeSocial,String genero, CPF cpf, RG rg) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.cpf = cpf;
		this.rgs = rg;
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<Telefone>();
		this.produtosConsumidos = new ArrayList<Produto>();
		this.servicosConsumidos = new ArrayList<Servico>();
	}
	public CPF getCpf() {
		return cpf;
	}
	public RG getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setTelefones(List<Telefone> telefonesNovos) {
		telefones = telefonesNovos;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public List<Produto> getProdutosConsumidos() {
		return produtosConsumidos;
	}
	public List<Servico> getServicosConsumidos() {
		return servicosConsumidos;
	}
}