package com.java.PooHotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	private static ArrayList <Cliente> clientes = new ArrayList <Cliente> ();
	private static ArrayList <Reserva> reservas = new ArrayList <Reserva> ();
	private static Scanner sc = new Scanner(System.in);
	private static Quarto quartos[] = new Quarto[10];
	
	public static void main(String args[]){		
		
		int op = 0;
		
		do{
			System.out.println("- Hotel -");
			System.out.println("1 - Check-in");
			System.out.println("2 - Check-out");
			System.out.println("3 - Consultar Cliente");
			System.out.println("1 - Consultar Quarto");
			op = sc.nextInt();
			
			switch(op){
			case 1:
				checkIn();
				
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		}while(op != 0);
		
		//Fecha o Scanner
		sc.close();
	}
	
	static int cadastrarCliente(){
		String nome;
		String telefone;
		
		System.out.println("Nome do cliente:");
		nome = sc.nextLine();
		
		System.out.println("Telefone do cliente:");
		telefone =sc.nextLine();
		
		Cliente c = new Cliente(Cliente.getNumClientes(), nome, telefone);
		
		clientes.add(c);
		
		return c.getCodigo();
	}
	
	static void checkIn(){
		
		int op = 0;
		int codCliente;
		int codQuarto;
		Reserva r;
		Date entrada, saida;
		int diaEntrada, mesEntrada, anoEntrada;
		int diaSaida, mesSaida, anoSaida;
		boolean flg1 = false;
		boolean flg2 = false;
		
		//entrada = new Date
		
		System.out.println("1 - Cliente cadastrado");
		System.out.println("2 - Novo cliente");
		op = sc.nextInt();
		
		switch(op){
		case 1:
			
			break;
			
		case 2:
			codCliente = cadastrarCliente();
			
			System.out.println("Qual data deseja realizar a reserva?");
			System.out.println("Dia:");
			diaEntrada = sc.nextInt();
			System.out.println("Mês:");
			mesEntrada = sc.nextInt();
			System.out.println("Ano:");
			anoEntrada = sc.nextInt();
			
			entrada = new Date((anoEntrada - 1900), (mesEntrada - 1), diaEntrada);
			
			System.out.println("Até quando deseja ficar?");
			System.out.println("Dia:");
			diaSaida = sc.nextInt();
			System.out.println("Mês:");
			mesSaida = sc.nextInt();
			System.out.println("Ano:");
			anoSaida = sc.nextInt();
			
			saida = new Date((anoSaida - 1900), (mesSaida - 1), diaSaida);
			
			if(entrada.before(saida)){
				
				System.out.println("Qual tipo de quarto deseja?");
				System.out.println("Categoria			|	Valor da diária	| Capacidade");
				System.out.println("1) Standard			|	R$ 268,00		|	2");
				System.out.println("2) Vista Bosque		|	R$ 315,00		|	4");
				System.out.println("3) Vista Vale		|	R$ 353,00		|	4");
				System.out.println("4) Suíte			|	R$ 498,00		|	2");
				
				codQuarto = sc.nextInt();
				
				//Verifica se o tipo de quarto escolhido é válido
				if(codQuarto > 0 && codQuarto < 5){
					
					//Procura um quarto que seja do tipo escolhido
					for(int i = 0; i < 10; i++){
					
						if(quartos[i].getTipo() == codQuarto){
							
							if(quartos[i].isOcupado()){
								
								//Procura nas reservas por um check-out menor que o check-in fornecido
								for(int j = 0; j < reservas.size(); j++){
									if(reservas.get(j).getNumQuarto() == codQuarto){
										
										if(!flg1){
											if(reservas.get(j).getDataSaida().before(entrada)){
												//Possível realizar check-in
												flg1 = true;
											}
										}else{
											if(reservas.get(j).getDataSaida().after(saida)){
												//Possível realizar check-in
												flg2 = true;
												break;												
											}
										}
										
									}
								}
							}else{
								//Quarto disponível
							}
						}
						if(flg2){
							break;
						}
					}
						
				}else{
					System.out.println("Opção inválida!");
				}
				
				//r = new Reserva();

				
			}else{
				System.out.println("A data de entrada deve ser menor que a data de saída!");
			}
						
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	
}
