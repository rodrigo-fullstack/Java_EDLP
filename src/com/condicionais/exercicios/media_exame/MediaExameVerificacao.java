package com.condicionais.exercicios.media_exame;

import javax.swing.JOptionPane;

/*
 * 02/01/2024
 * Rodrigo Pereira Faria
 * Programa da Média do Estudante
 */

public class MediaExameVerificacao {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Verificação da média do estudante ===");
		
		int quantidade = 3;
		double prova1 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a nota da prova1: "));
		double prova2 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a nota da prova2: "));
		double prova3 = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a nota da prova3: "));
		
		double media = (prova1 + prova2 + prova3) / quantidade;
		
		boolean passouNaPrimeiraFase = media >= 7;
		String resultado = "";
		if(!passouNaPrimeiraFase) {
			System.out.println("Não passou na primeira fase e está passando por exame.");
			double exame = Double.parseDouble(
					JOptionPane.showInputDialog("Digite a nota do exame: "));
			quantidade = 2;
			double mediaFinal = (media + exame) / quantidade;
			boolean passouNaSegundaFase = mediaFinal >= 5;
			if(!passouNaSegundaFase) {
				resultado = "reprovado";
			}
			else {
				resultado = "aprovado";
			}
		}
		else {
			resultado = "aprovado";
		}
		
		JOptionPane.showMessageDialog(null, "Resultado final "
				+ "do aluno = " + resultado);
		
	}
}

