package com.estruturas_repeticao.exercicios.recrutamento_empresa;

import javax.swing.JOptionPane;

/*
 * 23/01/2024
 * Rodrigo Pereira Faria
 * Recrutamento da Empresa JS
 */

public class RecrutamentoEmpresa {

	public static void main(String[] args) {
		//Para sexo == F ou == M
		char sexo = '.';
		
		//Quantidade
		int quantidadeHomens = 0;
		int quantidadeMulheresExp = 0;
		
		//Idades
		int idadeHomem = 0;
		int idadeMulher = 0;

		//Soma e Média da Idade Dos Homens
		double somaIdadeHomens = 0;
		double mediaIdadeHomens = 0;
		
		//Soma e Média da Idade Das Mulheres com Experiência
		double somaIdadesMulheresExp = 0;
		double mediaIdadeMulheresExp = 0;
		
		//Homens entre 35 e 45 anos
		int quantidadeHomensEntre35e45 = 0;
		double porcentagemHomensEntre35E45Anos = 0;
		
		//Menor Idade de Mulher com Experiência; 
		int menorIdadeMulherExp = 0;

		//Para verificar se F possui experiência 
		int experiencia = 0;
		
		//Para entrada do nível de escolaridade;
		int nivelDeEscolaridade = 0;

		int qtdFundamental = 0;
		int qtdMedio = 0;
		int qtdGraduacao = 0;
		int qtdPosGraduacao = 0;
		
		//Para começar o programa
		int opcaoContinuar = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Quer começar? Digite 0 para não e 1 para sim: "));
		
		while(opcaoContinuar == 1) {
			//Entrada Caracter com JOptionPane
			sexo = JOptionPane.showInputDialog(
					"Digite F para Feminino e M para Masculino: ")
					.charAt(0);  
			
			boolean candidatoHomem = 'M' == sexo;
			boolean candidataMulher = 'F' == sexo;

			//Verifica se é homem
			if(candidatoHomem) {
				quantidadeHomens++;
				
				idadeHomem = Integer.parseInt(
						JOptionPane.showInputDialog(
								"Digite a sua idade (homem): "));
				
				somaIdadeHomens += idadeHomem;
				
				boolean idadeEstaEntre35e45 = idadeHomem >= 35 && idadeHomem <= 45;
				if(idadeEstaEntre35e45) quantidadeHomensEntre35e45++;
				
				
				//System.out.println();
				JOptionPane.showMessageDialog(null, 
						"Digite o nível de escolaridade a seguir");
				
				//Estrutura se houver erro no nível de escolaridade
				while(true) {
					//Entrada do nível de Escolaridade
					nivelDeEscolaridade = Integer.parseInt(
							JOptionPane.showInputDialog(
								"1 = Ensino Fundamental;\n"
								+ "2 = Ensino Médio;\n"
								+ "3 = Graduação;\n"
								+ "4 = Pós-Graduação."));
					
					//Aumenta a quantidade de cada um com base na entrada
					switch(nivelDeEscolaridade) {
						case 1: 
							qtdFundamental++;
							break;
							
						case 2: 
							qtdMedio++;
							break;
							
						case 3: 
							qtdGraduacao++;
							break;
							
						case 4: 
							qtdPosGraduacao++;
							break;
							
						//Se não for nenhuma das opções, repete
						default:
							JOptionPane.showMessageDialog(null, 
									"Digite novamente o nível de escolaridade");;
							//Repetição
							continue;
					}
					break;
				}
			}
			
			//Verifica se é mulher
			else if(candidataMulher) {
				idadeMulher = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade (mulher) = "));
				
				//System.out.print("Possui experiência no cargo?\n"
					//	+ "Digite S para sim e N para não: ");
				
				experiencia = Integer.parseInt(
						JOptionPane.showInputDialog(
								"Possui experiência no cargo?\n"
						+ "Digite 1 para sim e 0 para não: "));
				
				//boolean candidataComExp = experiencia.equalsIgnoreCase("S");
				
				//Verificação de Experiência
				boolean candidataComExp = experiencia == 1;
				if(candidataComExp){
					System.out.println("Possui experiência");
					
					//Aumenta quantidade de mulheres com exp
					quantidadeMulheresExp ++;
					
					//Soma às idades para Média
					somaIdadesMulheresExp += idadeMulher;
					
					//Verifica se idade atual é menor do que a menor idade
					//E se a quantidade de mulheres é 1
					boolean idadeDigtMenorAtual = idadeMulher < menorIdadeMulherExp;
					if(idadeDigtMenorAtual || quantidadeMulheresExp == 1 ) 
						menorIdadeMulherExp = idadeMulher;
				}
				
				//Estrutura se houver erro no nível de escolaridade
				while(true) {
					//Entrada do nível de Escolaridade
					nivelDeEscolaridade = Integer.parseInt(
							JOptionPane.showInputDialog(
								"1 = Ensino Fundamental;\n"
								+ "2 = Ensino Médio;\n"
								+ "3 = Graduação;\n"
								+ "4 = Pós-Graduação."));
					
					//Aumenta a quantidade de cada um com base na entrada
					switch(nivelDeEscolaridade) {
						case 1: 
							qtdFundamental++;
							break;
							
						case 2: 
							qtdMedio++;
							break;
							
						case 3: 
							qtdGraduacao++;
							break;
							
						case 4: 
							qtdPosGraduacao++;
							break;
							
						//Se não for nenhuma das opções, repete
						default:
							JOptionPane.showMessageDialog(null, 
									"Digite novamente o nível de escolaridade");;
							//Repetição
							continue;
					}
					break;
				}//Fim-While
			}//Fim-Se
			
			//Se não for digitado M nem F, digita novamente
			else {
				System.out.println("Digite novamente o sexo, erro na sua digitação. ");
				continue;
			}
			
			//opcaoContinuar = input.nextLine().charAt(0);
			
			//Pergunta se quer adicionar mais candidatos
			opcaoContinuar = Integer.parseInt(
					JOptionPane.showInputDialog(
					"Quer continuar? Digite 0 para não e 1 para sim: "));
		}
		
		//Para quando não começa o programa
		if(quantidadeHomens == 0 && quantidadeMulheresExp == 0) {
			System.out.println("Sem candidatos");
			return;
		}
		
		JOptionPane.showMessageDialog(null,
				"Número de candidatos: " + quantidadeHomens
				+ "\nNúmero de candidatas com experiência: " + quantidadeMulheresExp);
		
		mediaIdadeHomens = somaIdadeHomens/quantidadeHomens;
		
		mediaIdadeMulheresExp = somaIdadesMulheresExp/quantidadeMulheresExp;
		
		JOptionPane.showMessageDialog(null, 
				"Média das idades dos homens: " + mediaIdadeHomens 
				+ "\nMédia das Idades das mulheres com experiência: " + mediaIdadeMulheresExp);
		
		//Verifica se houve homens entre 35 e 45 anos
		boolean temHomensEntre35e45 = quantidadeHomensEntre35e45 != 0; 
		if(temHomensEntre35e45) {
			//Fórmula obtida através de regra de três
			porcentagemHomensEntre35E45Anos = quantidadeHomensEntre35e45 * 100 / quantidadeHomens;
			
			JOptionPane.showMessageDialog(null, 
				"Quantidade de homens entre 35 e 45 anos: " + quantidadeHomensEntre35e45
				+ "\nPorcentagem sobre " + quantidadeHomens + " (total de candidatos): "
				+ porcentagemHomensEntre35E45Anos + "%");
		}
		
		//Verifica se houve mulheres com experiência
		boolean temMenorIdadeMulherExp = quantidadeMulheresExp != 0;
		if(temMenorIdadeMulherExp)
			JOptionPane.showMessageDialog(null, 
				"Menor idade das mulheres com experiência: " + menorIdadeMulherExp);
		
		JOptionPane.showMessageDialog(null, 
				"Nível de Escolaridade dos Candidatos\n"
				+ "(incluindo pessoas sem experiência)\n"
				+ "Ensino Fundamental = " + qtdFundamental
				+ "\nEnsino Médio = " + qtdMedio
				+ "\nGraduação = " + qtdGraduacao
				+ "\nPós-graduação = " + qtdPosGraduacao);
		
	}

}

/*
	Entrada:
	
	Para média
	
	idades homens: 
	
	22, 33, 20;
	 
	Média = 25
	
	===
	
	idades mulheres:
	
	21, 30(exp), 24(exp), 18, 33(exp); 
	
	Média  = 29

	---
	
	Para Porcentagem Homens entre 35 e 45 anos

	idadeHomem: 
	20, 36, 38, 21, 42

	PorcentagemHomem35e45anos = 60%.
	
	
*/