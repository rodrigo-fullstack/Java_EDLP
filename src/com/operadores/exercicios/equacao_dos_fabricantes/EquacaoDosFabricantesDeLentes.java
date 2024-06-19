package com.operadores.exercicios.equacao_dos_fabricantes;

import java.util.Scanner;

/*
 * 22/11/2023
 * Rodrigo Pereira Faria
 * Programa da EquaçãoDosFabricantesDeLentes
 * 
 */


public class EquacaoDosFabricantesDeLentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o índice da lente: ");
        double indiceLente = input.nextDouble();
        System.out.print("Digite o índice do meio: ");
        double indiceMeio = input.nextDouble();
        System.out.print("Digite o raio da 1º superfície da lente em cm: ");
        
        // Positivo é lente convexa, negativo é côncava
        double raio1 = input.nextDouble();
        System.out.print("Digite o raio da 2º superfície da lente em cm: "); // Vai precisar converter na vergência
        double raio2 = input.nextDouble();
        input.close();

        double foco = 1 / (((indiceLente / indiceMeio) - 1) * (1 / raio1 + 1 / raio2));
        double vergencia = 1 / (foco * 0.01);
        System.out.printf(
                "Os dados foram:%nn_lente = %.2f, n_meio = %.2f%nraio1 = %.2fcm, raio 2 = %.2fcm%nOs valores encontrados foram foco = %.2fcm e vergência = %.2fdi",
                indiceLente, indiceMeio, raio1, raio2, foco, vergencia);
        
    }
}