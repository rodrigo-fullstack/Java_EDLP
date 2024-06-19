package com.entrada_dados.scanner;

import java.util.Scanner;

// 02/11/23
// Rodrigo Pereira Faria

public class Scanneando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Classe para dar entrada nos dados
        System.out.print("Digite o seu nome a seguir: ");
        String nome;
        nome = input.nextLine();
        System.out.println("Bem-vindo ao programa, " + nome + ". É um prazer vê-lo aqui. ");
        input.close();
    }
}
