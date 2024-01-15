package variaveis.variaveis003;

/*
 * Rodrigo 
 * 02/11
 * Calculando Altura de um Triângulo Retângulo
 */

public class AlturaTrianguloRetangulo {
    public static void main(String[] args) {
        //Por algum motivo dá zero quando sen30 = 1/2
        double sen30 = 0.5;
        double hipotenusa = 10;
        double catetoOposto = hipotenusa*sen30;
        System.out.println("altura = " + catetoOposto);

    }
}

/*
 * Fazer um exercício para calcular o lado de um triângulo retângulo sabendo que seu ângulo com a horizontal é 30 e que a aresta procurada é a altura. Com hipotenusa = 20, faça esse exercício
 * sen30 = 1/2
 * C.O/hi = 1/2
 * hi = 2C.O.
 * 20 = 2C.O.
 * C.O. = hi/2
 * C.O. = 10
 * 
*/