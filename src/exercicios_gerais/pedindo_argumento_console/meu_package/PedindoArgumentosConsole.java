package exercicios_gerais.pedindo_argumento_console.meu_package;

/*
 * Rodrigo Pereira Faria
 * 05/11
 * Exercício para entender a passagem de parâmetros pelo console
 */

public class PedindoArgumentosConsole{
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        System.out.println("Fazendo o comando: java PedindoArgumentosConsole nome sobrenome, você consegue passar parâmetros pelo prompt de comando");
        
        System.out.println("Olá, " + nome + " " + sobrenome);
    }
}