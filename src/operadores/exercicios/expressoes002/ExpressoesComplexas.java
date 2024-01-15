package operadores.exercicios.expressoes002;

/*
 *  02/12/23
 *  Rodrigo Pereira Faria
 *  Expressões Complexas
 */

import java.util.Scanner;


public class ExpressoesComplexas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num001 = input.nextDouble();
        System.out.print("Digite o segundo: ");
        double num002 = input.nextDouble();
        System.out.print("Digite o último número: ");
        double num003 = input.nextDouble();
        input.close();

        double exp001 = (num001 + num002) * (Math.pow(num003, 2) + 2);
        System.out.printf("exp001 = %.2f%n", exp001);

        boolean exp002 = (num001 * num002) == num003 & num003-num002<num001;
        System.out.printf("exp002 = %b%n", exp002);
        
        //Auxiliadores para exp003
        boolean auxExp001 = (num001)/(Math.sqrt(num002) - num003) > num002/num001 - 18; 
        boolean auxExp002 = num001 * (num002 + num003) < num003 % num002 + 12;
        boolean auxExp003 = Math.pow(num001,2) - num002/2 == num003/4;
        boolean exp003 =  auxExp001 && (auxExp002 || auxExp003);
        System.out.printf("exp003 = %b%n", exp003);
        
        double tern001 = (num001 + num002 == num003) ? (num001+num002+num003)/3 : num001 - num002 - num003;
        System.out.printf("ternário001 = %.2f%n", tern001);

        double tern002 = (num002 - num001 < num003/2) ? (Math.pow(2,Math.pow(num001, 2))) : (Math.pow(num002,0.5));
        System.out.printf("ternário002 = %.2f%n", tern002);

        double tern003 = (num001 > num002/4 && num003/3 != num001+num002) ? 2*num001 : num001/3;
        System.out.printf("ternário003 = %.2f%n", tern003);

    }
}

