package operadores.expressoes_logicas.op_logicos;

/*
 * Rodrigo Pereira Faria
 * 23/11/2023
 */

import java.util.Scanner;

public class OperadoresLogicos001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vamos a uma viagem. ");

        System.out.print("Trouxe rg? Digite true para sim e false para não. ");
        boolean temRG = input.nextBoolean(); // Entrada para verdadeiro ou falso;

        System.out.print("E CPF? ");
        boolean temCPF = input.nextBoolean(); 
        System.out.print("E está trazendo sua comida? ");
        boolean trouxeComida = input.nextBoolean();
        input.close();
        
        //boolean viagem = temRG || temCPF && trouxeComida; Primeiro faz o &&
        boolean viagem = (temRG || temCPF) && trouxeComida; // Primeiro faz o ||
        System.out.println("Viagem = " + viagem);

    }
}


