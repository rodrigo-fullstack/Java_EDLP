package com.estruturas_repeticao.estrutura_while;

import java.util.Scanner;

/* 
 * 30/12/23
 * Rodrigo Pereira Faria
 * Programa de Teste While 02
 */

public class TestandoWhile02 {

	public static void main(String[] args) {
		//Contagem dinâmica. O usuário definirá o número do limite do while e do incremento.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o limite do contagem: ");
		int limite = input.nextInt();
		
		System.out.print("Digite o número de incremento: ");
		int incremento = input.nextInt();
		input.close();
		//Contador
		int cont = 0; 
		//Removendo Warning, a variável continua sendo utilizada
		@SuppressWarnings("unused")
		boolean contMenorQueLimite = true;
		System.out.println("Limite = " + limite);
		while(contMenorQueLimite = cont<limite) {
			System.out.println("Contador = " + cont);
			cont += incremento;
			
		}
	}

}

//Limite = 15, incremento = 2; Primeiros: 0, 2, 4, 6; Ultimos: 12,14