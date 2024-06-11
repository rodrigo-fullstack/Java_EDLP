package listas.exercicios_listas.ecommerce;

/*
RODRIGO PEREIRA FARIA
* 08/06/24
EXERCÍCIO ECOMMERCE
* */

import java.util.*;

public class Main {
    /*Planejando execução do exercício
    * 1. Criar o objeto produto
    * 1.1 Criar classe Produto;
    * 1.2 Criar atributos e getters e setters
    *
    * 2. Declara a criação da lista no método main
    *
    * 3. Dar entrada em 5 objetos do tipo produto
    *
    * 4. Criar método removeCaros recebendo a lista de objetos
    * 4.1 Utilizando um iterator na lista, percorre verificando se o valor do elemento é
    * maior igual a R$100,00
    * 4.2 Se sim, remove o elemento
    * */
    public static void main(String[] args) {
        /*Declaração da Lista em Java
        Para declarar uma lista em Java, é preciso chamar o objeto List, depois entre "<" e ">" especificar o tipo da lista, isso também é chamado
        de parâmetros de tipo; o nome da lista e a instanciação do ArrayList com o respectivo tipo ou sem tipo (declaração implícita);
        * */
        List<Produto> listaProdutos = new ArrayList<>();
        int quantidadeProdutos = 5;
        Produto produtoTeste = new Produto();
        
        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto meuProduto = new Produto();
            String nomeProd = "a";
            int valorProd = gerarNumeroAleatorio(20, 200);
            System.out.println("valorProd = " + valorProd);
            meuProduto.nome = nomeProd;
            meuProduto.preco = valorProd;
            System.out.println(meuProduto.nome);
            System.out.println(meuProduto.preco);
            listaProdutos.add(meuProduto);
        }
        /*ListIterator
        É um objeto que serve como iterador das listas. Diferente do iterator, somente funciona para listas. Possui métodos mais técnicos como verificar
        se possui elemento anterior, verificar número da posição e mudar elementos das posições
        * */
        ListIterator<Produto> it = listaProdutos.listIterator();
        while(it.hasNext()){
            Produto produto = it.next();
            int indice = it.nextIndex();
            System.out.printf("Índice: %d%nNomeProduto = %s%nPreçoProduto = %.2f%n", indice, produto.nome, produto.preco);
        }




    }

    static int gerarNumeroAleatorio(int min, int max){
        Random aleatorio = new Random();
        //Gerando número aleatório entre um limite máximo e mínimo
        return aleatorio.nextInt((max - min) + 1) + min;
    }


}

/*
 * Você é um desenvolvedor em uma empresa de comércio eletrônico e precisa implementar
 * uma funcionalidade para remover todos os produtos do carrinho de compras que
 * têm um preço maior que $100.
 *
 * Você tem uma lista de objetos Product, onde cada objeto
 * Product tem um atributo name e um atributo price.
 *
 * Escreva um método removeProdutosCaros que recebe uma lista de objetos Product
 * como entrada e remove todos os produtos com um preço maior que $100.
 * */

