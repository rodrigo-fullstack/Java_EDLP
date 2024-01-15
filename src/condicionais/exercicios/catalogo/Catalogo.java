package condicionais.exercicios.catalogo;

/*
 * 09/12/2023
 * Rodrigo Pereira Faria
 * Exercício do Catálogo de produtos
 */

import javax.swing.JOptionPane;

public class Catalogo {
    public static void main(String[] args) {
        String indice = JOptionPane.showInputDialog("Digite o índice do catálogo (no estilo 00x): ");
        String tipoProduto = "";
        switch (indice){
            case "001":
                tipoProduto = "Caderno";
                break;
            case "002":
                tipoProduto = "Lápis";
                break;
            case "003":
                tipoProduto = "Borracha";
                break;
            default:
                tipoProduto = "Diversos";
        }
        System.out.printf("Índice = %s com tipo de produto sendo %s", indice, tipoProduto);
    }
}


