package exercicios_gerais.pintando_tanques.meu_package;

/*
 *  Rodrigo Pereira Faria
 *  08/12/2023
 *  Exercício Pintura de Tanques
 */

import java.util.Scanner;

public class PintandoTanques {
    public static void main(String[] args) {
        System.out.println("Programa da Pintura dos Tanques Cilíndricos");
        
        //Entrada
        Scanner input = new Scanner(System.in);

        final double PI = 3.14;
        System.out.print("Digite a altura em m²: ");
        double altura = input.nextDouble();
        System.out.print("Digite o raio do cilindro (m²): ");
        double raio = input.nextDouble();
        input.close();

        //Operações
        double areaDoTanque = 2*PI*raio*(raio+altura);
        double quantidadeDeLatasGastas = areaDoTanque/15;
        int quantidadeDeLatasInteiras = (int) (quantidadeDeLatasGastas + 1);
        double custo = quantidadeDeLatasInteiras * 50;

        //Saída
        System.out.printf("Com uma área de %.2f m², foram gastos %.2f latas de tinta comprando-se %d latas no valor total de R$%.2f",areaDoTanque, quantidadeDeLatasGastas, quantidadeDeLatasInteiras, custo);

    }
}
/*
 * Calcular quantidade de latas de tinta e custo para pintar tanques cilíndrivos de combustível, fornecendo a altura e o raio do cilindro.
 * Lata de tinta 01 = 50 reais
 * cada lata contem 5 litros
 * cada litro pinta 3 metros quadrados
 * 
 * Uma lata de tinta, que vale 50 reais, possui 5 litros
 * 1 litro pinta 3 m², então 1 lata pinta 15 m²
 * 
 * Se eu somente vou pintar fora do tanque, utilizaremos a fórmula da área do cilindro.
 * Área do cilindro = 2*pi*r² + 2*pi*r*h ou 2*pi*r*(r + h)
 * 2 pi r² = área das bases (circunferências)
 * 2 pi r h = área da figura lateral (retângulo)
 * 
 * Entrada: altura e raio
 * h = 2;
 * raio = 1;
 * pi sendo 3;
 * 
 * Área Cil = 2*3*1(1+2) = 18m² 
 * Quantidade = Área CIl/15(metros pintados com uma lata)
 * Quantidade = 1.2
 * Custo = 50*1.2 = 60 reais
 * Considerando que se pode comprar menos de uma lata isto está correto, porém mais fiel à lógica seria utilizar um arredondamento para cima aqui
 *  
 * Saída: custo e quantidade
 * O que fazer?
 * 
 * 01 Tipos das variáveis: tudo double
 * 02 Declarar variáveis de altura e raio.
 * 03 Realizar cálculo da área do cilindro
 * 04 QuantidadeDecimal = ÁreaDoCilindro/15
 * 05 QuantidadeInteira = (cast_inteiro) (QuantidadeDecimal + 1) Arredonda para baixo e soma + 1, ou seja, arredonda para cima
 * 05 Custo = Quantidade*50
 * 06 Saída: custo e quantidade
 */