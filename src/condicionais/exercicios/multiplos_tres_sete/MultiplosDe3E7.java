package condicionais.exercicios.multiplos_tres_sete;

import javax.swing.JOptionPane;

/*
 * 02/01/2024
 * Rodrigo Pereira Faria
 * Verificando se um número é múltiplo de 3 e 7
 */

public class MultiplosDe3E7 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Verificando Múltiplos de 3 e 7 ===");
		int entrada = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o número para ser verificado")
				);
				
		boolean divPor3 = entrada % 3 == 0;
		boolean divPor7 = entrada % 7 == 0;
		boolean divPorAmbos = divPor3 && divPor7;
		
		String resultado = "";
		//Verifica se é divisível por ambos 3 e 7
		if(divPorAmbos) {
			System.out.println("Divisível por ambos = " + divPorAmbos);
			resultado = "Divisível por 3 e 7";
		}
		// Se é por 3 somente
		else if(divPor3) {
			System.out.println("Divisível por três = " + divPor3);
			resultado = "Divisível somente por 3";
		}
		//Se é por 7 somente
		else if(divPor7) {
			System.out.println("Divisível por sete = " + divPor7);
			resultado = "Divisível somente por 7";
		}
		//Se não é nenhum dos citados
		else {
			System.out.printf("Resultados das condições%n"
					+ "Divisível por ambos = %b%n"
					+ "Divisível por 3 = %b%n"
					+ "Divisível por 7 = %b"
					, divPorAmbos
					, divPor3
					, divPor7);
			resultado = "Divisível por nenhum dos citados";
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}

