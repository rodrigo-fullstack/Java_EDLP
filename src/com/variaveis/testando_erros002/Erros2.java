package com.variaveis.testando_erros002;

/*
 *  Rodrigo Pereira Faria
 *  11/11/2023
 *  Testando Erros de Declaração com String
 */

public class Erros2 {
    public static void main(String[] args) {
        int num = 25;
        double doubleNum = 2.5;
        boolean logico = true;
        String nome = "rodrigo";
        char id = 'b';
        
        //String numero = 527 : Anotação 01
        //String stringNumero = num; 
        //String stringNumero = doubleNum; 
        //String stringLogico = logico; : Anotação 02

        //int inteiroLogico = logico;
        //int inteiroString = nome; 
        //int inteiroDouble = doubleNum; : Anotação 03

        int inteiroChar = id; //Anotação 04
        System.out.println(inteiroChar);

        //double decimalLogico = logico;
        //double decimalString = nome; : Anotação 05

        double decimalInteiro = num;
        System.out.println(decimalInteiro); //Anotação 06

        double decimalChar = id;
        System.out.println(decimalChar);//Anotação 07

        // boolean booleanDouble = 1.0;
        // boolean booleanInteiro = 0;
        // boolean booleanString = nome;
        // boolean booleanChar = id; : Anotação 08
        
        boolean booleanLogico = false;
        System.out.println(booleanLogico);
        System.out.println(nome);   
        System.out.println(num);   
        System.out.println(doubleNum);
        System.out.println(logico);
        
        //num = num;  : Anotação 09
        //String nome = "Rodrigo";
        nome = "Rodrigo";// : Anotação 10

    }
}

/*
 * Anotação 01: Sem aspas não é String
 * 
 * Anotação 02: String não podem receber inteiros nem doubles ou booleans
 * 
 * Anotação 03: Inteiro não pode receber String, nem boolean ou double (algumas coisas são diferentes com a conversão de tipos)
 * 
 * Anotação 04: Inteiro pode receber char, com valor igual a ASCII code do caracter. No caso b = 98 
 * 
 * Anotação 05: Double não pode receber string ou boolean
 * 
 * Anotação 06: Double pode receber inteiro, por ser maior em memória. O nome disso é coerção.
 * 
 * Anotação 07: O mesmo que anotação 04, agora com double. Exemplo de uso, calculo de criptografia e enigma.
 * 
 * Anotação 08: Boolean somente recebe boolean.
 * 
 * Anotação 09: Você pode atribuir uma variável a ela mesma, porém não faz efeito algum.
 * 
 * Anotação 10: Você não pode declarar uma variável duas vezes, para alterar seu valor, basta igualar ao valor desejado. 
 * 
 * Com relação aos números, um número que ocupa maior espaço de memória sempre pode receber um de menor espaço, já o contrário não pode ocorrer. 
 */

