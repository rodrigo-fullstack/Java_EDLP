# Exercício do Cálculo da Altura das Crianças 

Pedro tem 1,50 metro e cresce 2 centímetros por ano, e Lucas tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que:
a) Lucas e Pedro tenham o mesmo tamanho;
b) Lucas seja maior que Pedro.

## O que fazer?

Utilizar a fórmula para cada um dos garotos. Ano começa em zero e vai aumentando de um em um.

Pedro = 1,50 metro + 0.02m * ano

Lucas = 1,10 metro + 0,03m * ano

Condição do while será enquanto Lucas < Pedro. Se nesse processo Lucas e Pedro tiverem mesma altura, exibe que possuem a mesma altura.

## Como fazer?

* Declaração da altura inicial de Pedro e Lucas

Pedro = 1,50 m

Lucas = 1,10 m

* Ano começa em zero
* Estrutura While: 

```
	anos = 0
	while(lucasFormula <= pedroFormula){
		pedroFormula = 1,50 +  0,02 * ano
		lucasFormula = 1,10 +  0,03 * ano
		
		if(lucasFormula == pedroFormula){
			exibe que ambos possuem mesma altura
		}
		
	}
	exibe que lucas ultrapassou pedro
```

## Teste de mesa

Pedro cresce 2 cm por ano; já Lucas cresce 3 cm por ano. Suas alturas vão se equivaler quando anos == 40.
Lucas vai ser mais alto do que Pedro quando anos = 41:

L(41) = 1,10 + 0,03 * 41 = 1,1 + 1,23 = 2,33
P(41) = 1,50 + 0,02 * 41 = 1,5 + 0,82 = 2,32

## Anotação

* Analisando condição do while e incremento. 

Quando a condição é lucasAltura < pedroAltura, se a altura dos dois for igual, vai parar a estrutura. Se o incremento estiver no começo, vai somar mais um nos anos e depois vai calcular a altura, o que se recomenda colocar o valor inicial da altura antes da estrutura de repetição ou com uma condicional. Os anos serão exibidos como 40 anos corretamente, porém ira exibir que foi ultrapassado em 40 anos, o que não é verdade. Isto ocorre porque se verifica que a altura de Lucas não é menor do que a de Pedro, mas sim igual, o que leva a não entrar na estrutura de repetição.

```
	anos = 0
	while(lucas < pedro){
		anos++;
		pedro = 1.50 + 0.02 * anos
		lucas = 1.10 + 0.03 * anos
	}

```

Se o incremento, entretanto, estiver no final, primeiro vai calcular a altura com o ano anterior e ao final vai somar mais um nos anos. Nesse caso, não precisa se preocupar com a altura inicial dos garotos. No final, quando anos == 40, irá exibir que as idades foram igualadas e somará mais um nos anos. Porém como a altura de Lucas não é menor do que a altura de Pedro,  porém igual, ele vai exibir que "ultrapassou" com anos == 41, mas com altura == 2,30, sendo uma saída falsa.

```
	anos = 0
	while(lucas < pedro){
		pedro = 1.50 + 0.02 * anos
		lucas = 1.10 + 0.03 * anos
		anos++;
	}

```

Agora se a condição for alterada: lucasAltura <= pedroAltura, será diferente. Caso o incremento esteja no começo, sempre começará com 1, por isso é aconselhável exibir a altura dos dois antes de iniciar a estrutura.

Toda vez que ele verificar a altura dos dois, ele vai realizar esse incremento, depois calcula baseado nesse ano somado. Quando chega em anos == 40, realizará o cálculo e encontrará o valor equivalente para ambas alturas, o que fará com que passe no "if", resultando na saída de equivalência. Realiza a verificação se lucasAltura <= pedroAltura, a qual é verdadeira, vai somar mais um nos anos (41) e realizará o cálculo. 
Esse cálculo vai revelar que em anos 41 a altura de Lucas se tornará maior do que a de Pedro, ou seja, Lucas não possui altura menor ou igual à de Pedro, saindo da estrutura while e exibindo corretamente a saída.

Todavia, se for colocado o incremento no final, gerará um resultado errÕneo na saída. Isto porque ele vai sempre somar aos anos depois de fazer os cálculos, de forma que em dado momento, o cálculo será para o ano anterior, que já atende à condição de saída, porém o ano exibido será o próximo. Nesse caso é exibido que Lucas ultrapassou Pedro nos anos 42 com altura == 2,33.

## O que aprendi? 
Este foi um exercício importante para compreender o fluxo de execução de instruções com as estruturas de repetição, o que me auxiliou a entender as diferentes formas que um algoritmo pode ter saídas errôneas, porém não apresentar erros sintáticos da linguagem.
 

