package variaveis.exercicios.soma_dos_quadrados;

/*
 * 08/11/2023
 * Rodrigo Pereira Faria
 * Soma Dos Quadrados
 */
import java.util.Scanner;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        B = input.nextInt();

        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        input.close();

        System.out.println(A * A + B * B + C * C);

    }
}

/*
 * Efetuar a leitura de três valores e imprimir a soma dos quadrados dos valores
 * na tela.
 * 
 * 1 Declarar variáveis
 * 2 Imprimir o valor da soma dos quadrados dos valores (utilizar impressão com
 * cálculos)
 * Exemplo: 1, 2, 3
 * 
 * 1*1+2*2+3*3 = 14
 * 
 * 
 */