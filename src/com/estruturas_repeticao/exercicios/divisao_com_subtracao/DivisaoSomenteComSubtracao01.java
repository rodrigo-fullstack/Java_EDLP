package com.estruturas_repeticao.exercicios.divisao_com_subtracao;

import javax.swing.JOptionPane;

/*
 * 18/01/24
 * Rodrigo Pereira Faria
 * Divisão Somente Com Subtração 01
 */

public class DivisaoSomenteComSubtracao01 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Dividindo com Subtração ===");
		int num1 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o primeiro número: "));
		int num2 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int quociente = 0;
		int resto = 0;
		
		boolean divisorDiferenteZero = num2 != 0; 
		
		//Verifica se o divisor é diferente de zero
		if(divisorDiferenteZero) {
			// Enquanto o primeiro número é maior do que 0, reduz do segundo número
			while(num1 > 0) {
				num1 -= num2;
				quociente++;
				
				boolean previsao = num1 - num2 < 0; //Pode declarar dentro do while que não dá erro de declaração
				
				//Previsão da próxima operação, previnindo o resto de se tornar negativo
				if(previsao) {
					resto = num1;
					break;
				}
			}
			
			JOptionPane.showMessageDialog(null, 
					"Quociente = " + quociente
					+ "\n Resto = " + resto);
		}
		else {
			JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
		}
		
	}

}
