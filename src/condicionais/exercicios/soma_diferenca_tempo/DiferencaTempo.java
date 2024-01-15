package condicionais.exercicios.soma_diferenca_tempo;

import javax.swing.JOptionPane;

/*
 * 04/01/2024
 * Rodrigo Pereira Faria
 * Diferença dos Intervalos de tempo
 */

public class DiferencaTempo {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=== Diferença entre os Intervalos de Tempo ===");
		
		JOptionPane.showMessageDialog(null, "Digite a seguir dois intervalos de tempos:");
		JOptionPane.showMessageDialog(null, "= Primeiro Intervalo de Tempo: =");
		
		int horas01 = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas: "));
		int minutos01 = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos: "));
		int segundos01 = Integer.parseInt(JOptionPane.showInputDialog("Digte os segundos: "));
		
		JOptionPane.showMessageDialog(null, "= Segundo Intervalo de tempo: =");
		int horas02 = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas: "));
		int minutos02 = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos: "));
		int segundos02 = Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos: "));
		
		int subHoras = horas01 - horas02;
		int subMinutos = minutos01 - minutos02;
		int subSegundos = segundos01 - segundos02;
		
		int excedenteHr = subHoras / -24 + 1;
		int excedenteMin = subMinutos / -60 + 1;
		int excedenteSeg = subSegundos / -60 + 1;
		
		boolean horasNegativas = subHoras < 0;
		boolean minutosNegativos = subMinutos < 0;
		boolean segundosNegativos = subSegundos < 0;
		
		
		//Se for verdade, muda as horas baseado no limite excedente
		if(horasNegativas) {
			//Soma baseando-se na quantidade de vezes que excedeu 24
			subHoras += 24 * excedenteHr ;
		}
		
		//Se for verdade...
		if(minutosNegativos) {
			//Retira do número de horas a quantidade excedente
			subHoras -= excedenteMin ;
			
			//Soma para encontrar o restante de minutos
			subMinutos += 60 * excedenteMin;
			
			//Caso isso resulte em 60, 
			//(quando há a soma de dois números múltiplos de 60 em sequẽncia: 240, 300; 360, 420; etc.
			if(subMinutos == 60) 
				subMinutos = 0;
			
			//Repete o processo das horas verificando se os cálculos acima resultaram em horas negativas
			if(subHoras < 0) {
				excedenteHr = subHoras/-24 + 1;
				subHoras += 24 * excedenteHr;
			}
		}
		
		//Faz o mesmo cálculo, agora para segundos
		if(segundosNegativos) {
			subMinutos -= excedenteSeg ;
			subSegundos += 60 * excedenteSeg;
			
			if(subSegundos == 60)
				subSegundos = 0;
			
			//Repete os passos de cima
			if(subMinutos < 0) {
				excedenteMin = subMinutos / -60 + 1;
				subHoras -= excedenteMin;
				subMinutos += 60 * excedenteMin;
				
				if(subHoras < 0) {
					excedenteHr = subHoras / -24 + 1;
					subHoras += 24 * excedenteHr;
				}
			}
		}	
		
		JOptionPane.showMessageDialog(null, 
				"Horas = " + subHoras
					+ "\nMinutos = " + subMinutos
					+ "\nSegundos = " + subSegundos
					);	
	}
}