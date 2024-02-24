package vetores_matrizes.testando_vetores;

import javax.swing.JOptionPane;

/*
 * 31/01/2024
 * Rodrigo Pereira Faria
 * Testando Vetores 01
 */

public class TestandoVetores01 {

	public static void main(String[] args) {
		int vetorInteiros[] = new int[10];
		//Imprime código estranho
		//ChatGPT: esse código é a representação do método toString
		System.out.println(vetorInteiros); 
		
		
		String vetorString[] = new String[4];
		//Código que inicia com Java.lang.String
		System.out.println(vetorString); 
		
		//Sem for: Mais lento e estático
		vetorString[0] = "João";
		vetorString[1] = "43.0";
		vetorString[2] = "Banana";
		vetorString[3] = "Lua";
		
		vetorString[3] = JOptionPane.showInputDialog("Troque para Sol a posição 3: ");
		
		boolean tercPosicaoSol = vetorString[3].equalsIgnoreCase("sol");
		if(tercPosicaoSol) JOptionPane.showMessageDialog(null, "Você trocou para Sol");
		else JOptionPane.showMessageDialog(null, "Você não trocou para Sol");
			
		
		//Operações e Atribuições nos vetores
		System.out.println("Testando exibição de elemento");
		vetorInteiros[0] = 1;
		System.out.println(vetorInteiros[0]);
		
		System.out.println("Definindo valores por For...");
		// Definindo valores para o vetor por meio de um for
		for (int i = 1; i < 10; i++) {
			//Soma mais 2 a cada elemento
			vetorInteiros[i] = vetorInteiros[i-1] + 2;
		}
		
		System.out.println("=== Exibindo valores de vetor inteiros em forma de tabela ===");
		//Exibindo valores do vetor
		for (int i = 0; i<10; i++) {
			int posicaoAtual = vetorInteiros[i];
			//Exibição em forma de tabela;
			System.out.printf("| v[%d] | %2d |%n", i, posicaoAtual);
		}
		
		System.out.println("Vetor Double sendo criado...");
		//Vetor com a metade de elementos do vetorInteiros
		double vetorDouble[] = new double[vetorInteiros.length / 2]; //Pode fazer operações na quantidade de elementos;
		
		/*Erro de index out of bonds
		for (int i = 0; i < 10; i++) {
			vetorDouble[i] = Double.parseDouble(
					JOptionPane.showInputDialog(
							"Digite o valor da posição " + i 
							+": " ));
			System.out.println(vetorDouble[i]);
		}
		*/
		
		System.out.println("Exibição dos valores utilizando Println");
		
		//Rótulos
		System.out.println("| Posição | Valor");
		//vetor.length captura a quantidade automaticamente
		for (int i = 0; i < vetorDouble.length; i++) {
			vetorDouble[i] = Double.parseDouble(
					JOptionPane.showInputDialog(
							"Digite o valor da posição " + i + ": "));
			System.out.println("| " + i + " | " + vetorDouble[i] + " |");
		}
		System.out.println("Quantidade de elementos = " + vetorDouble.length);
		//Vale mais a pena utilizar printf, mais dinâmico e mais possibilidades
		
		//vetorDouble[2] = "Batata"; Somente aceita o respectivo tipo
		System.out.println("=== Testando Atribuição de Vetores === ");
		double vetorIntermediario[] = vetorDouble;
		for(int i = 0; i < vetorIntermediario.length; i++) {
			if(i == vetorIntermediario.length - 1) 
				System.out.print(vetorInteiros[i]);
			
			else 
				System.out.print(vetorInteiros[i] + ", ");
		}
		
		
	}

}
