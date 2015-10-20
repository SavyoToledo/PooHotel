package com.java.PooHotel;

public class Quarto {
	
	private int tipo;
	private float valorDiaria;
	private int capacidade;
	private boolean ocupado;
	
	public Quarto(int tipo, float valorDiaria, int capacidade, boolean ocupado) {
		this.tipo = tipo;
		this.valorDiaria = valorDiaria;
		this.capacidade = capacidade;
		this.ocupado = ocupado;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public float getValorDiaria() {
		return valorDiaria;
	}
	
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}
	
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	
	
	
	
}
