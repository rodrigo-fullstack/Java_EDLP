package exercicios_gerais.calculo_area.meu_package;

public class Main {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();

        int base1 = 10;
        int altura1 = 20;
        int area1 = calcular.CalcularArea(base1, altura1);
        System.out.println("Your area was " + area1 + " with base = " + base1 + " and height = " + altura1 );
        
        double base2 = 20.2;
        double altura2 = 10.6;
        double area2 = calcular.CalcularArea(base2, altura2);
        System.out.println("Your area was " + area2 + " with base = " + base2 + " and height = " + altura2);
    }
}
