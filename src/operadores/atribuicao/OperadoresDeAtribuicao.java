package operadores.atribuicao;

/*
 * Rodrigo Pereira Faria
 * 02/12/23
 */

public class OperadoresDeAtribuicao{
    public static void main(String[] args) {
        System.out.println("Estamos numa fila de um banco para resolver problemas de documentos.");
        int quantidadeDePessoas = 0;
        System.out.println("Quantidade atual de pessoas: " + quantidadeDePessoas);

        System.out.println("Chegaram 4 pessoas");
        quantidadeDePessoas += 4;
        System.out.println("Quantidade atual de pessoas: " + quantidadeDePessoas);

        System.out.println("Saíram a metade das pessoas");
        quantidadeDePessoas /= 2;
        System.out.println("Quantidade atual de pessoas: " + quantidadeDePessoas);
        
        System.out.println("Chegaram o triplo da quantidade atual");
        quantidadeDePessoas *= 3;
        System.out.println("Quantidade atual de pessoas: " + quantidadeDePessoas);

        System.out.println("Estão agora n pessoas, sendo que esse número equivale ao resto da divisão da quantidade atual com 5");
        quantidadeDePessoas %= 5;
        System.out.println("Quantidade atual de pessoas: " + quantidadeDePessoas);

        System.out.println("Houve um terremoto e o local teve que ser evacuado.");
        quantidadeDePessoas -= quantidadeDePessoas; // = 0 
        System.out.println("Quantidade atual de pessoas: " + quantidadeDePessoas);

    }
}

/*
 * Testando operadores de atribuição
 */