package estruturas_repeticao.exercicios.recrutamento_empresa;

import java.util.Scanner;

public class TestesRecrutamento02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		while(true) {
			
			opcao = input.nextInt();
			switch(opcao) {
			case 1: 
				System.out.println("Oi");
				break;
			
			
			default:
				System.out.println("Tchau");
				continue;
			}
		}
		
		
	}

}
