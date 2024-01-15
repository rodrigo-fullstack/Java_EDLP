package estruturas_repeticao.exercicios.media_dinamica;

import java.util.Scanner;

/*
 * 15/01/24
 * Rodrigo Pereira Faria
 * Media Dinâmica com For
 */

public class MediaDinamicaFor {

	public static void main(String[] args) {
		double soma = 0;
		int quantidade;
		
		Scanner input = new Scanner(System.in);
		double numDigitado = 0;
		
		//Quantidade < 100000000 para aceitar quantidades exorbitantes de números até digitar -1
		for(quantidade = 0; quantidade < 100000000; quantidade ++) {
			System.out.print("Digite um número qualquer ou -1 para interromper: ");
			
			numDigitado = input.nextDouble();

			if(numDigitado == -1) {
				input.close();				
				break;
			}
			
			soma += numDigitado;
			
		} 
		
		double media = soma/quantidade;
		
		System.out.printf("Quantidade de números = %d%n"
				+ "Somatório dos números = %.2f%n"
				+ "Média = %.2f%n"
				, quantidade, soma, media);
	}

}

/*
	Teste
	
	Digite: 5, 4, 3, 9, 12, -1    
	Resultado: 6,6
	
	Digite: 100, 232, 705, 904, -1
	Resultado: 485,25
*/