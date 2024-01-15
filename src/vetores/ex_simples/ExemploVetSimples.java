package vetores.ex_simples;

/*
 * 28/12/23
 * Rodrigo Pereira Faria
 */

public class ExemploVetSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numeros = new double[] {2.0, 4.0, 7.0, 14.0};
		
		System.out.println(numeros);
		
		int primeiro = (int) numeros[0];
		int ultimo = (int) numeros[3];
		int somaPrimeiroComUltimo = (int) (primeiro + ultimo);
		//int somaPrimeiroComUltimo = numeros[1] + numeros[4]; Erro pois índice 4 não, vai de 0 a 3
		System.out.println("A soma do primeiro " + primeiro +"com o último " + ultimo +" foi: "+ somaPrimeiroComUltimo);
		
		int meio01 = (int) numeros[1];
		int meio02 = (int) numeros[2];
		double mediaMeio = (double) (meio01+meio02)/2;
		System.out.println("A média dos termos do meio (" + meio01 + " e " + meio02 + ") foi: "+ mediaMeio);
		int subNumsDoMeio = (int) (meio01 - meio02);
		System.out.println("A subtração dos números do meio foi: " + subNumsDoMeio);
		
	}

}
