package condicionais.exercicios.meses;

import java.util.Scanner;

/*
 * 28/12/23
 * Rodrigo Pereira Faria
 * Programa da Contagem dos Meses
 */

public class ContandoMesesComSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Programa da Contagem Dos Meses ===");
		
		System.out.print("Digite o número do mês de 1 a 12: ");
		int numMes = input.nextInt();
		input.close();
		
		String nomeMes = "";
		
		//Flag para evitar saídas desnecessárias
		boolean flag = false;
		
		switch(numMes) {
		//Caso número seja 1, é Janeiro
		case 1:
			nomeMes = "Janeiro";
			break;
		//Caso número seja 2, é Fevereiro...
		case 2: 
			nomeMes = "Fevereiro";
			break;
		
		case 3: 
			nomeMes = "Março";
			break;
		
		case 4:
			nomeMes = "Abril";
			break;
		
		case 5:
			nomeMes = "Maio";
			break;
		
		case 6: 
			nomeMes = "Junho";
			break;
			
		case 7:
			nomeMes = "Julho";
			break;
		
		case 8:
			nomeMes = "Agosto";
			break;
			
		case 9:
			nomeMes = "Setembro";
			break;
			
		case 10:
			nomeMes = "Outubro";
			break;
			
		case 11: 
			nomeMes = "Novembro";
			break;
			
		case 12:
			nomeMes = "Dezembro";
			break;
		//Se não for um número digitado de 1 a 12, exibe...
		default:
			System.out.println("Digitado número fora da faixa");
			flag = true;
		}
		if(!flag) {			
			System.out.printf(
					"O mês de número %d é %s%n", numMes, nomeMes
					);
		}
		System.out.println("== Fim ==");
	}
}

