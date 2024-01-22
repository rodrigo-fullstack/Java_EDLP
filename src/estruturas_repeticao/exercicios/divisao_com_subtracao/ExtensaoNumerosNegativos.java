package estruturas_repeticao.exercicios.divisao_com_subtracao;

import javax.swing.JOptionPane;

/*
 * 19/01/24
 * Rodrigo Pereira Faria
 * Divisão Somente com Subtração estendido para números negativos
 */

public class ExtensaoNumerosNegativos {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Dividindo com Subtração ===");
		int num1 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o primeiro número: "));
		int num2 = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int quociente = 0;
		int resto = 0;
		
		boolean divisorDiferenteZero = num2 != 0; 
		
		//Verifica se o divisor é diferente de zero
		if(divisorDiferenteZero) {
			boolean previsaoNegativo = false;
			boolean divisorNegativo = num2 < 0;
			boolean dividendoNegativo = num1 < 0;
			boolean ambosNegativos = divisorNegativo && dividendoNegativo;
			
			//Digitado num2 negativo
			if(divisorNegativo) {
				while(num1 > 0) {
					num1 -= num2 * -1;
					quociente--;
					
					previsaoNegativo = num1 - (num2 * -1) < 0;
					// Verifica se o próximo número é negativo para armazenar o resto
					if(previsaoNegativo){
						resto = num1;
						break;
					}
				}
			}
			
			else if(dividendoNegativo) {
				while (num1 < 0) {
					num1 -= num2 * -1;
					quociente--;
					previsaoNegativo = num1 - num2 * -1 > 0;
					if(previsaoNegativo) {
						resto = num1;
						break;
					}
				}
			}
			
			else if(ambosNegativos) {
				System.out.println("Ambos negativos");
			}
			
			else {
				// Enquanto o primeiro número é maior do que 0, reduz do segundo número
				while(num1 > 0) {
					num1 -= num2;
					quociente++;
					
					previsaoNegativo = num1 - num2 < 0; //Pode declarar dentro do while que não dá erro de declaração
					//Previsão da próxima operação, previnindo o resto de se tornar negativo
					if(previsaoNegativo) {
						resto = num1;
						break;
					}
				}
			}
			//Saída dos dados
			JOptionPane.showMessageDialog(null, 
					"Quociente = " + quociente
					+ "\n Resto = " + resto);
		}
			
		else {
			JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
		}
		System.out.println(" === Fim === ");
	}

}
