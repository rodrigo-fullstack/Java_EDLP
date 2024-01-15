package exercicios_gerais.velocidade_media.meu_package;

/*
 * Rodrigo Pereira
 * 03/11
*/
import java.util.Scanner;
public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double velocidade, tempo, distancia;
        System.out.println("Você está em uma viagem, seu carro está em movimento retilíneo uniforme em uma rodoviária. Dê entrada na sua velocidade, em km/h, e no tempo, em h, estimado da sua viagem para identificar a distância. ");

        System.out.print("Velocidade = ");
        velocidade = input.nextDouble();
        
        System.out.print("Tempo = ");
        tempo = input.nextDouble();
        input.close();

        distancia = velocidade*tempo;
        System.out.println("A distancia do percurso é: " + distancia + "km.");

    }
}

/*
 * Crie um programa que recebe como entrada dois dados velocidade e tempo, o programa deve calcular utilizando a fórmula Vm = distancia/tempo a distancia do percurso e exibí-la no console.
 * 
 * 1 Dar entrada nos dados velocidade e tempo, velocidade em km/h e o tempo em horas
 * 2 Decompor a fórmula para encontrar a distãncia
 * 3 Exibir a distãncia
 *
 * Vm = deltaS/deltaT
 * Distancia = Vm*deltaT 
*/