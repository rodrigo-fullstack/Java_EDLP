package operadores.ternario;

/*
 *  Rodrigo Pereira Faria
 *  02/12/23
 */

public class OperadorTernario{
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 90;
        int num3 = (num1<num2) ? num1 + num2 : num2 - num1;
        System.out.println("num3 = " + num3);

        String nome1 = "José";
        String nome2 = "José";
        String mensagem = (nome1 == nome2) ? "Chará" : "Não são chará";
        System.out.println(mensagem);
    }
}

//Testando operador ternário