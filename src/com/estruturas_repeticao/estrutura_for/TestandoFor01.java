package com.estruturas_repeticao.estrutura_for;

import java.util.Scanner;

/*
 * 01/01/2024
 * Rodrigo Pereira Faria
 * Testando Estrutura For 01
 */

public class TestandoFor01 {
	public static void main(String[] args) {
		
		System.out.println("=== Primeiro For ===");
		//For mais básico possível
		for (int i = 0; i < 10; i++ ) {
			System.out.println("i = " + i);
			
		}
		
		System.out.println("=== Segundo For ===");
		boolean iterarMenorQue10 = true;
		for (int i = 0; iterarMenorQue10; i++) {
			System.out.println("i = " + i);
			iterarMenorQue10 = i < 10;//Gera 11 números (0 a 10) por verificar sempre o valor anterior do i
		}
		// System.out.println(i); 
		// O i só existe no contexto do for
		
		System.out.println("=== Terceiro For ===");
		//Declarando variável antes de inicializar no for
		int cont;
		for (cont = 0; cont<10; cont++) {
			System.out.println("Contador = " + cont);
		}
		System.out.println(cont);
		
		System.out.println("=== Quarto For ===");
		for (int i = 0; true; i++) {
			if(i == 10) break;
			System.out.println("i = " + i);
		}
		
		System.out.println("=== Quinto For ===");
		for (int i = 1000; true; i--) {
			if(i<=990) break;
			System.out.println("i = " + i);
		}
		
		System.out.println("=== Sexto For ===");
		for (double i = 0.0; true; i+=0.1) {
			if(i>1) break;
			System.out.println("i = " + i);
			
		}
		
		System.out.println("=== Sétimo For ===");
		Scanner input = new Scanner(System.in);
		
		double soma = 0;
		
		for (int i = 0; i != -1; i = input.nextInt()) {
			soma += i;
		}
		System.out.println(soma);
		input.close();
		
		
		System.out.println("=== Oitavo For ===");
		for (int i = 0; i<10;) {
			System.out.println("i = " + i);
			i++;	
		}
	}
}
