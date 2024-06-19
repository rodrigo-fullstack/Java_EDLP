package com.estruturas_repeticao.exercicios.media_dinamica;

import java.util.Scanner;

/*
 * 01/01/2024
 * Rodrigo Pereira Faria
 * Média Dinâmica com Do While
 */

public class MediaDinamicaDoWhile {
	public static void main(String[] args) {
		System.out.println(" === Média Dinâmica ===");
		
		
		int quantidade = 0;
		int somatorio = 0;
		boolean condicao = false;
		Scanner input = new Scanner(System.in);
		int numDigitado = 0;
		do {
			System.out.println("Digite um número ou então -1 para interromper ");
			System.out.print(": ");
			numDigitado = input.nextInt();
			condicao = numDigitado == -1;
			
			if(condicao) break;
			
			somatorio+=numDigitado;
			quantidade++;
		}while(true);
		
		input.close();
		
		boolean verificaQuantidade = quantidade>0;
		if(verificaQuantidade) {
			double media = (double) somatorio/quantidade;
			System.out.println("A média foi: " + media);
		}
		System.out.println("=== Fim ===");
		
	}
}
/*
Teste

Digite: 5, 4, 3, 9, 12, -1    
Resultado: 6,6

Digite: 100, 232, 705, 904, -1
Resultado: 485,25
*/