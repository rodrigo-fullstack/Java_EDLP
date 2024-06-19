package com.variaveis.exercicios.troca_de_dados;

import java.util.Scanner;

/*
 * 07/11/2023
 * Rodrigo Pereira Faria
 * Exercício da troca de variáveis
 */


 
public class TrocaDeDados {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b, a_auxiliar;
        
        System.out.print("Digite o valor de a: ");
        a = input.nextInt();

        System.out.print("Digite o valor de b: ");
        b = input.nextInt();
        
        input.close();
        
        System.out.println("Primeiro momento:");
        System.out.printf("a = %d, b = %d%n", a, b);

        a_auxiliar = a;
        a = b;
        b = a_auxiliar;
        
        System.out.println("Segundo momento: ");
        System.out.printf("a = %d, b = %d", a, b);
        
        
    }
}
