package com.estruturas_repeticao.exercicios.divisao_com_subtracao;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = input.nextInt();
		input.close();
		
		int quociente = 0; 
		int resto = 0;
		
		//Divisor negativo
		/*while(num1 > 0) {
			num1 -= num2 * -1;
			quociente--;
		}*/
		
		//Dividendo negativo
		/*while(num1 < 0) {
			num1 -= num2 * -1;
			quociente--;
			if(num1 - num2 * -1 > 0) {
				resto = num1;
				break;
			}
		}*/
		
		while(num1 < 0) {
			if(num1 - num2 > 0) {
				resto = num1;
				break;
			}
			num1 -= num2;
			quociente++;
		}
		
		System.out.println("Quociente = " + quociente);
		System.out.println("Resto = " + resto);
	}

}
