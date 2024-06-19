package com.estruturas_repeticao.exercicios.maiores_numeros;

import javax.swing.JOptionPane;

/*
 * 30/12/2023
 * Rodrigo Pereira Faria
 * Verificação dos 3 maiores digitados pelo usuário
 */

public class Os3MaioresNumeros {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, 
				"Bem-vindo ao programa dos 3 maiores números");
		
		int numDigitado = 0;
		int maior01 = 0;
		int maior02 = 0;
		int maior03 = 0;
		int quantidade = 0;
		int limite = Integer.parseInt(
				JOptionPane.showInputDialog(
				"Digite a quantidade de números que você digitará: "));
		boolean naoAtingiuLimite;
		
		boolean digitadoMaior01 = false;
		boolean digitadoMaior02 = false;
		boolean digitadoMaior03 = false;
		boolean digitadoMaisDoQue1Num;		//Objetivo é armazenar os 3 maiores números
		while(naoAtingiuLimite = quantidade < limite) {
			numDigitado = Integer.parseInt(
					JOptionPane.showInputDialog(
					"Digite o número desejado: "));
			
			quantidade++;
			
			digitadoMaior01 = numDigitado > maior01;
			
			digitadoMaior02 = numDigitado > maior02 &&
							numDigitado != maior01;
			
			digitadoMaior03 = numDigitado > maior03 && 
							numDigitado != maior02 && 
							numDigitado != maior01;
			
			if(digitadoMaior01) {
				digitadoMaisDoQue1Num = quantidade > 1;
				
				// Efeito empilhamento, m3 recebe m2, 
				//m2 recebe m1, m1 recebe novo número
				if(digitadoMaisDoQue1Num) {
					maior03 = maior02;
					maior02 = maior01;
				}
					
				maior01 = numDigitado;
			}
			//Verifica se o número digitado é maior do que o
			//maior 02 e se é diferente do maior01
			else if (digitadoMaior02) 
			{
				maior03 = maior02;
				maior02 = numDigitado;
			}
			//Verifica se o número digitado é maior do que maior 03
			//e diferente dos anteriores
			else if (digitadoMaior03)
			{
				maior03 = numDigitado;
			}
			else {
				System.out.println("...");
			}
		}
		JOptionPane.showMessageDialog(null, 
				"Primeiro Maior = " + maior01 +
				"\nSegundo Maior = " + maior02 +
				"\nTerceiro Maior = " + maior03
				
				);
		System.out.println("Número maior = " + maior01);
		System.out.println("=== Fim === ");
		//Removendo Warning
		System.out.println(naoAtingiuLimite);
	}
}