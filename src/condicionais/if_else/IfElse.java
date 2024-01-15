package condicionais.if_else;

/*
 *  Rodrigo Pereira Faria
 *  07/12/2023
 */

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser verificado:"));
        boolean numeroPositivo = numero>0;

        if(numeroPositivo){
            System.out.println("Número positivo");
        }
        else{
            System.out.println("Número negativo");
        }


    }
}

/*Programa que verifica se um número é maior do que 0, ou seja, positivo, ou se é menor, negativo. */
