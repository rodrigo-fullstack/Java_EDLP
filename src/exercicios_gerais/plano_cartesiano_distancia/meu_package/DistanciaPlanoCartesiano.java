package exercicios_gerais.plano_cartesiano_distancia.meu_package;

/*
 *  Rodrigo Pereira Faria
 *  08/12/2023
 */

import javax.swing.JOptionPane;

public class DistanciaPlanoCartesiano {
    public static void main(String[] args) {
        //Entrada
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o x1: "));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o x2: "));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o y1: "));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o y2: "));
 
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("Valores digitados: %nx1 = %.2f%nx2 = %.2f%ny1 = %.2f%ny2 = %.2f%n", x1, x2, y1, y2);
        JOptionPane.showMessageDialog(null, "A distância foi: " + distancia);

    }
}
/*
 * Crie um programa em Java que calcula a distância entre dois pontos no plano cartesiano P(x1,y1) e Q(x2,y2) sabendo que a fórmula da distância = raizQuadrada((x2-x1)² + (y2 - y1)²)
 * 
 * Entrada:
 * x1 = 3;
 * x2 = 5;
 * y1 = 9;
 * y2 = 12;
 * 
 * Cálculo:
 * 
 * Raiz((5-3)² + (12-9)²) =
 * = Raiz(2² + 3²) = Raiz(4+9) = Raiz(13) = 3.61
 * Como fazer?
 * 
 * Sugestão futura: considerar os pontos como sendo classes, instanciando dois objetos para eles.
 * Primeiro dar entrada nos pontos: x1, y1 e x2, y2, darei entrada com a classe JOptionPane
 * Fazer o cálculo utilizando a classe Math:
 * distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))
 * 
 */