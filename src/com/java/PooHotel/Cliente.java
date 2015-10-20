package com.java.PooHotel;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String telefone;
	
	private static int numClientes = 0;
	
	public Cliente(int codigo, String nome, String telefone){
		numClientes++;
		this.codigo= codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public static int getNumClientes(){
		return numClientes;
	}
	
	
}

