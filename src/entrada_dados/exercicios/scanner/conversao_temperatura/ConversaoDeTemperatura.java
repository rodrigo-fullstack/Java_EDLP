package entrada_dados.exercicios.scanner.conversao_temperatura;

/*
 * 02/11/2023
 * Rodrigo Pereira
 * Convertendo Temperatura em °C para Fahrenheit
 */

import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperaturaCelsius, temperaturaFahrenheit;

        System.out.println("Você está querendo converter temperatura em Celsius para Fahrenheit.");
        System.out.print("Digite a temperatura em Celsius: ");

        temperaturaCelsius = input.nextDouble();
        input.close();

        
        temperaturaFahrenheit = temperaturaCelsius * 9/5 + 32;
        System.out.println("°C = " + temperaturaCelsius);
        System.out.println("°F = " + temperaturaFahrenheit);

    }
}

/*
 * Crie um programa que recebe uma temperatura em Celsius e a transforma para Fahrenheit. Ao final, exibe tanto a temperatura em Celsius como a temperatura em Fahrenheit.
 * 
 * Fórmula:
 * TC    TF - 32                    9  
 * --  =  -----    =>   TF = TC *  --- + 32
 * 5        9                       5
 * 
 * Entrada: 10C; Saída 10C e 50F
*/
