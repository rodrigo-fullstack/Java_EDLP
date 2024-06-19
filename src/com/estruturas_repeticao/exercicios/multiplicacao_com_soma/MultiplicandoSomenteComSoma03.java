package com.estruturas_repeticao.exercicios.multiplicacao_com_soma;

import javax.swing.JOptionPane;

/*
 * 01/01/2024
 * Rodrigo Pereira Faria
 * Programa da Multiplicação Somente Com Soma03
 */

public class MultiplicandoSomenteComSoma03 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa da Multiplicação com Soma 03");
		
		int multiplicando = Integer.parseInt(JOptionPane.showInputDialog("Digite o multiplicando: "));
		int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Digite o multiplicador: "));
		
		int produto = 0;
		int cont = 0;
		
		boolean contDiferenteMult = cont != multiplicador;
		boolean NumsDiferenteZero = multiplicando != 0;
		boolean loop = contDiferenteMult && NumsDiferenteZero; 
		
		while(loop) {
			System.out.println(produto + " + " + multiplicando + " = " + (produto + multiplicando));
			produto += multiplicando;
			cont++;
			
			//Condições. Não precisa mais verificar se é diferente de zero
			//O interessante de fazer dessa forma é que a condição pode ser alterada durante o while.
			contDiferenteMult = cont != multiplicador;
			loop = contDiferenteMult;
		}
		
		JOptionPane.showMessageDialog(null, "Produto = " + produto);
		
	}
}
