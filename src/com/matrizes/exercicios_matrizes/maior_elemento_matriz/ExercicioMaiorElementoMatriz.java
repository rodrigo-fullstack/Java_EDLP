package com.matrizes.exercicios_matrizes.maior_elemento_matriz;

/*
* RODRIGO PEREIRA FARIA
* 14/06/24
* MAIOR ELEMENTO MATRIZ
* */

import java.util.Random;
import java.util.Arrays;

public class ExercicioMaiorElementoMatriz {
    public static void main(String[] args) {
        int qtdLinhas = 3;
        int qtdColunas = 3;

        /*Criando matriz de inteiros com classe Wrapper Integer*/
        Integer[][] matrizA = new Integer[3][3];

        /*Iterador superior: seleciona uma linha ou coluna*/
        for(int i = 0; i < qtdLinhas; i++){
            //Iterador inferior: Itera sobre os elementos da linha ou coluna
            for(int j = 0; j < qtdColunas; j++){
                matrizA[i][j] = 0;
            }
        }

        System.out.println(Arrays.toString(matrizA));
    }
}

/*
* Crie um programa que declara uma matriz A 3x3 com números aleatórios. Depois, verifica qual é o maior elemento de cada linha da matriz.
* */