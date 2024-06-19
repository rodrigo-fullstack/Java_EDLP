package com.estruturas_repeticao.exercicios.divisao_com_subtracao;

import javax.swing.JOptionPane;

/*
 * 19/01/24
 * Rodrigo Pereira Faria
 * Divisão Somente com Subtração estendido para números negativos
 */

public class ExtensaoNumerosNegativos {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Dividindo com Subtração ===");
		int num1 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o primeiro número: "));
		int num2 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int quociente = 0;
		int resto = 0;
		
		boolean divisorDiferenteZero = num2 != 0; 
		
		JOptionPane.showMessageDialog(null, "Dividendo = " + num1 
				+ "\nDivisor = " + num2);
		//Verifica se o divisor é diferente de zero
		if(divisorDiferenteZero) {
			boolean previsaoNegativo = false;
			boolean divisorNegativo = num2 < 0;
			boolean dividendoNegativo = num1 < 0;
			boolean ambosNegativos = divisorNegativo && dividendoNegativo;
			
			//Se ps dois números forem negativos
			if(ambosNegativos) {
				while(num1 < 0) {
					previsaoNegativo = num1 - num2 > 0;
					if(previsaoNegativo) {
						resto = num1;
						break;
					}
					
					num1 -= num2;
					quociente++;
				}
			}
			
			//Digitado num2 negativo
			else if(divisorNegativo) {
				while(num1 > 0) {
					previsaoNegativo = num1 - (num2 * -1) < 0;
					// Verifica se o próximo número é negativo para armazenar o resto
					if(previsaoNegativo){
						resto = num1;
						break;
					}
					
					num1 -= num2 * -1;
					quociente--;
				}
			}
			//Digitado num1 negativo
			else if(dividendoNegativo) {
				while (num1 < 0) {
					previsaoNegativo = num1 - num2 * -1 > 0;
					if(previsaoNegativo) {
						resto = num1;
						break;
					}
					
					num1 -= num2 * -1;
					quociente--;
				}
			}
			
			// Se ambos forem positivos
			else {
				// Enquanto o primeiro número é maior do que 0, reduz do segundo número
				while(num1 > 0) {
					//Previsão da próxima operação, 
					previsaoNegativo = num1 - num2 < 0; //Pode declarar dentro do while que não dá erro de declaração
					if(previsaoNegativo) {
						resto = num1;
						break;
					}
					
					num1 -= num2;
					quociente++;
				}
			}
			//Saída dos dados
			JOptionPane.showMessageDialog(null, 
					"Quociente = " + quociente
					+ "\n Resto = " + resto);
		}
		
		//Evitando divisão por zero
		else {
			JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
		}
		System.out.println(" === Fim === ");
	}

}

/*
	Teste de mesa:
	
	20 e 4 = 5;
	23 e 3 = 7, resto = 2;
	
	-10 e 2 = -5;
	-13 e 3 = -4, resto = -1;
	
	12 e -4 = -3;
	15 e -7 = -2, resto = 1;
	
	-20 e -5 = 4; 
	-50 e -3 = 16, resto = -2;
	
	1 e 2 = 0, resto = 1
*/