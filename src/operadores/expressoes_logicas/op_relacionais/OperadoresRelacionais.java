package operadores.expressoes_logicas.op_relacionais;

/*
 * Rodrigo Pereira Faria
 * 28/11/2023
 */

public class OperadoresRelacionais {
    public static void main(String[] args) {
        System.out.println("Testando operadores relacionais em Java");

        boolean exp001 = 8>2;
        System.out.printf("expressão001 = %b%n%n", exp001);
        
        boolean exp002 = 9 > -1;
        System.out.printf("expressão002 = %b%n%n", exp002);
        
        boolean exp003 = 1 > 3;
        System.out.printf("expressão003 = %b%n%n", exp003);
        
        boolean exp004 = 1 < 90;
        System.out.printf("expressão004 = %b%n%n", exp004);
        
        boolean exp005 = 3<-1;
        System.out.printf("expressão005 = %b%n%n", exp005);
        
        boolean exp006 = 2>2;
        System.out.printf("expressão006 = %b%n%n", exp006);

        boolean exp007 = 9<9;
        System.out.printf("expressão007 = %b%n%n", exp007);

        boolean exp008 = 23==11;
        System.out.printf("expressão008 = %b%n%n", exp008);

        //boolean exp009 = 7 == 290-283;
        //System.out.printf("expressão009 = %b%n%n", exp009);

    }
}

/*
 * Criando algumas expressões relacionais
 * 
 * exp001 = 8>2
 * exp002 = 9>-1
 * exp003 = 1>3
 * exp004 = 1<90
 * exp005 = 3<-1
 * exp006 = 2>2
 * exp007 = 9<9
 * exp008 = 23 == 11
 * exp009 = 7 == 7
 */