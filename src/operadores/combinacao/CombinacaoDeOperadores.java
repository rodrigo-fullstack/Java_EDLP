package operadores.combinacao;

/*
 *  Rodrigo Pereira Faria
 *  28/11/2023
 * 
 */

import java.util.Scanner;

public class CombinacaoDeOperadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num001 = input.nextInt();
        System.out.print("Digite o próximo: ");
        int num002 = input.nextInt();
        input.close();

        boolean exp001 = num001*2 > num002*3;
        System.out.printf("O dobro do número %d é maior do que o triplo de %d? Resultado = %b%n", num001, num002, exp001);

        boolean exp002 = num001/2 > num002 && num001*3 == Math.pow(num002,3);
        System.out.printf("A metada de %d é maior do que %d e o triplo do primeiro número é == ao cubo do segundo número? Resultado = %b%n", num001, num002, exp002);

        boolean exp003 = (num001 + num002) * 10 == num002 * (num001 + 20) ^ Math.pow(num001, 2) <= num002 * (25 - num001);
        
        System.out.printf("Ou (o primeiro número mais o segundo) multiplicado por 10 é igual ao segundo número vezes (o primeiro número mais 20) ou o quadrado do primeiro número é menor igual do que o segundo número multiplica por (25 menos o primeiro número). Resultado = %b%n", exp003);

        
    }
}

/*
 * Crie um programa que recebe 2 números inteiros e realiza comparações, cálculos e operações lógicas com eles.
 * 
 * 1. Dê entrada nos números
 * 2. Crie as expressões
 * 3. Exiba seus resultados com printf
 * 
 * 
 * Entrada: 2 e 4
 * exp001 = O dobro de um número é maior do que o triplo de outro?
 * 
 * 2 * 2 > 4 * 3 
 * 4 > 8 => false
 * 
 * exp002 = A metada do primeiro número é maior do que o segundo número e o triplo do primeiro número é igual ao cubo do segundo número?
 * 
 * 2/2 > 4 && 3*2 == 4³
 * 1 > 4 && 6 == 64
 * false && false => false
 * 
 * exp003 = ou (o primeiro número mais o segundo) multiplicado por 10 é igual ao segundo número vezes (o primeiro número mais 20) ou o quadrado do primeiro número é menor igual do que o segundo número * (25 menos o primeiro número) ;
 * 
 * ou (2 + 4) * 10 == 4 * (2+20) ou 2² <= 4 * (25 - 2)
 * ou 6*10 == 4 * 22 ou 4 <= 4 * 23
 * ou 60 == 88 ou 4 <= 92
 * ou false ou true => true
 * 
 * 
 * exp004 = o primeiro número elevado ao quadrado mais 12 é diferente do segundo número dividido por 2 multiplicado por 210 ou o segundo número dividido por ele mesmo é igual ao primeiro número multiplicado por por ele mesmo
 * 2² + 12 != 4 / 2 * 210 || 4/4 = 2*2
 * 4 + 12 != 2 * 210 || 1 == 4
 * 16 != 520 || false
 * true || false => true
 * 
 * 
 */
