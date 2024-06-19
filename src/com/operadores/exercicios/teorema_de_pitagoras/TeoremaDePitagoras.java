package com.operadores.exercicios.teorema_de_pitagoras;

/*
 *  22/11/2023
 *  Rodrigo Pereira Faria
 *  Teorema de Pitágoras
 */

import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos encontrar a hipotenusa de um triângulo retângulo.");
        System.out.print("Digite o primeiro cateto: ");
        double cateto1 = input.nextDouble();
        System.out.print("Digite o segundo cateto: ");
        double cateto2 = input.nextDouble();
        input.close();

        double somaDosQuadrados = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        double hipotenusaQuadrado = somaDosQuadrados;
        double hipotenusa = Math.pow(hipotenusaQuadrado, 0.5); // Pode ser também Math.sqrt(hipotenusaQuadrado)

        System.out.printf("A hipotenusa foi: %.2f%n", hipotenusa);
    }
}
