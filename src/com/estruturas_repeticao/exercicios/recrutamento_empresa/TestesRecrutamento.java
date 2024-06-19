package com.estruturas_repeticao.exercicios.recrutamento_empresa;

import java.util.Scanner;

public class TestesRecrutamento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantidadeHomens = 0;
		int quantidadeMulheres = 0;
		
		int idadeHomem = 0;
		int idadeMulherExp = 0;
		
		double somaIdadeHomem = 0;
		double somaIdadeMulher = 0;
		
		//char experiencia = '.';
		//String experiencia = "";
		//boolean experiencia = false;
		int experiencia = 0;
		
		int opcaoContinuar = 1;
		while(opcaoContinuar == 1) {
			System.out.print("Sexo = ");
			char sexo = input.nextLine().charAt(0);
			
			//boolean candidatoHomem = sexo.equalsIgnoreCase("M");
			boolean candidatoHomem = sexo == 'M';
			
			//boolean candidataMulher = sexo.equalsIgnoreCase("F");
			boolean candidataMulher = sexo == 'F';
			
			if(candidatoHomem) {
				quantidadeHomens++;
			}
			
			else if(candidataMulher) {
				System.out.print("Idade (mulher) = ");
				idadeMulherExp = input.nextInt();
				
				//System.out.println("Possui experiência (true ou false): ");
				//experiencia = input.nextBoolean();
				//experiencia

				//System.out.println("Possui experiência (S ou N): ");
				//experiencia = input.nextLine().charAt(0);
				//boolean possuiExperiencia = experiencia == 'S';
				//experiencia = input.nextLine();
				//boolean possuiExperiencia = experiencia.equalsIgnoreCase("S");
				
				System.out.println("Possui experiência (0 ou 1): ");
				experiencia = input.nextInt();
				boolean possuiExperiencia = experiencia == 1;
				if(possuiExperiencia) {
					quantidadeMulheres++;
					
				}
			}
			else {
				System.out.println("Erro na digitação");
			}
			//System.out.print("Quer Continuar? Digite true para sim e false para não: ");
			//opcaoContinuar = input.nextBoolean(); Boolean funciona
			System.out.print("Quer Continuar? Digite 1 para sim e 0 para não: ");
			opcaoContinuar = input.nextInt();
			
		}
		input.close();
		
		System.out.println("Número de candidatos: " + quantidadeHomens);
		System.out.println("Número de candidatas: " + quantidadeMulheres);
	}

}
