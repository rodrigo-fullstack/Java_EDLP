package com.operadores.exercicios.divisao_resto;

/*
 * 22/11/2023
 * Rodrigo Pereira Faria
 * Programa da Divisão e do resto
 */

import java.util.Scanner;

public class DivisaoResto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();
        System.out.print("Digite o último número: ");
        int num4 = input.nextInt();
        input.close();

        int div1Com2 = (num1 / num2);
        int div2Com3 = (num2 / num3);
        int div3Com4 = (num3 / num4);
        int somaDivisoesInteiras = div1Com2 + div2Com3 + div3Com4;
        
        int resto1Com2 = (num1 % num2);
        int resto2Com3 = (num2 % num3);
        int resto3Com4 = (num3 % num4);
        int somaRestos = resto1Com2 + resto2Com3 + resto3Com4;
        System.out.printf("Soma das Divisões = %d%nSoma dos Restos = %d", somaDivisoesInteiras, somaRestos);
    }
}
