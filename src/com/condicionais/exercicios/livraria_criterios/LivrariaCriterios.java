package com.condicionais.exercicios.livraria_criterios;

import java.util.Scanner;

/*
 * 02/01/2024
 * Rodrigo Pereira Faria
 * Desconto da Livraria em Critérios
 */

public class LivrariaCriterios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de livros desejados: ");
		int quantidadeLivros = input.nextInt();
		input.close();
		
		double criterioA = 0.25 * quantidadeLivros + 7.50;
		double criterioB = 0.5 * quantidadeLivros + 2.50;
		
		System.out.printf(
				"Valor CritérioA = %.2f%n"
				+ "Valor CritérioB = %.2f%n"
				, criterioA
				, criterioB
				);
		
		boolean criterioMelhorA = criterioA < criterioB;
		if(criterioMelhorA) {
			System.out.println("O Critério A é melhor do que o critério B para " 
		+ quantidadeLivros + " livros");
		}
		else if(criterioA == criterioB) {
			System.out.println("Ambos critérios possuem mesmo valor para " 
		+ quantidadeLivros + " livros");
		}
		else {
			System.out.println("Critério B é melhor do que o critério A para "
					+ quantidadeLivros + " livros");
		}
	}
}