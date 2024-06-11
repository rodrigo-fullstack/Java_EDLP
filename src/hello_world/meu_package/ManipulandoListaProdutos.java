package hello_world.meu_package;

import listas.exercicios_listas.ecommerce.Produto;

import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ManipulandoListaProdutos {
    public List<Object> adicionarProdutosLista(List<Object> listaProdutos){
        int quantidadeProdutos = 5;
        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto meuProduto = new Produto();
            int valorProd = gerarNumeroAleatorio(20, 200);
        }
        return listaProdutos;

    }
    public void removeProdutosCaros(List<Object> listaProdutos){

    }

    static int gerarNumeroAleatorio(int min, int max){
        Random aleatorio = new Random(2000);
        //Gerando número aleatório entre um limite máximo e mínimo
        return aleatorio.nextInt((max - min) + 1) + min;
    }
}
