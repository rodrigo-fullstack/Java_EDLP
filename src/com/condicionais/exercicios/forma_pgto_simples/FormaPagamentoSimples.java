package com.condicionais.exercicios.forma_pgto_simples;

import javax.swing.JOptionPane;

/*
 *  09/12/23
 *  Rodrigo Pereira Faria
 *  Programa Forma de Pagamento Simples
 */

public class FormaPagamentoSimples {
    public static void main(String[] args) {
        final double VALOR_PRODUTO = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto = "));
        
        double valorFinal = VALOR_PRODUTO;
        double desconto = 0;
        String formaPagamento = JOptionPane.showInputDialog("Digite a forma de pagamento (à vista ou parcelado)");

        boolean condicaoDesconto = formaPagamento.equalsIgnoreCase("à vista");
        if(condicaoDesconto){
            desconto = 10;
            valorFinal = VALOR_PRODUTO - (VALOR_PRODUTO*(desconto/100));
        }
        JOptionPane.showMessageDialog(null, "Valor inicial foi R$"+ VALOR_PRODUTO + "\nForma de Pagamento: " + formaPagamento + "\nDesconto de " + desconto + "%, Valor final é R$" + valorFinal);
    }
}

/*
 * Criando programa para calcular valor do produto baseado na forma de pagamento. Se a forma de pagamento for à vista, oferece um desconto de 10%, se não, ou seja, parcelado, mantém o preço.
 * 
 * Como fazer?
 * 
 * Dar entrada no valor do produto
 * Dar entrada na forma de pgto
 * Verificar se é admissível de desconto: se forma de pgto = à vista, então vai aplicar desconto de 10%; se não, mantém o valor inicial
 */
