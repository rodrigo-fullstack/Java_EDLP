package com.condicionais.exercicios.forma_pgto_complexo;

import javax.swing.JOptionPane;

/*
 * 03/01/2024
 * Rodrigo Pereira Faria
 * Forma Pagamento Complexo 02
 */

public class FormaPgtoComplexo02 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Forma de Pagamento Complexo 02 ===");
		double valorInicial = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da compra:"));
		
		JOptionPane.showMessageDialog(null, "As formas de pagamentos disponíveis são: \n"
				+ "1: à vista 15% desconto\n"
				+ "2: cheque pré-datado de 30 dias 10% desconto\n"
				+ "3: parcelado em 3 vezes 5% desconto\n"
				+ "4: parcelado em 6 vezes sem alteração \n"
				+ "5: parcelado em 12 vezes 8% acréscimo");
		
		int formaPgto = Integer.parseInt(JOptionPane.showInputDialog("Digite a forma de pagamento: "));
		
		int parcelas = 0;
		
		double valorFinal = valorInicial;
		double percentual = 0;
		double valorParcelas = valorInicial;
		double diferenca = 0;
		
		boolean flag = true;
		
		switch(formaPgto) {
		case 1:
			percentual = -15. / 100.;
			break;
			
		case 2:
			percentual = -10. / 100.;
			break;
			
		case 3:
			percentual = -5./100.;
			parcelas = 3;
			break;
			
		case 4:
			parcelas = 6;
			break;
			
		case 5:
			percentual = 8./100.;
			parcelas = 12;
			break;
			
		default: 
			System.out.println("Erro na digitação");
			flag = false;
		}
		
		//Impedindo de exibir e calcular caso o usuário digite opção errada.
		
		if(flag) {
			valorFinal = valorInicial * (1+(percentual));
			
			diferenca = valorInicial - valorFinal;
			
			JOptionPane.showMessageDialog(null, 
					"Valor Inicial = " + valorInicial 
					+ "\nValor Final = " + valorFinal
					+ "\nDiferença = " + diferenca
					);
			
			boolean verificaSeDesconto = diferenca>0;
			if(verificaSeDesconto) {
				JOptionPane.showMessageDialog(null, "Houve desconto de " + (percentual * (-100)) + "% na sua compra");
			}
			else if(formaPgto == 4) { //Sem desconto ou acréscimo
				JOptionPane.showMessageDialog(null, "Não houve alteração no valor.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Houve juros de " + (percentual * 100) + "% na compra");
			}
			
			boolean compraParcelada = parcelas != 0;
			
			if(compraParcelada) {
				valorParcelas = valorFinal / parcelas;
				JOptionPane.showMessageDialog(null, 
						"Parcelas = " + parcelas
						+ "\nValor Das Parcelas = " + valorParcelas);
			}
		}
		
		System.out.println("=== Fim ===");
	} //Melhorado a repetição de código 
}