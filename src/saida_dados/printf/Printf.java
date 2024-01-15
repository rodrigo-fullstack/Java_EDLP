package saida_dados.printf;

import java.util.Scanner;

/*
 * Rodrigo
 * 04/11
 * Exercitando PrintF
 */

public class Printf{
    public static void main(String[] args) {
        String nome; double altura; int peso;
        
        //Exibindo texto com printf
        //"Primeiro mensagem com especificadores", depois da vírgula parâmetros
        System.out.printf("Hello, %s!%n", "World");

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = input.nextLine();
        
        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();
        
        System.out.print("Digite seu peso: ");
        peso = input.nextInt();

        input.close();

        //%s para strings. Número 3 define campo de largura, nome possui mais de 3 letras, se não tiver mostra espaços em branco à esquerda. %n serve para quebrar a linha
        System.out.printf("Seu nome é %3s%n", nome);

        //Para números float %f, .2 é o arredondamento do número
        System.out.printf("A altura ditada foi %.2fm%n", altura);

        //%d para números inteiros
        System.out.printf("Seu peso foi %dkg", peso);
    }
}