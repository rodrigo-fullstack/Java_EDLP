package operadores.expressoes_logicas.op_logicos;

/*
 *  Rodrigo Pereira Faria
 *  23/11/2023
 */


public class OperadoresLogicos002{
    public static void main(String[] args) {
        boolean P = true;
        boolean Q = false;
        boolean R = false;
        boolean S = true;

        boolean expressao001 = P && Q;
        System.out.printf("expressao001 = %b%n", expressao001); //Especificador de Formato para boolean = %b
        
        boolean expressao002 = R || S;
        System.out.printf("expressao002 = %b%n", expressao002);

        boolean expressao003 = !(P && Q); //Ou !expressao001
        System.out.printf("expressao003 = %b%n", expressao003);

        boolean expressao004  = !P || R;
        System.out.printf("expressao004 = %b%n", expressao004);

        boolean expressao005 = !R && !(P&&Q);
        System.out.printf("expressao005 = %b%n", expressao005);

        boolean expressao006 = (P && Q) || R; 
        System.out.printf("expressao006 = %b%n", expressao006);

        boolean expressao007 = P && S || Q;
        System.out.printf("expressao007 = %b%n", expressao007);

        boolean expressao008 = (P || !P) && (Q || !S);
        System.out.printf("expressao008 = %b%n", expressao008);

        boolean expressao009 = P ^ Q;
        System.out.printf("expressao009 = %b", expressao009);
    }
}

/*
 * Vou criar algumas expressões, resolvê-las e comparar com o que acontece no programa.
 * 
 * P = true; Q = false; R = false; S = true
 * 
 * expressão001 = (P && Q), resultado = false
 * 
 * expressão002 = (R || S) resultado = true
 * 
 * expressão003 = !(P&&Q) = P && Q = false => inverso de false = true
 * 
 * expressão004 = !P || R = P é true, portanto inverte fica false. False ou false leva a false
 * 
 * expressão005 = !R && !(P && Q) = R é false, inverte fica true. P && Q é false, inverte fica true. Resultado final true && true = true
 * 
 * expressao006 = P && Q || R
 * Possibilidades: 
 * P e Q = false
 * false ou R(false) = false
 * 
 * Q ou R = false
 * P(true) && false = false
 * 
 * expressao007 = P && S || Q
 * 
 * Possibilidades:
 * P(true) && S(true) = true
 * true || Q(false) = true
 * 
 * S || Q = true
 * P(true) && true = true
 * 
 * expressão008 = (P || !P) && (Q || !S)
 * P ou não P = true
 * true && (Q(false)) ou não S(true))
 * true && false = false
 * 
 * expressão009 = P ^ Q;
 */
