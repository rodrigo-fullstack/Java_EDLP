# Exercício para Exibir os 3 maiores números digitados pelo usuário

Crie um programa que receberá do teclado do usuário números inteiros. O usuário ainda deve definir a quantidade de números que ele irá digitar. Ao final, se digitou acima de 3 números, deve exibir os 3 maiores números. Se digitou somente 1, exibe o próprio número, se digitou 2, exibe esses dois números, se digitou 3, os 3 números digitados. Devem ser exibidos em ordem decrescente, do maior para o menor.

## O que fazer?

Primeiro, tem que ser dado a entrada da quantidade de números do usuário. Os exemplos que eu vou fazer serão inicialmente com 4 números, sendo que 3 serão os maiores. Como verifico que um é maior do que outro na ordem que digitei? E como posso organizá-los em 3 números maiores? Resolva primeiro o mais fácil e vá por partes. Qual problema tem que ser resolvido primeiro?

Sei que a entrada do número deverá estar dentro do while, e a condição de parada do While será se a quantidade atual é igual ao limite definido.

## Dividindo o problema

### Verificando o maior número
Para verificar o maior número ele tem que ser maior do que todos os anteriores. Se eu digito por exemplo 2, 3, 2, 9, 11. O número maior, nessa ordem, foi 
1º: 2
2º: 3
3º: 9
4º: 11

O que ocorreu foi o seguinte: 
* O número maior começa com zero. 
* Verificou se o 1º número (2) era maior do que o "maior número" (0), 
* Isso é verdade, entao maior = 2
* Foi digitado outro número: 3. 
* Verificou se 3 é maior do que o maior número. 
* Sim, é maior, então o maior número é 3. 
* O 3º número foi 2. 
* 2 é menor do que o maior número, logo não se alterou o valor do maior

Então eu imagino o seguinte. Preciso ter uma condição dentro do while que verifica se o maior número é menor do que o número digitado ou se o número digitado é maior do que o maior número.
Isto é para um número, para ir modificando de acordo com os 3 maiores ocorre de forma diferente.

* Passo concluído

### Verificando o segundo maior número

Ora, para verificar o maior01, verificamos se o número atual é maior do que o maior número. Se não for maior, verifica se é maior do que o segundo número que começa com zero.

Voltando para aquele exemplo:
2, 3, 2, 9, 11
 
* Digita-se 2 e o maior01 recebe 2, o segundo maior se mantém em zero. 
* Digita-se 3, 3 é maior do que o maior01, o valor anterior do maior01 precisa passar a ser o segundo maior. 
* Nessa ordem, 3 é o maior01 e 2 é o segundo maior.
* Digitou-se 2, verifica se é maior do que o maior01 (falso), verifica se é maior do que o segundo número (falso), continua
* Digitou-se 9, é maior do que 3, então maior01 recebe 9 e o segundo maior, antes disso, recebe o valor antigo do maior01
* Digitou-se 11, é maior do que 9, então maior01 se torna 11 e o segundo maior recebe, antes, o valor antigo do primeiro.
Qual a verificação que precisa ser feita para que o valor anterior do maior01 se torne o valor do segundo maior? 
* Eu sei que precisa estar no próprio bloco de instrução. 
* Se a quantidade for igual a 1, não vai precisar fazer essa mudança, o segundo maior continua como zero. 
* Se for a quantidade 2, então o segundo maior vai ter que receber o valor anterior do maior01, se for 3, vai ter que fazer a mesma coisa caso passe pela condição de que o número digitado é maior do que o maior01
* Logo a condição é quantidade > 1 para poder fazer a troca dos valores.
* Agora, se não for maior do que o maior01, pode estar entre o segundo maior atual e o maior01 (por exemplo, o usuário digita 13 sabendo que o segundo maior é 11 e o maior01 é 15)
* Se não for maior do que o maior01, verifica se é maior do que o segundo maior, 
* Se sim, o segundo maior recebe o número digitado

Logo, quando o número digtado é maior do que o maior01, verifica outro if perguntando se a quantidade é > 1, para haver a troca dos números. Se o número digitado não for maior do que o primeiro mas for maior do que o segundo, então o segundo número vai receber esse número.

* Passo concluído

### Verificando o terceiro maior

Basicamente, se não for maior do que o maior 01, nem do maior 02, então vai se perguntar se é maior do que o maior03, se for ele vai receber, se não, ele não vai receber.
Ainda será necessário a troca do maior03 com o maior02 antigo,

Criando um exemplo 
6, 4, 3, 11, 9, 12, 30, 16, 1, 14

* Digita-se 6, o maior01 é 6
* Digita-se 4, o segundo maior é 4 verificando-se primeiro se era maior do que o primeiro, por ser o segundo maior inicialmente igual a 0, recebe o 4.
* Digita-se 4, o terceiro maior tem que receber verificando-se primeiro se esse número é maior do que o segundo maior (já passou pelo maior01)
* Digita-se 11, é maior do que o maior01. O maior01 recebe 11, já que a quantidade é > 1, vai acontecer o seguinte

A troca dos valores antigos. O antigo maior02 vai para o maior03, o antigo maior01 passa para maior02 e o maior01 recebe o número digitado, mas isso somente pode acontecer quando a quantidade é maior do que 2

* Digita-se 9, não é maior do que o maior01, porém é maior do que o maior02. O maior03 vai ter que receber o maior02 e o maior02 recebe o novo número, o maior01 permanece inalterado. Agora, qual a verificação para poder realizar a troca do maior03 com o maior02? Não precisa, porque para passar nessa condição já precisa de uma boa quantidade de números, de no mínimo 3, não sendo necessário fazer essa verificação.

Portanto, na condicional maior01, é preciso colocar mais um if para se houver 3 números ou mais, pois sedeve-se colocar na condicional do maior02 para o maior03 receber o maior02 antigo e o maior02 receber o novo número.



## Como fazer?

* Dar entrada no limite
* Inicializar as variáveis quantidade, numDigitado, maior01, maior02 e maior03
* Criar while, condição para entrar no while é a quantidade ser menor do que o limite.

* Fazendo para um único, basta verificar se o número digitado é maior do que o maior número

* Código esboço: 

```
	//todas variáveis declaradas acima
	while(quantidade < limite){
		numDigitado = recebeEntrada;
		quantidade++
		if(numDigitado > maior01) maior01 = numDigitado;
					
	}
```

* Fazendo para dois maiores números, verifica dentro do if do maior01 se a quantidade é > 1, se isso for verdade, o segundo maior recebe o maior01 antigo, fazendo a troca dos valores. Se não alterar o valor do maior01, pode alterar o valor do segundo maior se o número digitado for maior do que o segundo maior.
* Será necessário utilizar else if
Código esboço: 

```
	//todas variáveis declaradas acima
	while(quantidade < limite){
		numDigitado = recebeEntrada;
		quantidade++
		if(numDigitado > maior01) {
			if(quantidade>1){
				maior02 = maior01;
			}
			maior01 = numDigitado;
		}
		else if(numDitigado > maior02) {
			maior02 = numDigitado;
		}
		
		
					
	}
```
* Agora, para o 3º número, adicionar else if para representar o 3º maior, adicionar também sua mudança no if do 1º número e do 2º número

* Código Esboço:

```
	...
	while(quantidade<limite){
		numDigitado = entrada;
		quantidade++;
		if(numDigitado > maior01){
			if(quantidade>1){
				maior03 = maior02;
				maior02 = maior01
			}
			maior01 = numDigitado;
			
		}
		else if(numDigitado>maior02){
			maior03 = maior02
			maior02 = numDigitado;
		}
		else if(numDigitado > maior03){
			maior03 = numDigitado;
		}
		
		else{
			...print("Menor do que os 3 maiores")
		}
		
	}
```

* Não querendo que os números sejam iguais entre si, basta alterar a condição dos ifs

```
	while(quantidade < limite){
		...
		if(numDigitado > maior01){
			...
		}
		else if(numDigitado > maior02 && numDigitado != maior01){
			...
		}
		else if(numDigitado > maior03 && numDigitado != maior02 && numDigitado != maior01){
			...
		}
	}
```

## Teste de mesa                      
                                   
### Verificando o primeiro maior:      

Limite = 5                         
                                   
Números digitados :                

2, 3, 2, 9, 11                     
                                   
maior01 nessa ordem:
 2, 3, 3, 9, 11
                                   
### Verificando o segundo maior        
                                   
2, 3, 2, 9, 11                     
                                   
maior01: 2, 3, 3, 9, 11            
maior02: 0, 2, 2, 3, 9             
                                   
Outra entrada:                     

Limite = 6                         
4, 2, 9, 12, 11, 20                
                                   
maior01 nessa ordem:               
4, 4, 9, 12, 12, 20                
                                   
maior02 nessa ordem:               
0, 2, 4, 9, 11, 12                 
                                   
### Verificando o Terceiro Maior:      

Limite = 6                         
4, 2, 9, 12, 11, 20                
                                   
maior01: 4, 4, 9, 12, 12, 20                
                                   
maior02: 0, 2, 4, 9, 11, 12                 
                                   
maior03: 0, 0, 2, 4, 9, 11                  

## O que aprendi?

Este foi um exercício importantíssimo para fortificar as bases da lógica de programação e do pensamento computacional, auxiliando na resolução de problemas diversos. Apesar de parecer fácil e simples como está escrito, é preciso antes pensar e refletir bastante sobre como deve ser feito o programa e quais ações devem ser tomadas.