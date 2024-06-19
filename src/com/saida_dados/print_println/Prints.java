package com.saida_dados.print_println;

/*
 * Rodrigo Pereira Faria
 * 03/11
 * Programa para verificar tipos diferentes de saída em Java
 * 
 */

public class Prints {
    public static void main(String[] args) {
        //Println, passa o cursor de saída para a próxima linha
        System.out.println("Estou na primeira linha.");     
        System.out.println("Estou na próxima");
        //Print, deixa o cursor de saída na mesma linha
        System.out.print("O cursor está nesta mesma linha. ");
        System.out.println("Voilá!");
        System.out.print("Porém eu não estou por causa do println anterior. ");
    }
}
