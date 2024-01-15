package operadores.atribuicao.incremento_decremento;

/*
 * Rodrigo Pereira Faria
 * 01/12/23
 */

public class IncDec{
    public static void main(String[] args) {
        int x = 12;
        
        System.out.println(x++); // Realizou depois do print
        System.out.println(x); //Resultado

        int y = 90;
        System.out.println(--y); // Decrementa primeiro depois exibe o número
        System.out.println(y--);
        System.out.println(y);

    }
};

/*
 * Testando incremento e decremento em java
 * 
 */
