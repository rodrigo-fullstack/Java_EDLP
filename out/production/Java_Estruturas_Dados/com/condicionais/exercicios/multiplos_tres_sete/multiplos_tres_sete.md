# Exercício do Número Múltiplo de 3 e 7

De acordo com um valor fornecido pelo usuário, verifique se esse valor é múltiplo de 3 e múltiplo de 7. Se não for, verifique se é multiplo de 3, se nem for múltiplo de 3, verifica se é múltiplo de 7, se os três não forem verdadeiros, exibe o devido resultado. Apresente uma mensagem mostrando o número digitado e o resultado do teste.

## O que fazer?

Dar entrada em um número digitado pelo usuário e verificar se o resto da divisão desse número por 3 e por 7 é 0, ou seja, se é divisível. Criar uma variável booleana para cada uma dessas condições. Se não for verdade, verifica se é somente por 3; se também não for, verifica se é por 7; se nada for verdadeiro, exibe que não é divisível nem por 3 ou por 7.

## Como fazer?

* Entrada número do teclado
* Criar variável booleana:

```
	boolean divPor3 = num % 3 == 0;
	boolean divPor7 = num % 7 == 0;
	boolean divPorAmbos = divPor3 && divPor7;
```

* Criar condição:

```
	If(divPorAmbos){
		exibe ("Divisivel por 3 e 7")
		exibe divPorAmbas
	}
	else if(divPor3){
		exibe ("Divisivel somente por 3")
		exibe divPor3
	}
	else if(divPor7){
		exibe ("Divisivel somente por 7")
		exibe divPor7
	}
	else {
		exibe("Divisível por nenhum dos números citados");
	}
```

* Variável resultado que é exibido ao final

## Teste de msa

Divisível por 3 e 7: 21, 42, 63, 84, 105, 210, 1050021

Divisível por 3: 3, 6, 9                              

Divisível por 7: 7, 14, 28,                           

Nenhum dos números: 2, 4, 8, 10, 22, 100, 2000        


## Anotação

* Código erro: entrada cannot be resolved to a variable

```
 		/*String definicaoTipoEntrada = JOptionPane.showInputDialog("Vai digitar número grande?" );
		boolean verificaNumGrande = definicaoTipoEntrada.equalsIgnoreCase("sim");
		if(verificaNumGrande) {
			Long entrada = Long.parseLong(
					JOptionPane.showInputDialog(
							"Digite um número para ser verificado"));
		}
		else {
			Integer entrada = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Digite um número para ser verificado"));
		} Não funciona, erro de "entrada cannot be resolved to a variable*/
```

* Defini o tipo dinamicamente baseado numa opção do usuário, porém se gera um erro. Isto foi feito no intuito de evitar desperdício de memória do programa e possibilitar números maiores com o tipo long

## O que aprendi?

Este exercício foi importante para entender as com.condicionais e a praticar os com.operadores junto com a entrada de dados por meio de JOptionPane. Fundamental para visualizar, por meio da prática, situações matemáticas em que se aplicam as com.condicionais.
