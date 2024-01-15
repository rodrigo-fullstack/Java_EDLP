package exercicios_gerais.lei_de_mendel_01.meu_package;

/*
 *  Rodrigo Pereira Faria   
 *  09/12/2023
 *  Exercício da 1º Lei de Mendel
 */

import java.util.Scanner;

public class LeiDeMendel01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um gene para a cor da ervilha (AA, Aa ou aa): ");
        String gene = input.nextLine();
        input.close();

        String classificacao = "";

        if(gene.startsWith("A")){ //Verifica se começa com A
            System.out.print("Amarela e ");
            classificacao = "amarela";
            if (gene.equals("AA")) { //Verifica se é igual a AA
                System.out.println("homozigota");
                classificacao += " homozigota";
            }
            else{
                System.out.println("heterozigota");
                classificacao += " heterozigota";
            }
        }
        else{
            System.out.println("Verde e homozigota");
            classificacao = "verde homozigota";
        }

        System.out.println(classificacao);
    }
}

/*
 * A primeira lei de mendel define que "na fecundação, são compartilhados os fatores (alelos) de maneira probabilística pelos pais passando as características adante para os filhos". Utilizando as ervilhas, Mendel também conseguiu compreender conceitos como a Dominância e a Recessividade, em que um alelo pode dominar o outro, sua característica podendo aparecer mesmo em hibridismo. 
 * 
 * Crie um programa que recebe um genes para a característica de uma ervilha quanto a cor. A cor dominante da ervilha é amarela (AA ou Aa) e a cor recesiva é verde (aa). Se for AA, deve exibir homozigota e amarela, se for Aa, heterozigota e amarela (tentar fazer em um único se), se não for nenhuma das duas, exibir homozigota verde.
 * 
 * COmo fazer?
 * 
 * Dar entrada no gene
 * Verificar se começa com A, se sim é amarela, verificar com isso se é AA homozigoto, se não for, é Aa heterozigoto,
 * Se não começar com A, então é homozigoto verde
 */
