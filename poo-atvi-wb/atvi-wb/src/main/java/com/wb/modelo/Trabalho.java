package com.wb.modelo;

public class Trabalho {
	public String nome;
	public Number valor;
	public Trabalho(String nome, Number valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
}