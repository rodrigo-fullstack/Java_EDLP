package condicionais.else_if;

/*
 *  08/12/2023
 *  Rodrigo Pereira Faria
 */

import javax.swing.JOptionPane;

public class ElseIf {
    public static void main(String[] args) {
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura atual em : "));

        boolean temperaturaAbsurdamenteQuente = temperatura>36;

        boolean temperaturaCalor = temperatura>=29 && !temperaturaAbsurdamenteQuente; 
        //= ... && temperatura <= 36
        boolean temperaturaAmena = temperatura>=20 && !temperaturaCalor; 
        //= ... && temperatura < 29
        boolean temperaturaFria = temperatura>=10 && !temperaturaAmena; 
        //= ... && temperatura < 20
        boolean temperaturaExtremamenteFria = temperatura > -273 && !temperaturaFria;
        //= ... && temperatura < 10

        System.out.printf("Temperatura digitada = %.2f", temperatura);
        if(temperaturaAbsurdamenteQuente){
            JOptionPane.showMessageDialog(null, "Está pegando fogo.");
        }
        else if(temperaturaCalor){
            JOptionPane.showMessageDialog(null, "Está calor. As pessoas estão suando intensamente. Pode ser bom levar um protetor solar para se proteger dos raios do Sol.");
        }
        else if(temperaturaAmena){
            JOptionPane.showMessageDialog(null, "Temperatura está amena.");
        }
        else if(temperaturaFria){
            JOptionPane.showMessageDialog(null, "Está esfriando. Melhor utilizar um casaco e evitar tomar banho frio.");
        }
        else if(temperaturaExtremamenteFria){
            JOptionPane.showMessageDialog(null, "Está muito frio, você já está virando um picolé.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Temperatura abaixo do zero absoluto, veja se a digitação está correta");
        }
    }
}

/*
 * Crie um programa que verifica a temperatura do ambiente e julga se está calor, frio ou normal.
 * Entradas:
 * 40, 31, 26, 19, 0, -274
 */
