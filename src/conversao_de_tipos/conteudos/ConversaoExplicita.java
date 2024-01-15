package conversao_de_tipos.conteudos;

/*
 *  Rodrigo Pereira Faria
 *  02/12/23
 */

public class ConversaoExplicita {
    public static void main(String[] args) {
        int numI = 77;
        long numL = 21L;
        double numD = 2.54;
        
        byte numConvByte = (byte)numI;
        System.out.println("Byte convertido de int = "+ numConvByte);
        numConvByte = (byte)numL;
        System.out.println("Byte convertido de long: " + numConvByte);
        numConvByte = (byte)numD;
        System.out.println("Byte convertido de double: " + numConvByte);
        
        numI = 129;
        numConvByte = (byte)numI;
        System.out.println("Byte convertido acima de limite = " + numConvByte); // Processo conhecido como overflow

        int numConvInteiro = (int)numD;
        System.out.printf("inteiro convertido de double: %d, valor de Double %.2f%n", numConvInteiro, numD);


        short numConvShort = (short) numI;
        System.out.println("Short convertido de Inteiro: " + numConvShort);
        numConvShort = (short) numL;
        System.out.println("Short convertido de long: " + numConvShort);
        numConvShort = (short) numD;
        System.out.println("Short convertido de Double: " + numConvShort);

        float numConvFloat = (float) numD;
        System.out.println("Float convertido de Double: " + numConvFloat);
    }    
}


/*
 * Testando Conversão Explícita
 * 
 */
