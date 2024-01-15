package variaveis.exercicios.distributiva_valores;

/*
 * 07/11/2023
 * Rodrigo Pereira Faria
 * Exercício da soma e multiplicação distributiva.
 */
import java.util.Scanner;

public class DistributivaSomaMult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D; //Distributiva entre esses números
        int s1, s2, s3, s4, s5, s6; //Somas
        int m1, m2, m3, m4, m5, m6; //Multiplicações

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        System.out.print("Digite o valor de D: ");
        D = input.nextInt();
        input.close();

        s1 = A + B;
        s2 = A + C;
        s3 = A + D;
        s4 = B + C;
        s5 = B + D;
        s6 = C + D;

        m1 = A * B;
        m2 = A * C;        
        m3 = A * D;
        m4 = B * C;        
        m5 = B * D;
        m6 = C * D;        

        System.out.printf(
        		"Valores digitados: %d, %d, %d, %d.%n", A, B, C, D );
        System.out.printf(
        		"Somas: %d, %d, %d, %d, %d, %d%n", s1, s2, s3, s4, s5, s6);
        System.out.printf(
        		"Mult.: %d, %d, %d, %d, %d, %d", m1, m2, m3, m4, m5, m6);

    }
}
