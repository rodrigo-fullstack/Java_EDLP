package com.entrada_dados.exercicios.scanner.area_da_circunferencia;

/*
 * 02/11/2023
 * Rodrigo Pereira Faria
 * Área da Circunferência Scanner
 */

import java.util.Scanner;

public class AreaDaCircunferencia {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double diametro, raio, area;
        final double valorDePi = 3.1415;

        System.out.print("Digite o diâmetro da circunferência: ");
        diametro = input.nextDouble();
        input.close();
        
        raio = diametro/2;
        area = valorDePi*raio*raio;
        System.out.println("O valor da área foi: " + area);
        

   } 
}

/*
 * Criar um exercício para o calculo da área de uma circunferência.
 * 
 * Dar entrada no diâmetro da circunferencia
 * Definir valor de pi como 3,14 constante
 * Executar a area, area = pi*r²
 *
 * 
 * Anotações: Ver sobre com.operadores e futuramente tratamento de exceções
*/