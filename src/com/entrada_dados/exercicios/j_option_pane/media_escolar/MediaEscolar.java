package com.entrada_dados.exercicios.j_option_pane.media_escolar;

/*
 *  Rodrigo Pereira Faria
 *  02/12/23
 *  Media Escolar com JOptionPane
 */

import javax.swing.JOptionPane;

public class MediaEscolar {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao programa das notas escolares. Digite a seguir os valores de suas notas, exceto letras.");
        double nota1, nota2, nota3, nota4;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
        System.out.println(nota1);

        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        System.out.println(nota2);

        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        System.out.println(nota3);

        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta e última nota: "));
        System.out.println(nota4);

        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.printf("Média final = %f", media);
        JOptionPane.showMessageDialog(null, "Sua média final foi: " + media);
    }
}
