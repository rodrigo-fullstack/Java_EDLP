package condicionais.exercicios.desconto_produto_alto_valor;

import java.util.Scanner;

/*
 * 27/12/23
 * Rodrigo Pereira Faria
 * Exercício do Desconto dado se o valor do produto for alto
 * */

public class DescontoAltoValorDoProduto {
	public static void main(String[] args) {
		System.out.println("==== Programa do Desconto ===");
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do Produto em R$: ");
		double valorProduto = input.nextDouble();
		input.close();
		
		double valorFinal = valorProduto;
		double desconto = 0.0;
		
		boolean valorEntre199e400 = valorProduto > 199 && valorProduto < 400;
		boolean valorEntre399e900 = valorProduto > 399 && valorProduto < 900;
		boolean valorEntre899e1200 = valorProduto > 899 && valorProduto < 1200;
		boolean valorAcima1199 = valorProduto > 1199;
		
		//Testes
		System.out.println("Entre 199 e 400: "+ valorEntre199e400);
		System.out.println("Entre 399 e 900: " + valorEntre399e900);
		System.out.println("Entre 899 e 1200: " + valorEntre899e1200);
		System.out.println("Acima 1199: " + valorAcima1199);
		
		if(valorEntre199e400) {
			System.out.println("Desconto de 2%");
			desconto = 2./100.; //Precisa colocar . em double
		} else if (valorEntre399e900) {
			System.out.println("Desconto de 5%");
			desconto = 5./100.;
		} else if (valorEntre899e1200) {
			System.out.println("Desconto de 8%");
			desconto = 8./100.;
		} else if (valorAcima1199) {
			System.out.println("Desconto de 12%");
			desconto = 12./100.;
		} else {
			System.out.println("Sem desconto");
		}
		
		valorFinal = valorFinal * (1 - desconto);
		System.out.printf(
				"Valor do Produto foi R$%.2f%nValor Final do produto com desconto de %.0f%% foi R$%.2f"
				,valorProduto
				,(desconto*100)
				,valorFinal
				);
	}

}