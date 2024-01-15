package entrada_dados.exercicios.scanner.troco;

/*
 * Rodrigo Pereira Faria
 * 03/11/2023
 * Troco Exercício
 */

import java.util.Scanner;
public class Troco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorDoProduto, dinheiroDisponivel, troco;

        System.out.println("Você está em uma loja e quer comprar um determinado produto com uma determinada quantia.");
        //Não vou utilizar condicionais ainda.

        System.out.print("Qual o preço do produto desejado? ");
        valorDoProduto = input.nextInt();

        System.out.print("(Digite sempre acima ou igual ao produto) Quanto você tem? ");
        dinheiroDisponivel = input.nextInt();
        
        input.close();

        troco = dinheiroDisponivel - valorDoProduto;

        System.out.println("O valor do produto foi R$" + valorDoProduto + ",00.");
        System.out.println("Você possuía R$"+ dinheiroDisponivel +",00.");
        System.out.println("Seu troco foi R$" + troco + ",00.");
    }
}