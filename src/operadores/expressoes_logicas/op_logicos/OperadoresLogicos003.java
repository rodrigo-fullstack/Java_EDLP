package operadores.expressoes_logicas.op_logicos;

public class OperadoresLogicos003 {
    public static void main(String[] args) {
        boolean condicao001 = 2>3 & 0<1; // Executa as operações de ambas comparações
        boolean condicao002 = 8>3 | 15<2; // Executa as operações de ambas comparações

        boolean condicao003 = 2>3; // Original : 2>3 && 0<1, se a primeira é falsa, então o resultado é falso
        boolean condicao004 = 8>3; // Original : 2>3 && 0<1, se a primeira é verdade, então o resultado é verdade


        System.out.println(condicao001);
        System.out.println(condicao002);
        System.out.println(condicao003);
        System.out.println(condicao004);
        
    }
}
