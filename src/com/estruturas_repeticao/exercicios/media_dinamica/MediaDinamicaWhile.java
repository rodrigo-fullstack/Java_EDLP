package com.estruturas_repeticao.exercicios.media_dinamica;

import javax.swing.JOptionPane;
/*
 * 30/12/23
 * Rodrigo Pereira Faria
 * Programa da Média Dinâmica com While
 */
class MediaDinamicaWhile {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Programa da Média ===");
		//Mensagem de boas-vindas
		JOptionPane.showMessageDialog(null, 
				"Você vai digitar n números que você quiser \n" +
				"até pressionar e dar enter em -1. Ao final, será \n" +
				"exibido a soma de todos os seus números, a \n" +
				"quantidade de números digitados e a média entre eles.");
		
		int numDigitado = 0;
		int somatorio = 0;
		int quantidade = 0;
		double media = 0.00;
		
		boolean condicaoParada = false;
		
		while (true){
			// Dando entrada toda vez que a condição não é atendida
			numDigitado = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Digite um número ou -1 para interromper."));
			
			condicaoParada = numDigitado == -1;
			if (condicaoParada) break;
			
			quantidade++;
			//System.out.println("quantidade = " + quantidade);
			somatorio += numDigitado;
			//System.out.println("somatorio = " + somatorio);
		}
		media = (double) somatorio/quantidade; //É preciso para o double não gerar resultados arredondados
		JOptionPane.showMessageDialog(null, 
				"Somatório = " + somatorio + 
				"\nQuantidade = " + quantidade +
				"\nMédia = " + media);
		JOptionPane.showMessageDialog(null, "=== Fim ===");
	}
}
/*
Teste

Digite: 5, 4, 3, 9, 12, -1    
Resultado: 6,6

Digite: 100, 232, 705, 904, -1
Resultado: 485,25
*/