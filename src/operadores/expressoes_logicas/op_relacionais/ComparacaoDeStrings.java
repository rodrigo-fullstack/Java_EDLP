package operadores.expressoes_logicas.op_relacionais;

/*
 *  Rodrigo Pereira Faria
 *  28/11/2023
 */

import java.util.Scanner;

public class ComparacaoDeStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um caracter: ");
        char caracter001 = input.next().charAt(0); //Métodos para ler caracter
        
        System.out.print("Digite o segundo caracter: ");
        char caracter002 = input.next().charAt(0);
        input.close();
        int explication001 = caracter001;
        System.out.printf("Caracter %c em ASCII = %d;%n", caracter001, explication001);
        int explication002 = caracter002;
        System.out.printf("Caracter %c em ASCII = %d;%n", caracter002, explication002);// Um caractere possui um número de código ASCII, o qual é comparado
        
        boolean comparation001 = caracter001>caracter002;
        System.out.printf("%c > %c = %b%n", caracter001, caracter002, comparation001);//Especificador de formato para caracter = %c

        boolean comparation002 = caracter001<caracter002;
        System.out.printf("%c < %c = %b%n", caracter001, caracter002, comparation002);
        
        boolean comparation003 = caracter001 == caracter002;
        System.out.printf("%c == %c = %b%n", caracter001, caracter002, comparation003);
        
        boolean comparation004 = caracter001!=caracter002;
        System.out.printf("%c != %c = %b%n", caracter001, caracter002, comparation004);

        boolean comparation005 = caracter001>=caracter002;
        System.out.printf("%c >= %c = %b%n", caracter001, caracter002, comparation005);

        boolean comparation006 = caracter001<=caracter002;
        System.out.printf("%c <= %c = %b%n", caracter001, caracter002, comparation006);

    }
}

/*
 * Crie um programa em Java que recebe dois caracteres, em variáveis diferentes do teclado, e os compara se é maior, menor, igual ou diferente.
 * 
 * 
 */