package condicionais.exercicios.triangulos_formacao_classificacao;

/*
 * 09/12/2023
 * Rodrigo Pereira Faria
 * Verificando se é um triângulo e o tipo do triângulo
 */

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado a: ");
        int a = input.nextInt();
        System.out.print("Digite o lado b: ");
        int b = input.nextInt();
        System.out.print("Digite o lado c: ");
        int c = input.nextInt();
        input.close();

        String classificacao = "";
        boolean ladosDiferenteZero = a != 0 && b != 0 && c != 0;
        boolean condicaoFormacao = a < b+c && b < a+c && c < a+b;
        boolean condicaoEquilatero = a == b && b == c;
        boolean condicaoEscaleno = a != b && a != c && b != c;
        //boolean condicaoIsosceles = (a == b && b != c) || (a == c && c != b) || (b == c && c != a);

        if(ladosDiferenteZero) {
        	if(condicaoFormacao){
                System.out.print("É um triângulo");
                classificacao = "triangulo";
                if(condicaoEquilatero){
                    classificacao += " equilátero";
                    System.out.println(" equilátero (lados iguais)");
                }
                else if(condicaoEscaleno){
                	classificacao += " escaleno";
                	System.out.println(" escaleno (lados diferentes)");
                }
                else{
                	classificacao += " isósceles";
                    System.out.println(" isôsceles (2 lados iguais)");
                }
            }
        	else{
        		System.out.println("Não é um triângulo");
        		classificacao = "outra figura";
        	}
        }
        else {
        	System.out.println("Não é figura geométrica.");
        	classificacao = "outra coisa";
        }
        System.out.println("Classificação final: " + classificacao);
    }
}