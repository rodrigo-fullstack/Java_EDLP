package conversao_de_tipos.conteudos;

/* 
 *  Rodrigo Pereira Faria
 *  02/12/23
 */

public class ConversaoDeChar{
    public static void main(String[] args) {
        char caracter = '1';
        char somandoCaracter = (char) (3+caracter); //Char permite somas
        System.out.printf("É possível somar e transformar o resultado em um caracter: 3+\'1\' = %c", somandoCaracter);
        
        caracter = '0';
        int num = 2;
        //Transformando inteiro em caracter
        caracter = Character.forDigit(num, 10);
        System.out.println(caracter);

        //Transformando caracter para inteiro
        int numCaracter = Character.digit(caracter,10);
        System.out.println(numCaracter);

    }
}

/* 
 * Sintaxe do método da Classe Character:
 * forDigit(numeroInteiro, baseNúmerica - pode ser decimal, octal ou hexadecimal)
 * 
 * digit(char, baseNumérica)
 */