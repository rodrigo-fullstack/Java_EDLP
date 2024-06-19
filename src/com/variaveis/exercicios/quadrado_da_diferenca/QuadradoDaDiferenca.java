
package com.variaveis.exercicios.quadrado_da_diferenca;

/*
 * 
 * 07/11/2023
 * Rodrigo Pereira Faria
 * Quadrado da Diferença Programa
 */

import java.util.Scanner;

public class QuadradoDaDiferenca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;
        int diferenca, quadradoDaDiferenca;

        System.out.print("Digite valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B:");
        B = input.nextInt();
        input.close();

        System.out.println("O quadrado da diferença é: (a - b)²");
        System.out.println("Decomposição: a² - 2*a*b + b²");

        diferenca = A - B;
        quadradoDaDiferenca = diferenca * diferenca;

        System.out.printf("A = %d, B = %d.%n", A, B, A, B, A, B);
        System.out.printf("QuadDaDif = (%d-%d)*(%d-%d)%n", A, B, A, B);
        System.out.printf("Resultado: %d", quadradoDaDiferenca);
    }
}