package com.condicionais.exercicios.abono_salarial;

import java.util.Scanner;

/*
 * 29/12/2023
 * Rodrigo Pereira Faria
 * Programa Abono Salarial da Empresa 
 */

public class AbonoSalarialXSoftware {

	public static void main(String[] args) {
		System.out.println("=== Programa do Abono Salarial da XSoftware");
		System.out.println("A empresa XSoftware teve muitos lucros esse mês. Você está dando abonos para funcionários que trabalharam acima ou igual a 5 anos ou abaixo desse tempo. ");
		System.out.println("Se ele trabalhou acima ou igual a 5 anos, forneça bônus de 20%.");
		System.out.println("Se não trabalhou todo esse tempo, forneça bônus de 10%");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a seguir o salário do funcionário.");
		System.out.print("Salário = R$");
		double salario = input.nextDouble();
		
		System.out.println("Digite a seguir os anos trabalhados pelo funcionário: ");
		System.out.print("Anos = ");
		int anosTrabalhados = input.nextInt();
		input.close();
		
		double percentualAbono = 0;
		double abono = 0;
		
		//Trab = trabalho
		boolean trabAcimaIgual5Anos = anosTrabalhados >= 5;
		if(trabAcimaIgual5Anos) {
			System.out.println("Você recebeu um bônus de 20% por ser veterano!");
			percentualAbono = 20.00/100.00;
		}
		else {
			System.out.println("Você recebeu um bônus de 10%.");
			percentualAbono = 10.00/100.00;
		}
		abono = salario * percentualAbono;
		System.out.printf("O bônus do funcionário foi: R$%.2f", abono);
	}

}

//Entrada: 5000 e 11 anos, 5000 e 6 anos
