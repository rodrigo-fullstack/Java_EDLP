package variaveis.testando_erros001;

/*
 *  11/11/2023
 *  Rodrigo Pereira Faria    
 *  Testando erros de soma;
 */

public class Erros1 {
    public static void main(String[] args) {
        int y = 12;
        
        double saldo = 234.5;

        String animal = "cachorro";
        String nome = "Rodrigo";

        boolean valorLogico = true;
        //boolean valorLogico2 = false;

        //Começando testes
        String inteiroComString = y + animal; //Anotação 01
        System.out.println(inteiroComString);

        //int inteiroComString = num + animal : Anotação 02
        //boolean somaValoresLogicos = valorLogico + valorLogico2 : Anotação 03
        //double doubleComString = saldo + animal : Anotação 04

        String mensagem = "Seu saldo é " + saldo + nome; //Anotação 05
        System.out.println(mensagem);

        String temCartao = "Cartão = " + valorLogico; //Anotação 06
        System.out.println(temCartao);

        //boolean boolComString = valorLogico2 + temCartao : Anotação 07
    }
}

/*
 * Anotação 01 = Uma variável do tipo String pode receber a concatenação de um inteiro e uma string
 * 
 * Anotaçaõ 02 = Um inteiro não pode receber a concatenação de um inteiro e uma String
 * 
 * Anotação 03 = Não se pode somar booleans.
 * 
 * Anotação 04 = Não se pode concatenar double com string
 * 
 * Anotação 05 = Strings podem receber concatenação de double e inteiro
 * 
 * Anotação 06 = Strings podem receber concatenação de booleans;
 * 
 * Anotação 07 = Não é possível somar booleans sem ser em Strings para concatenação
 */