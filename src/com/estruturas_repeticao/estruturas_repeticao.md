# Estruturas de Repetição

Imagine que em seu algoritmo você necessite de exibir todos os números divisíveis por 3 de 0 até 50. Para realizar sem as estruturas de repetição, seria algo muito demorado e repetitivo, agora com essa ferramenta torna-se muito mais fácil de se executar.

As estruturas de repetição, também chamadas de laços de repetição ou loops, são estruturas na programação que permitem a repetição de comandos dada uma condição. 

Existem dois principais tipos: While e For, Do-while também existe porém ultimamente tem sido pouco utilizado. Nem todas as estruturas de repetição possuem uma contagem do número de vezes para ser repetido, por isso é necessário sempre, nesses casos, utilizar uma variável auxiliar, como contador ou acumulador.



## Laço While (Enquanto)

A Estrutura While realiza um teste condicional antes de realizar as instruções. Caso essa verificação seja verdadeira, como por exemplo contador<10, executa o bloco de instruções interno. 

Depois que realizar todas as instruções, vai dar uma volta e verificar novamente se a condição é verdade. Se sim, continua executando os códigos no bloco. Se não for verdade, então vai continuar o fluxo de execução. Dentro da estrutura While, necessita-se haver uma mudança periódica do valor que será verificado novamente no While, para que não se torne um loop infinito, tornando o programa inviável.

### Estrutura

```java
while(condicao){
	numero++
}
```

É interessante exercitar a estrutura While com jogos, vericação de números ou tipos para melhorar sua habilidade com essa ferramenta

## Loop Do-while (Faça-enquanto)

O do-while tem se tornado pouco utilizado nos tempos atuais. Basicamente, ele executa um conjunto de instruções antes de verificar uma condição e repetir essas ordens. Difere justamente nisso, o while é testado a condição primeiro depois são realizadas as instruções, já no do-while é o contrário.

Entretanto, no while, utilizando como parâmetro o true e o if como condição de parada, podemos fazer uma estrutura com resultado igual ao de uma do-while. Veja a estrutura do do-while a seguir:

### Estrutura

```
do{
	<conjuntoDeInstruções>
}
while(condicao)

```

## Loop For (Para)

Essa estrutura de repetição possui uma variável de controle que vai determinar o número de vezes que serão executadas as instruções. Essa variável de controle deverá primeiro ser inicializada no laço de repetição, deve ser definida uma condição para ela, e um incremento, um aumento a cada instrução.
Elas são muito úteis quando já se sabe o número de vezes que serão executadas as instruções.

### Estrutura:

```
	limite = 10
	for(int variavel = 0; variavel < limite; variavel++){
		<instruções>
	}
```

Aqui, realizou-se a inicialização da variável com int variavel = 0, a condição que define o limite sendo variavel < limite; e o incremento sendo variavel++ (poderia ser outros incrementos).

Vale ressaltar que na maior parte das vezes o padrão para essa variável de controle é "i", sendo visto na maior parte dos códigos.

## Blocos de Código

Tanto em estruturas de repetição, como em com.condicionais, é possível organizar os códigos em *blocos*. A forma mais simples de ambos são assim:

```
	if(x < 10)
		System.out.println("Menor do que 10");
		
	for(x = 0, x < 10, x++)
		System.out.println("X = " + x);
```

Nesse caso, sem as chaves ({ - }), a estrutura de repetição ou a condicional executará somente uma instrução, porém ao colocar as chaves é possível executar mais de uma instrução.

```
	if(x < 10) {
		System.out.println("Menor do que 10");
		x *= 2;
	}
	
	for(x = 0, x < 30, x++){
		System.out.println("X = " + x);
		if(x % 2 == 0)
			System.out.println("X atual é par")
		else
			System.out.println("X atual é ímpar")
	}
	
```

## Conclusão

Conclui-se portanto que a maior utilidade de uso está em utilizar o while e o for. O while para quando não se tem a quantidade de vezes que o comando será executado, sendo mais dinâmico e flexível a mudanças, já o for para número de instruções definidas, apesar de ter se mostrado nos exemplos práticos que o for também pode ser maleável.

Também se percebeu que é preciso se atentar às variáveis do tipo booleano que vão estar presentes como parâmetros das estruturas de repetição e com.condicionais. Para as com.condicionais, é melhor se utilizar as variáveis booleanas, porém no caso das estruturas de repetição, é mais cômodo utilizar as condições em expressões relacionais e lógicas caso não seja necessário mudar o valor da expressão (se sim, utilizar uma variável é a solução).
