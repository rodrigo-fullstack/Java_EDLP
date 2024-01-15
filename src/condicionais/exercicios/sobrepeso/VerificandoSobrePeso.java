package condicionais.exercicios.sobrepeso;

import java.util.Scanner;

/*
 * 06/01/2024
 * Rodrigo Pereira Faria
 * Verificando Paciente SobrePeso
 * 
 */

public class VerificandoSobrePeso {

	public static void main(String[] args) {
		System.out.println("== Verificando se o paciente está acima do peso ideal == ");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual o sexo do paciente? (M ou F): ");
		//Lendo caracter
		char sexo = input.next().charAt(0);
		
		System.out.print("Digite a altura em metros: ");
		double altura = input.nextDouble();
		
		System.out.print("Digite o peso em quilogramas: ");
		double peso = input.nextDouble();
		input.close();
		
		double pesoIdeal = 0;
		
		boolean pacienteHomem = sexo == 'm' || sexo == 'M';
		boolean pacienteMulher = sexo == 'f' || sexo == 'F';
		boolean flag = true;
		
		if(pacienteHomem) {
			pesoIdeal = 72.7 * altura - 58;
		}
		else if(pacienteMulher) {
			pesoIdeal = 62.1 * altura - 44.7;
		}
		else {
			System.out.println("Sexo digitado incorretamente");
			flag = false;
			//return; Encerra o bloco main
		}
		
		if(flag) {
			System.out.printf("Faixa do peso ideal do paciente = %.2fkg", pesoIdeal);
			
			boolean pacienteEstaPesoIdeal = peso <= pesoIdeal;
			if(pacienteEstaPesoIdeal) {
				System.out.printf(
						"O paciente de altura %.2fm e peso %.2fkg "
						+ "está na faixa do peso ideal."
						, altura, peso);
			}
			else {
				System.out.printf("O paciente de altura %.2fm e peso %.2fkg "
						+ "está sobrepeso"
						, altura, peso);
			}
			
		}
	}

}