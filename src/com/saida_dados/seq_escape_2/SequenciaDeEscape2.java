package com.saida_dados.seq_escape_2;

/*
 *  Rodrigo Pereira Faria
 *  04/11
 *  Sequencia de Escape 2
 */

public class SequenciaDeEscape2 {
    public static void main(String[] args) {
        // Exemplo do \r: coloca o cursor no começo e escreve sobrescrevendo o texto anterior.
        System.out.print("Busque a imprudência e os prazeres.");
        System.out.print("\rBusque a sabedoria e o entendimento. ");
        System.out.println("Deus acima de tudo. \n");
        
        // Exemplo \b: dá um backspace, apaga o último caracter
        System.out.println("Apa\bgand\boTexto");

    }   
}
