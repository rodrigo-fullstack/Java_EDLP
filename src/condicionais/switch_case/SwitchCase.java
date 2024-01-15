package condicionais.switch_case;

/*
 *  Rodrigo Pereira Faria
 *  08/12/2023
 */

import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        double num01 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double num02 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        double auxNum01 = 0;
        double auxNum02 = 0;
        double resultado = 0;
        String operador = JOptionPane.showInputDialog("Digite o operador que você quer: (+, -, *, /, %, ^ e raiz quadrada)");
        switch (operador){
            case "+":
                resultado = num01 + num02;
                break; //Anotação 01;
            case "-":
                resultado = num01 - num02;
                break;
            case "*":
                resultado = num01 * num02;
                break;
            case "/":
                resultado = num01 / num02;
                break;
            case "%":
                resultado = num01 % num02;
                break;
            case "^":
                resultado = Math.pow(num01,num02);
            case "raiz quadrada" :
                auxNum01 = Math.sqrt(num01);
                auxNum02 = Math.sqrt(num02);
                break;
            default:
                System.out.println("O operador digitado não existe em nosso programa.");
        }
        
        if(operador.equals("raiz quadrada")){
            JOptionPane.showMessageDialog(null, "Raiz quadrada do primeiro: " + Math.round(auxNum01) + "\nRaiz quadrada do segundo: " + auxNum02);
        }
        else{
            JOptionPane.showMessageDialog(null, "Resultado do operador " + operador + " foi: "+ resultado);
        }


    }
}

/*
 * Crie um programa em Java que pede dois números de entrada para o usuário; depois, pergunta qual operação deve ser feita (+, -, /, *, %, Math.pow(n1,n2), Math.sqrt)
 * Entrada:
 * 2,4
 * 
 * Saída:
 * + = 6;
 * - = -2;
 * / = 0.5;
 * * = 8;
 * % = 2
 * Math.pow(2,4) = 16;
 * Math.sqrt(2) e Math.sqrt(4)
 * 
 * Anotação 01 = Quando não coloca o break, continua executando as instruções.
 */