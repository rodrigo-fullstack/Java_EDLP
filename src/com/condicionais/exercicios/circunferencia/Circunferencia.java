package com.condicionais.exercicios.circunferencia;

/*
 *  11/12/2023
 *  Rodrigo Pereira Faria
 *  Área da Circunferência
 */

import javax.swing.JOptionPane;

public class Circunferencia {
    public static void main(String[] args) {
        //Declarações
        int raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio da circunferência (inteiro em cm): ")); //Raio recebendo somente inteiros
        double PI = 3.14;
        double diametro, comprimento, area;
        boolean raioPositivo = raio>0;

        if(raioPositivo){
            diametro = 2*raio;
            comprimento = 2*raio*PI;
            area = PI*Math.pow(raio,2);
            JOptionPane.showMessageDialog(
                null, 
                "Raio =  " + raio + " cm"
                + "\nDiâmetro = " + diametro + " cm"
                + "\nComprimento = " + comprimento + " cm"
                + "\nÁrea = " + area + " cm²"
            );
        }
        else{
            System.out.println("Erro na digitação."); 
        }

    }
}