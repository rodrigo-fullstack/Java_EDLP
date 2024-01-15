package condicionais.exercicios.soma_diferenca_tempo;

import java.util.Scanner;

/*
 * 04/01/2024
 * Rodrigo Pereira Faria
 * Somando Intervalos de tempo
 */

public class SomaTempo {
	public static void main(String[] args) {
		System.out.println("=== Somando Intervalos de Tempo ===");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro intervalo de tempo: ");
		System.out.print("Horas = ");
		int horas01 = input.nextInt();
		
		System.out.print("Minutos = ");
		int minutos01 = input.nextInt();
		
		System.out.print("Segundos = ");
		int segundos01 = input.nextInt();
		
		System.out.println("\nDigite o segundo Intervalo de tempo:");
		System.out.print("Horas = ");
		int horas02 = input.nextInt();
		
		System.out.print("Minutos = ");
		int minutos02 = input.nextInt();
		
		System.out.print("Segundos = ");
		int segundos02 = input.nextInt();
		input.close();
		
		int somaHoras = horas01 + horas02;
		int somaMinutos = minutos01 + minutos02;
		int somaSegundos = segundos01 + segundos02;
		
		int limiteMinSeg = 60;
		int quantidadeExcedenteMin = somaMinutos / limiteMinSeg;
		int quantidadeExcedenteSeg = somaSegundos / limiteMinSeg;
		
		boolean minutosExcedente = somaMinutos >= limiteMinSeg; 
		boolean segundosExcedente = somaSegundos >= limiteMinSeg;
		
		//Verifica se os minutos excederam o limite
		if(minutosExcedente) {
			// Soma às horas a quantidade de vezes excedente
			somaHoras += quantidadeExcedenteMin;
			
			// Calculando minutos restantes 
			somaMinutos %= (limiteMinSeg * quantidadeExcedenteMin);
		}
		
		// Se os segundos também excederem, faz a mesma coisa, porém aumentando os minutos
		if(segundosExcedente) {
			somaMinutos += quantidadeExcedenteSeg;
			somaSegundos %= limiteMinSeg * quantidadeExcedenteSeg;
			
			// Verifica se precisa repetir os passos de cima 
			// para caso a soma com os minutos resulte em número maior do que 60
			if(somaMinutos >= limiteMinSeg) {
				quantidadeExcedenteMin = somaMinutos / 60;
				somaMinutos %= (limiteMinSeg * quantidadeExcedenteMin);
				somaHoras += quantidadeExcedenteMin;
			}
		}
		
		System.out.printf(
				"Soma dos intervalos:%n"
				+ "Horas = %d%n"
				+ "Minutos = %d%n"
				+ "Segundos = %d%n"
				, somaHoras
				, somaMinutos
				, somaSegundos
				);
	}
}