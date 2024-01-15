package condicionais.exercicios.forma_pgto_complexo;

import java.util.Scanner;

/*
 * 03/01/2024
 * Rodrigo Pereira Faria
 * Forma de Pagamento Complexa
 */

public class FormaPgtoComplexo01 {
	public static void main(String[] args) {
		System.out.println("=== Forma de Pagamento Complexa ===");
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor da compra: ");
		double valorInicial = input.nextDouble();
		
		System.out.printf("Selecione uma das formas de pagamentos: %n"
				+ "1: à vista (15%% desconto)%n"
				+ "2: cheque pré-datado de 30 dias (10%% desconto)%n"
				+ "3: parcelado em 3 vezes (5%% desconto)%n"
				+ "4: parcelado em 6 vezes (sem desconto)%n"
				+ "5: parcelado em 12 vezes (8%% acréscimo)%n"
				+ "Forma de pagamento = ");
		int formaPgto = input.nextInt();
		input.close();
		
		int parcelasQuantidade = 0;
		
		double valorFinal = valorInicial;
		double desconto = 0;
		double acrescimo = 0;
		double valorParcelas = valorInicial;
		
		switch(formaPgto) {
		//Não gosto de fazer assim, repete muita linha
		case 1:
			desconto = 15./100.;
			
			valorFinal = valorInicial * (1 - desconto);
			
			break;
		
		case 2:
			desconto = 10./100.;
			
			valorFinal = valorInicial * (1 - desconto);
			
			break;
			
		case 3: 
			desconto = 5./100.;

			parcelasQuantidade = 3;
			valorFinal = valorInicial * (1 - desconto);
			valorParcelas = valorFinal / parcelasQuantidade;
			
			break;
			
		case 4:
			parcelasQuantidade = 6;
			valorParcelas = valorFinal / parcelasQuantidade;
			
			break;
			
		case 5:
			acrescimo = 8./100.;
			
			parcelasQuantidade = 12;
			valorFinal = valorInicial * (1 + acrescimo);
			valorParcelas = valorFinal / parcelasQuantidade;
			
			break;
			
		default:
			System.out.println("Digitada opção incorreta.");
		}
		
		double diferenca = valorInicial - valorFinal;
		
		System.out.printf(
				"Valor da Compra = %.2f%n"
				+ "valorFinal = %.2f%n"
				+ "Diferença = %.2f%n"
				, valorInicial
				, valorFinal
				, diferenca
				);
		
		if(diferenca > 0) {
			System.out.println("Houve um desconto de " + (desconto*100)
					+ "% em sua compra. ");
		}
		else if(diferenca == 0) {
			System.out.println("Não houve alteração no valor da compra.");
		}
		else {
			System.out.println("Houveram-se juros de " + (acrescimo*100) 
					+ "% em sua compra");
		}
		
		if(parcelasQuantidade!=0) {
			System.out.printf(
					"Quantidade de parcelas = %d%n"
					+ "Valor das Parcelas = %.2f%n"
					, parcelasQuantidade
					, valorParcelas
					);
		}
		
		// Pontos a melhorar: 
		// Repetição de código
		// Condições Finais
	}
	
}
