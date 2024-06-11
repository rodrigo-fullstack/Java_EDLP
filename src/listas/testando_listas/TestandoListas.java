package listas.testando_listas;

/*
* TESTANDO LISTAS
* RODRIGO PEREIRA FARIA
* 05/06/24
*
* Crie um programa que realize a criação de uma lista, insere 4 dados e remove 2 dados.
*
* */

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
//Para números aleatórios
import java.util.Random;

public class TestandoListas {
    public static void main(String[] args) {
        /*
        Criando a lista com a classe java.util.list e java.util.ArrayList
        * */
        List<Integer> numeros = new ArrayList<Integer>();
        //Objeto Random para criar números aleatórios, é especificada uma semente para fazer com que os mesmos números aleatórios sejam gerados
        Random geradorAleatorio = new Random(19344);

        /*Adicionando números com o método add*/
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        /*Acessando elementos com o método get*/
        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));

        //Demonstrando tamanho da lista por meio do método size();
        System.out.printf("Tamanho da lista: %d%n", numeros.size());

        /*For each
        For each em Java é feito com a declaração da variável tipada para cada um dos elementos
        em seguida é especificado o vetor onde será percorrido
        *
        * */

        for (int i = 0; i < 7; i++){
            /*geradorAleatório.nextInt(25);
            * Este é um método do objeto da classe Random que define um inteiro aleatório de 0 a n, no caso o 25
            * */
            numeros.add(geradorAleatorio.nextInt(25));
        }

        //Remove um nmúero de posição n, no caso, posição 1
        numeros.remove(1);
        //Cpm o método da classe Wrapper Integer valueOf() ele verifica qual a posição em que o número está presente e o remove
        numeros.remove(Integer.valueOf(5));

        exibirLista(numeros);
        exibirTamanhoLista(numeros);

        excluirPares(numeros);
        exibirLista(numeros);
        exibirTamanhoLista(numeros);

    }

    /*Criando função acessível para o método main no mesmo documento*/
    static void exibirLista(List<Integer> lista){
        System.out.println("=== Exibindo números da lista: ===");
        for(int numero : lista){
            System.out.println(numero);

        }
    }

    static void exibirTamanhoLista(List<Integer> lista){
        System.out.println("Tamanho da lista = " + lista.size());
    }
    /*Eliminando todos os números que são pares*/
    static void excluirPares(List<Integer> lista){
        System.out.println("=== Excluindo números pares da lista ===");
        //Já foi inicializado portanto não precisa de new
        Iterator<Integer> iterador = lista.iterator();

        /*Verifica se possui um próximo número, se sim executa as linhas até que não possua*/
        while(iterador.hasNext()){
            /*iterador.next()
            É um método que armazena o número atual da posição da lista;
            Números da lista precisam ser declarados com seu respectivo tipo, como Integer, Object, Double, etc*/
            Integer numero = iterador.next();
            if(numero % 2 == 0){
                System.out.println("Num " + numero + " é par, será removido.");
                iterador.remove();
            }
        }

        /* Gera um erro de concurrentModifyierException
        for(int numero : lista) {
            if(numero % 2 == 0){
                lista.remove(Integer.valueOf(numero));
            }
        }
        */

    }
}
