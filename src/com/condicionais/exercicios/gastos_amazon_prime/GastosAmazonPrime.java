package com.condicionais.exercicios.gastos_amazon_prime;

import java.util.Scanner;

/*
 * 28/12/23
 * Rodrigo Pereira Faria
 * Programa de Planejamento de Gastos com Amazon Prime
 */

public class GastosAmazonPrime {

	public static void main(String[] args) {
		System.out.println("=== Planejando gastos com Amazon Prime ===");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o seu plano desejado: mensal ou anual?");
		System.out.println("Para mensal: R$14,90 p mês, para anual: R$119,00 p ano");
		
		System.out.print("Plano = ");
		String plano = input.nextLine();
		
		System.out.print("Digite o tempo para ser verificado em anos: ");
		int tempoAnos = input.nextInt();
		input.close();
		boolean verificarPlanoMensal = plano.equalsIgnoreCase("mensal");
		boolean verificarPlanoAnual = plano.equalsIgnoreCase("anual");
		//Valor Plano
		double valorPlanoAtual = 0;
		double valorPlanoOposto = 0;
		//1 Ano Valor
		double valor1AnoAtual = 0;
		double valor1AnoOposto = 0;
		//Var = variável
		double valorAnoVarPlanoAtual = 0;
		double valorAnoVarPlanoOposto = 0;
		//Diferenças
		double diferenca1Ano = 0;
		double diferencaVarAno = 0;
		
		boolean flag = true;
		//Colocar flag para não dar erro caso o usuário digite algo errôneo
		if(flag){
			if(verificarPlanoMensal){
				valorPlanoAtual = 14.90;
				valorPlanoOposto = 119;
				valor1AnoAtual = valorPlanoAtual * 12;
				valor1AnoOposto = valorPlanoOposto;
				flag = false;
			} 
			else if (verificarPlanoAnual){
				valorPlanoAtual = 119;
				valor1AnoAtual = valorPlanoAtual;
				valorPlanoOposto = 14.90;
				valor1AnoOposto = valorPlanoOposto * 12;
				flag = false;
			} 
			else {
				System.out.println("Houve erro na sua digitação");
			}
		}
		if(!flag) {
			valorAnoVarPlanoAtual = valor1AnoAtual * tempoAnos;
			valorAnoVarPlanoOposto = valor1AnoOposto * tempoAnos;
			
			diferenca1Ano = valor1AnoAtual-valor1AnoOposto;
			diferencaVarAno = valorAnoVarPlanoAtual - valorAnoVarPlanoOposto;
			
			boolean verificar1AnoAtualMenor = valor1AnoAtual < valor1AnoOposto;
			boolean verificarVarAnoAtualMenor = valorAnoVarPlanoAtual < valorAnoVarPlanoOposto;
			
			//verifica se o resultado é negativo. Se for, vai multiplicar, se não vai manter multiplicando por 1.
			//Utilizado Operador Ternário
			diferenca1Ano *= verificar1AnoAtualMenor ? -1 : 1;
			diferencaVarAno *= verificarVarAnoAtualMenor ? -1 : 1;
			System.out.printf(
					"==================%n%n" +
					"Valor de 1 ano para o plano %s é R$%.2f%n" +
					"Valor de 1 ano para o plano Oposto é R$%.2f%n" +
					"Diferença entre esses planos é de R$%.2f%n%n" +
					"==================%n%n" +
					"Valor de %d anos para o plano %s é R$%.2f%n" +
					"Valor de %d anos para o plano Oposto é R$%.2f%n" +
					"Diferença entre esses planos é de R$%.2f%n%n" + 
					"=================="
					
					, plano
					, valor1AnoAtual
					, valor1AnoOposto
					, diferenca1Ano
					, tempoAnos
					, plano
					, valorAnoVarPlanoAtual
					, tempoAnos
					, valorAnoVarPlanoOposto
					, diferencaVarAno
					);
		}
		
	}
}

