package com.vetores_matrizes.testando_vetores;

import java.util.Random;

/*
 * 12/02/24
 * Rodrigo Pereira Faria
 * Testando Vetores 02
 * 
 */

public class TestandoVetores02 {

	public static void main(String[] args) {
		int num[] = new int[10];
		
		//Se não definir valores, começam com zero
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);
		
		//Começam com null
		String nomes[] = new String[5];
		for(int i = 0; i < nomes.length; i++)
			System.out.println(nomes[i]);
		
		double numeros[];//null
		
		//System.out.println(numeros[1]); Gera erro
		//imprimindoVetor(numeros);
		imprimindoVetor(num);
		
		System.out.println("\n===Criando vetor por método===");
		int[] vetorInteros = criarVetor();
		imprimindoVetor(vetorInteros);
		
		//System.out.println(vetorInteiros[-1]); Gera erro de IndexOutOfBonds
	}

	//Criando método teste
	public static void imprimindoVetor(int[] vetor) {
		System.out.println("Imprimindo Vetor com método");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			if(i == vetor.length-1) {
				System.out.println(vetor[i]);
			}
		}
	}
	
	public static int[] criarVetor() {
		//Classe para gerar números aleatórios
		Random random = new Random();
		
		int[] vetor = new int[5];
		
		//Cria um vetor de números aleatórios
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = random.nextInt(10);
		return vetor;
	}
}
