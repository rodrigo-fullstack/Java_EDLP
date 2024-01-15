package conversao_de_tipos.conteudos;

/*
 *  Rodrigo Pereira Faria
 *  02/12/23
 */

public class ConversaoImplicita01 {
    public static void main(String[] args) {
        byte numByte = 127; //Limite de byte = 128
        short numShort = numByte;
        int numInt = numShort;
        long numLong = numInt;
        float numFloat = numLong;
        double numDouble = numFloat;
        System.out.println(numDouble);

        
    }
}

/*
 * Testando conversões implícitas
 * 
 * byte -> short -> int -> long -> float -> double
 * 
 * Isto ocorre porque um tipo engloba o outro na sequência das setas. Short engloba byte, int engloba short, etc.
 */
