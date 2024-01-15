package condicionais.exercicios.verificar_impar;

import javax.swing.JOptionPane;

/*
 * 29/12/23
 * Rodrigo Pereira Faria
 */

public class VerificandoImparOuPar {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Programa Par ou Ímpar === ");
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser verificado: "));
		
		int restoDivPor2 = num%2;
		//Verifica se o número não é divisível, possuindo resto diferente de 0
		boolean numNaoDivPor2 = restoDivPor2 != 0;
		
		//Se for verdade é ímpar
		if(numNaoDivPor2) {
			JOptionPane.showMessageDialog(null, "Número " + num + " é ímpar");
		}
		else {
			JOptionPane.showMessageDialog(null, "Número " + num + " é par");
		}
		
	}
}