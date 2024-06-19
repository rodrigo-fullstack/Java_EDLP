package com.condicionais.exercicios.jogo_escolhas;

import java.util.Scanner;

/*
 * 	01/01/2024
 *  Rodrigo Pereira Faria
 *  Jogo simples RPG
 */
public class JogoRpgEscolhas {

	public static void main(String[] args) {
		//Boas-Vindas ao Usuário
		System.out.println("== Jogo Simples do RPG ===");
		
		System.out.println("Você é um aventureiro que chegou à cidade de Adiwin. ");
		
		System.out.println("Você tem três escolhas para fazer nessa cidade: ");
		System.out.printf(
				"1: Falar com o rei%n"
				+ "2: Beber na taberna%n"
				+ "3: Ir ao centro%n"
				+ "Digite a opção desejada: ");
		
		Scanner input = new Scanner(System.in);
		int opcao = input.nextInt();
		
		boolean vitoria = false;
		
		switch(opcao) {
			case 1:
				System.out.println("Você decidiu falar com o rei.");
				
				System.out.println("O rei te disse que a cidade anda enfrentando muitos problemas "
						+ "com criminalidade, saneamento básico e problemas com ratos.");
				System.out.println("Você percebe também que o rei possui uma bela filha que "
						+ "está na varanda do palácio observando a cidade. ");
				
				System.out.println("O que você escolhe?");
				System.out.printf(
						"1: Ajudar com os Problemas da Cidade%n"
						+ "2: Flertar a filha do rei%n"
						+ "Digite a opção desejada: "
						);
				opcao = input.nextInt();
				switch (opcao) {
					case 1: 
						System.out.println("Você decidiu ajudar com os problemas da cidade.");
						
						System.out.println("Com os guardas, você protegeu os cidadãos dos bandidos,"
								+ " fez vigília durante a noite e "
								+ "auxiliou a expulsar os ratos da cidade.");
						System.out.println("O rei condecorou você com o título de cavaleiro honorável do reino e lhe concedeu uma casa para morar na cidade de Adiwin.");
						
						vitoria = true;
						
						break;
					case 2:
						System.out.println("Você decidiu ser ousado e flertar com a filha do rei.");
						
						System.out.println("Enquanto vocês conversavam, os guardas viram vocês conversando e o prenderam.");
						System.out.println("O rei decidiu te expulsar de seu reino.");
				
						break;
				}
				
				break;
				
			case 2:
				System.out.println("Você decidiu beber na taberna.");
				System.out.println("O clima quente da taberna e as risadas das pessoas são evidentes nesse ambiente.");
				
				System.out.println("Você tem duas opções nesse sentido:");
				System.out.printf("1: Manter-se sóbrio e beber com parcimônia%n"
						+ "2: Beber loucamente com as pessoas%n"
						+ "Digite sua escolha: ");
				opcao = input.nextInt();
				
				switch (opcao) {
					case 1:
						System.out.println("Você decidiu se manter sóbrio bebendo tranquilamente.");
						
						System.out.println("Ao sair da taberna, você entrou em um beco, local escuro, de onde saiu um ladrão para te assaltar.");
						System.out.println("Por você estar sóbrio, você conseguiu superar o ladrão e o venceu na luta.");
						
						vitoria = true;
						
						break;
					case 2:
						System.out.println("Você decidiu beber loucamente com as pessoas.");
						
						System.out.println("Você está vendo tudo rodopiar e não consegue se manter de pé corretamente, andando cambaleando.");
						System.out.println("Você sai da taberna e entra em um beco escuro.");
						System.out.println("Sai um ladrão para te assaltar.");
						System.out.println("Por você não estar sóbrio, não tem forças para superar o ladrão.");
						System.out.println("O ladrão consegue te assaltar, roubando-lhe seus bens mais preciosos.");
				}
				
				break;
				
			case 3: 
				System.out.println("Você decidiu ir ao centro.");
				
				System.out.println("Você avistou um sábio idoso mágico perto da fonte da praça.");
				System.out.println("O que vai fazer?");
				System.out.printf(
						"1: Falar com ele%n"
						+ "2: Continuar seu caminho.%n"
						+ "Opção = ");
				
				opcao = input.nextInt();
				
				switch (opcao) {
					case 1:
						System.out.println("Você foi falar com o ancião e ele lhe disse a seguinte palavra de sabedoria:");
						
						//Nota: palavras de Friedrich Nietzche, filósofo alemão
						System.out.println("\"O que não te mata te torna mais forte, colega.\"");
						System.out.println("Refletindo sobre isso, você aumentou seu nível de experiência.");
						vitoria = true;
						break;
					case 2:
						System.out.println("Você decidiu seguir o seu caminho e permanecer sem o conhecimento do sábio.");
						break;
				}
				break;
				
			default: System.out.println("Opção não encontrada.");;
			
		}
		input.close();
		if(vitoria) {
			System.out.println("Você passou de fase, parabéns! ");
		}
		else {
			System.out.println("Que pena, você perdeu a fase. Se quiser, tente novamente.");
		}
		
	}

}
