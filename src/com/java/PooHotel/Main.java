package com.java.PooHotel;

import java.util.ArrayList;
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
		
		System.out.println("1 - Cliente cadastrado");
		System.out.println("2 - Novo cliente");
		op = sc.nextInt();
		
		switch(op){
		case 1:
			
			break;
			
		case 2:
			codCliente = cadastrarCliente();
			
			System.out.println("Qual tipo de quarto deseja?");
			System.out.println("Categoria			|	Valor da diária	| Capacidade");
			System.out.println("1) Standard			|	R$ 268,00		|	2");
			System.out.println("2) Vista Bosque		|	R$ 315,00		|	4");
			System.out.println("3) Vista Vale		|	R$ 353,00		|	4");
			System.out.println("4) Suíte			|	R$ 498,00		|	2");
			
			codQuarto = sc.nextInt();
			
			if(codQuarto > 0 && codQuarto < 5){
				
				for(int i = 0; i < 10; i++){
					if(quartos[i].getTipo() == codQuarto){
						//Zhuuu-liii, do the thing!
					}
				}
					
			}else{
				System.out.println("Opção inválida!");
			}
			
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	
}
