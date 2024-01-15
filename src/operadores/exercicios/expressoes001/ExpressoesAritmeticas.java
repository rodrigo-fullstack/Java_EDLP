package operadores.exercicios.expressoes001;

import java.util.Scanner;

/*
 *  22/11/2023
 *  Rodrigo Pereira Faria
 *  Programa das Expressôes Aritméticas
 */


public class ExpressoesAritmeticas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int A;
        int B;
        double C;

        System.out.print("Digite o primeiro número (int): ");
        A = input.nextInt();
        System.out.print("Digite o segundo (int): ");
        B = input.nextInt();
        System.out.print("Digite o último: ");
        C = input.nextDouble();
        input.close();

        double expressaoA = Math.pow(A,2) + B*C - C;
        System.out.printf("Resultado da expressãoA = %.2f%n", expressaoA);

        double expressaoB = (2*B - (A + 3*C))/A;
        System.out.printf("Resultado da expressãoB = %.2f%n", expressaoB);
        
        double expressaoC = B - C/2 + 4*A;
        System.out.printf("Resultado da expressãoC = %.2f%n", expressaoC);
        
        double expressaoD = (3*A + (2*B - C * ((Math.sqrt(B)) - 1))/2);
        System.out.printf("Resultado da expressãoD = %.2f%n%n", expressaoD);
        
        //Testando operações da expressãoD
        System.out.println("Testando operações da expressão D:");
        double op1 = Math.sqrt(B)-1;
        System.out.printf("Math.sqrt(B) - 1 = %.2f%n", op1);

        double op2 = 2*B - C * op1;
        System.out.printf("2*B - C * ((Math.sqrt(B)) - 1) = %.2f%n", op2);

        double op3 = op2/2;
        System.out.printf("(2*B - C * ((Math.sqrt(B)) - 1))/2 = %.2f%n", op3);
        
        double op4 = 3*A + op3;
        System.out.printf("(3*A + (2*B - C * (Math.sqrt(B) - 1))/2) = %.2f%n", op4);

        // double raizDeB = (Math.sqrt(B));
        // System.out.println(raizDeB);
    }
}