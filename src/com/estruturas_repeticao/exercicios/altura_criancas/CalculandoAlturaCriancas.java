package com.estruturas_repeticao.exercicios.altura_criancas;

/*
 * 06/01/2024
 * Rodrigo Pereira Faria
 * Programa Altura dos Jovens
 */

public class CalculandoAlturaCriancas {
	public static void main(String[] args) {
		double pedroAltura = 1.50;
		double lucasAltura = 1.10;
		
		int anos = 0;
		System.out.printf("Altura Inicial de Pedro = %.2f%n", pedroAltura);
		System.out.printf("Altura Inicial de Lucas = %.2f%n", lucasAltura);
		while(lucasAltura <= pedroAltura) {
			pedroAltura = 1.50 + 0.02 * anos;
			lucasAltura = 1.10 + 0.03 * anos;
			
			System.out.printf("Altura de Pedro no ano %2d = %.2fm%n", anos, pedroAltura);
			System.out.printf("Altura de Lucas no ano %2d = %.2fm%n", anos, lucasAltura);
			
			
			if(lucasAltura == pedroAltura) {
				System.out.printf("A altura de Pedro e Lucas estão igualadas em %.2f no ano %d.%n"
						, lucasAltura, anos);
			}
			anos++;
		}
		System.out.printf("Lucas superou a altura de Pedro depois de %d anos com %.2fm"
				,anos,lucasAltura);
	}
}

