package com.estruturas_repeticao.estrutura_while;

/*
 * Rodrigo Pereira Faria
 * 30/12/23
 * Contagem de 0 até 9
 */

public class TestandoWhile01 {

	public static void main(String[] args) {
		// While com verificação dada por 
		// parâmetro de atribuição
		int contador = 0;
		boolean contMenorQue10 = true;
		System.out.println("=== Primeiro While ===");
		while(contMenorQue10 = contador<10) {
			System.out.println("Contador é menor que 10? " + contMenorQue10);
			System.out.println("Contador = " + contador);
			System.out.println("Soma mais um no contador");
			contador++;
			
		}
		System.out.println("Contador é menor que 10? " + contMenorQue10 + "\n");
		
		// While com condição sem variável
		System.out.println("=== Segundo While ===");
		contador = 0;
		while(contador<10) {
			System.out.println("Contador = " + contador);
			contador++;
		}
		
		System.out.println("\n=== Terceiro While ===");
		
		// While entrando como true a partir de variável e 
		// tendo condição mudada dentro
		contador = 0;
		contMenorQue10 = true;
		while(contMenorQue10) {
			contMenorQue10 = contador<10;
			System.out.println("Contador = " + contador);
			//contador = 20; Executa uma vez
			contador++;
		}
		
		System.out.println("\n=== Quarto While ===");
		
		// While true com teste dentro da estrutura com 
		// lógica relacionada a maior igual a 10
		contador = 0;
		boolean contMaiorIgual10 = false;
		while(true) {			
			if(contMaiorIgual10 = contador >= 10) {
				System.out.println("Contador é maior ou igual a 10? " + contMaiorIgual10);
				break;
			}
			System.out.println("Contador = " + contador);
			contador++;
		}
		
		System.out.println("\n=== Quinto While ===");
		//While entrando com variável começando como true, tendo sua condição alterada 
		//dentro do laço e verificação para cumprir com os passos, 
		//se não for verdade quebra o laço de repetição
		contador = 0;
		contMenorQue10 = true;
		while(contMenorQue10) {
			contMenorQue10 = contador<10;
			if(contMenorQue10) {
				System.out.println("Contador = " + contador);
				contador++;
			}
			else {
				break;
			}
		}
		
		System.out.println("\n=== Sexto While ===");
		// While com lógica invertida, verificando 
		// se não é maior igual a 10
		contador = 0;
		contMaiorIgual10 = false;
		while(!(contMaiorIgual10 = contador >= 10)) {
			System.out.println("Contador = " + contador);
			contador++;
		}
		/*
		 * boolean contMenorQue10 = contador<10;
		 while(contMenorQue10) {
			System.out.println("Contador =" + contador);
			contador++;
		} 
		Este daqui faz um loop infinito, pois a condição somente está sendo verificada antes de entrar no laço, não aproveitando o valor retirado na estrutura
		 */
	}
}
