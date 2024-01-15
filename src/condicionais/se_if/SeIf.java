package condicionais.se_if;

/*
 *  Rodrigo Pereira Faria
 *  06/12/2023
 *  
 */

import javax.swing.JOptionPane;
import java.lang.Integer;

public class SeIf{
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        System.out.println(nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        System.out.println(idade);
        boolean maiorIdade = idade>18;
        
        String temCPF = JOptionPane.showInputDialog("Você tem CPF? Digite sim ou não.");
        boolean verificacaoCPF = temCPF.equalsIgnoreCase("sim");//Anotação
        System.out.println(verificacaoCPF);

        String temCNH = JOptionPane.showInputDialog("Você tem CNH? Digite sim ou não.");
        
        boolean verificacaoCNH = temCNH.equalsIgnoreCase("sim");
        System.out.println(verificacaoCNH);

        System.out.println("Seu nome é " + nome);
        System.out.printf("Com idade = %d anos", idade);

        
        if (verificacaoCPF){
            System.out.println("Você tem CPF.");
        }
        System.out.println("Segue o fluxo");

        if (verificacaoCNH){
            System.out.println("Você tem CNH");
        }
        System.out.println("Segue o fluxo");
        if (maiorIdade){
            System.out.println("Você é maior de idade.");
        }
        System.out.println("Segue o fluxo");

    }
}


/* Testando se(if)
 * Programa de inspeção de dados
 * Anotação: Para comparar Strings, se são iguais, utilize o método equals do objeto, variável em questão.
 */

/*
 * Praticando se(if)
 * Crie um programa que recebe uma entrada booleana do usuário para uma compra perguntando se ele tem cupom de desconto e o aplica ao preço do produto. O programa deve pedir: valorDoProduto, seTemCupom, descontoDoCupom, valorFinal. Declarar valor do produto como constante
 * 
 */

