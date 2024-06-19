package com.estruturas_repeticao.estrutura_do_while;

/*
 * 01/01/24
 * Rodrigo Pereira Faria
 * TestandoDoWhile
 */
public class EstruturaDoWhile {

	public static void main(String[] args) {
		int cont = 0;
		int limite = 100;
		boolean contMenorLimite = false;
		
		do {
			System.out.println(cont);
			cont++;
			contMenorLimite = cont < limite;
		} while(contMenorLimite);
		
		//Ainda assim, é melhor o while pois há maior controle utilizando o true.

			
	}

}
