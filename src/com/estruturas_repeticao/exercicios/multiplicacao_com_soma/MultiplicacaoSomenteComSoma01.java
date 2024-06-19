package com.estruturas_repeticao.exercicios.multiplicacao_com_soma;

import javax.swing.JOptionPane;

/*
 * 01/01/2024
 * Rodrigo Pereira Faria
 * Programa da Multiplicação Somente Com Soma01
 */

public class MultiplicacaoSomenteComSoma01 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa da Multiplicação somente com soma");
		
		int multiplicando = Integer.parseInt(JOptionPane.showInputDialog("Digite o multiplicando: "));
		int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Digite o multiplicador: "));
		int produto;
		
		boolean verificaSeExisteZero = multiplicando == 0 || multiplicador == 0;
		
		if(verificaSeExisteZero) {
			produto = 0;
		}
		else {
			produto = multiplicando;
			System.out.println("Digitados = " + multiplicando + 
					" e " + multiplicador);
			boolean reduzindoMultiplicadorAte1 = multiplicador > 1;
			
			while (reduzindoMultiplicadorAte1) {
				System.out.println("Somando " + produto + " + " + multiplicando + " = " + (produto + multiplicando));
				produto += multiplicando;
				multiplicador--;
				reduzindoMultiplicadorAte1 = multiplicador > 1;
			}
		}
		JOptionPane.showMessageDialog(null, "Produto = " + produto);
	}
}
