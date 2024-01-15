package saida_dados.exercicios.soma;

/*
 * Rodrigo Pereira Faria
 * 04/11/2024
 * Soma de dois números 
 */
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,soma;
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt(); //next passa também para a próxima linha
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        input.close();

        soma = n1+n2;
        
        System.out.printf("Seus números digitados foram %d e %d, sua soma foi %d", n1, n2, soma);
    }
}

/*
 * Crie um programa que recebe dois valores no teclado e imprime quais foram esses valores e sua soma.
 * Utilize o printf para realizar a impressão dos valores.
 */