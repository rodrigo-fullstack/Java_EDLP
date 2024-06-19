package com.estruturas_repeticao.exercicios.multiplicacao_com_soma;

import java.util.Scanner;

/*
 * 01/01/2024
 * Rodrigo Pereira Faria
 * Programa da Multiplicação Somente Com Soma02
 */

public class MultiplicandoSomenteComSoma02 {

	public static void main(String[] args) {
		//Outra forma
		System.out.println(" === Programa da Multiplicação somente Com Soma 02");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o multiplicando: ");
		int num1 = input.nextInt(); 
		
		System.out.print("Digite o multiplicador: ");
		int num2 = input.nextInt();
		input.close();
		
		System.out.println("Digitados " + num1 + " e " + num2);
		
		int produto = 0;
		
		while(num2 > 0 && num1 != 0) {
			System.out.println("Somando " + produto + " + " + num1 + " = " + (produto+num1));
			System.out.println("Multiplicador atual = " + num2);
			produto = produto + num1;
			num2--;
		}
		System.out.println("Produto final = " + produto);
	}
}
