package com.condicionais.exercicios.jogo_numero_euler;

/*
 *  11/12/2023
 *  Rodrigo Pereira Faria
 *  Jogo Numero Euler
 */

import java.util.Scanner;

public class NumeroEuler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bem-vindo ao programa da adivinhação do número de Euler.");
      
		System.out.print("Digite o número de Euler com suas primeiras 5 casas decimais sem pesquisar \n(digite  com \",\"): ");
		String entrada = input.nextLine();
		input.close();

		boolean vitoria = false;
		//Switch tem problemas com doubles
		switch(entrada) {
		case "2": 
			System.out.println("Você acertou o primeiro dígito do número de Euler");
			System.out.println("Faltam 5 casas decimais");
			break;
		
		case "2,7":
			System.out.println("Você digitou até a primeira casa decimal, está se aproximando");
			break;
			
		case "2,71":
			System.out.println("Você digitou até a segunda casa decimal");
			break;
			
		case "2,718": 
			System.out.println("Chegou na terceira casa decimal, faltam 2");
			break;
			
		case "2,7182":
			System.out.println("Falta 1 única casa decimal");
			break;
			
		case "2,71827":
			System.out.println("Está muito próximo!!!");
			break;
			
		case "2,71829":
			System.out.println("Está muito próximo!!!");
			break;
			
		case "2,71828":
			System.out.println("Valor encontrado");
			vitoria = true;
			break;
		default: 
    	  
			System.out.println("Você errou, tente novamente reiniciando o programa. ");
      }
		
	if(vitoria)
		System.out.println("Parábens, você encontrou o valor aproximado "
				+ "do número de Euler, que é 2,71828");
	
   }
}