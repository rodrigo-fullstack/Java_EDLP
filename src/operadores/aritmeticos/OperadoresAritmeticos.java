package operadores.aritmeticos;

/*
 * Rodrigo Pereira Faria
 * 14/11/2023
 */

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        double num3;
        double num4;

        System.out.print("Digite um número (int): ");
        num1 = input.nextInt();

        System.out.print("Digite um número (int): ");
        num2 = input.nextInt();

        System.out.print("Digite um número (double): ");
        num3 = input.nextDouble();

        System.out.print("Digite um número (double): ");
        num4 = input.nextDouble();
        input.close();

        // Com inteiros
        System.out.printf("Inteiros: num1 = %d, num2 = %d%n", num1, num2);
        int soma1 = num1 + num2;
        System.out.printf("soma = %d%n", soma1);

        int subtracao1 = num1 - num2;
        System.out.printf("subtracão = %d%n", subtracao1);

        int divisao1 = num1 / num2; // Divisão de inteiros é a aproximação, 4/2 = 2; 4/3 = 1
        System.out.printf("divisão = %d%n", divisao1);

        int multiplicacao1 = num1 * num2;
        System.out.printf("multiplicação = %d%n", multiplicacao1);

        int resto1 = num1 % num2;
        System.out.printf("resto = %d%n", resto1);

        double exponenciacao1 = Math.pow(num1, num2); // Anotação 01
        System.out.printf("exponenciação = %.2f%n", exponenciacao1);

        // Com doubles
        System.out.printf("%nDoubles: num3 = %.2f, num4 = %.2f%n", num3, num4);
        double soma2 = num3 + num4;
        System.out.printf("soma = %.2f%n", soma2);

        double subtracao2 = num3 - num4;
        System.out.printf("subtração = %.2f%n", subtracao2);

        double divisao2 = num3 / num4;
        System.out.printf("divisão = %.2f%n", divisao2);

        double multiplicacao2 = num3 * num4;
        System.out.printf("multiplicação = %.2f%n", multiplicacao2);

        double resto = num3 % num4; // Resto da divisão por doubles
        System.out.printf("resto = %.2f%n", resto);

        double exponenciacao2 = Math.pow(num3, num4);
        System.out.printf("exponenciação = %.2f%n", exponenciacao2);
    }
}

/*
 * Crie um exercício que realiza todas as operações dos operadores de Java
 * presentes no documento Operadores.md
 * 
 * Anotação 01: Classe math somente pode receber doubles (que inclui inteiros),
 * por isso exponenciação só pode ser declarado do tipo double.
 */
