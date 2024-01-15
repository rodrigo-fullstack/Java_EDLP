package variaveis.exercicios.quadrado_das_somas;

import java.util.Scanner;

/*
 *
 * 07/11/2023
 * Rodrigo Pereira Faria
 * Quadrado das somas Programa
 * 
 */

public class QuadradoDasSomas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = input.nextInt();
        input.close();
        
        System.out.println((A + B + C) * (A + B + C));
    }
}

/*
 * Efetue a leitura de três valores A, B e C e exiba o quadrado das somas
 * 
 * 1 Declare as variáveis
 * 2 Dê entrada
 * 3 Exibir quadrado das somas
 * 
 * Quadrado das somas = (a+b+c+d... + n)*(a+b+c+d...+ n)
 * Exemplo:
 * 
 * Entrada: 2, 3, 4
 * 
 * (2+3+4)² = 9*9 = 81
 */