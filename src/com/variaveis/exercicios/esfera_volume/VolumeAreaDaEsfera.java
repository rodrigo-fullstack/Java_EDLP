package com.variaveis.exercicios.esfera_volume;

/*
 * 13/11/2023
 * Rodrigo Pereira Faria
 * Volume e Área da Esfera
 */

import java.util.Scanner;

public class VolumeAreaDaEsfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;

        System.out.print("Digite o raio em cm: ");
        double raio = input.nextDouble();
        input.close();

        double volume = (4 * pi * (raio * raio * raio)) / 3;
        double area = 4 * pi * (raio * raio);

        System.out.printf("Volume = %.2f cm³;%nArea = %.2f cm²", volume, area);

    }

}

