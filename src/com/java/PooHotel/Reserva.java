package com.java.PooHotel;

import java.util.Date;

public class Reserva {
	
	private int numCliente;
	private int numQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	private int numHospedes;
	
	
	public Reserva(int numCliente, int numQuarto, Date dataEntrada, Date dataSaida, int numHospedes) {
		this.numCliente = numCliente;
		this.numQuarto = numQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.numHospedes = numHospedes;
	}

	public int getNumCliente() {
		return numCliente;
	}
	
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	
	public int getNumQuarto() {
		return numQuarto;
	}
	
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getNumHospedes() {
		return numHospedes;
	}

	public void setNumHospedes(int numHospedes) {
		this.numHospedes = numHospedes;
	}
		
	
}
