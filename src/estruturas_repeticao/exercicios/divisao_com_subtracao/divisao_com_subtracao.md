# Exercício da Divisão Somente Com Subtração

Crie um programa de computador em Java que realiza uma divisão inteira entre dois números somente com a subtração. Ao final, deverá ser exibido o quociente e o resto.

## O que fazer?

Identificar como fazer divisão inteira com subtração primeiro, sem considerar o resto - escolha números fáceis, por exemplo: 20 / 5 e 15 / 3. Depois identifica como mostrar esse resto. Ao final, exiba o quociente e o resto. Solucione o problema por partes.

Mas e se o usuário digitar o segundo número como sendo zero, não existindo divisão por zero, o que irá acontecer? E também, se o usuário digitar o primeiro número maior do que o segundo?

## Dividindo o problema

### Como fazer a divisão inteira com subtração sem considerar o resto por enquanto?

Toma dois números: 20 e 4.

Se eu fosse dividir normalmente, como faria?

20 | 4 
-- | ---

4 multiplicado por quanto que dá 20?
4 \* 5 = 20

20 | 4 
-- | ---
 0   5
 
Como cheguei a esse resultado? *Somei* quatro até chegar a 20.
Porém eu não quero somando, quero subtraindo. Logo, faz o teste subtraindo.

Contador = 0

20 / 4 =

20 - 4 = 16 \ Contador = 1;

16 - 4 = 12 \ Contador = 2;

12 - 4 = 8 \ Contador = 3;

8 - 4 = 4 \ Contador = 4;

4 - 4 = 0 \ Contador = 5;

Dessa forma, subtraindo até ser menor ou igual a zero, obtém-se o resultado esperado.

Problema: dividir somente com subtração desconsiderando resto

Solução: subtrair do dividendo o divisor até chegar menor ou igual a zero

### Como dividir e mostrar o resto?

Toma dois números: 13 e 3

Como faríamos normalmente?

13 | 3
--- ---

Qual o número que multiplicado por 3 gera 13 ou próximo de 13?
3 \* 4 = 12;

Quanto falta para 13? 1. Logo:

13 | 3
--- ---
 1  4
 
Posso fazer subtraindo:
Contador = 0;
13 / 3 =

13 - 3 = 10 \ Contador = 1;
10 - 3 = 7 \ Contador = 2;
7 - 3 = 4 \ Contador = 3;
4 - 3 = 1 \ Contador = 4;
1 - 3 = -2 \ Contador = 4; Para estrutura

Vai subtraindo até chegar negativo. O anterior ao negativo é o resto.

### Como evitar divisão por zero?

Se o segundo número for zero, então não pode executar a operação do while.

### Como admitir números negativos?

Três possibilidades: divisor negativo, dividendo negativo ou os dois negativos.

Para os dois primeiros casos, o resultado final tem que ser negativo.

Para o último caso, o quociente tem que ser positivo.

Como vou executar isso no teste manual?

#### Divisor negativo sem resto

Toma um exemplo sem considerar o resto: 12 e -3.

12 | -3
--- ---

O resultado esperado é -4. De onde vem esse resultado?

Faz 12 / 3 = 4 e multiplica por -1.

ou

Faz assim:

Contador = 0;

12 + (-3) = 9 | Contador = -1

9 + (-3) = 6 | Contador = -2

6 + (-3) = 3 | Contador = -3

3 + (-3) = 0 | Contador = -4

Por questão de manter a divisão somente com *subtração* vou fazer as operações assim:

12 - (-3 \* -1) = 9
            
9 - (-3 \* -1) = 6
            
6 - (-3 \* -1) = 3
            
3 - (-3 \* -1) = 0

##### Divisor negativo com resto

Tome dois números de exemplo: 13 e -3;

Qual o resultado do resto para isso?

Primeiro, -3 multiplicado por quanto que dá próximo de 13? Multiplicado por -4 que dá 12. Qual é o resto para isso? 1

Logo, como podemos fazer isso? Faça o teste igual ao de cima.

Contador = 0;

13 - (-3 \* -1) = 10 | Contador = -1

10 - (-3 \* -1) = 7 | Contador = -2

7 - (-3 \* -1) = 4 | Contador = -3

4 - (-3 \* -1) = 1 (resto) | Contador = -4

1 - (-3 \* -1) = -2 | Contador = -4

O que é preciso ser feito então é a previsão também do próximo número, para ver se é negativo, pois se for, o resto é o número anterior a isto. 

#### Dividendo negativo

Toma dois números: -15 e 5

5 multiplicado por quanto que se resulta -15? 5 vezes 3 = 15, multiplicado por -1 dá -15. Ou 5 vezes -3 = -15.

Realiza os testes então:

Contador = 0

-15 - (5 * -1) = -10 | Contador = -1

-10 - (5 * -1) = -5 | Contador = -2

-5 - (5 * -1) = 0 | Contador = -3

Logo, para isso é necessário que vá aumentando até chegar a zero ou maior do que zero (positivo).

##### Dividendo negativo com resto

Toma dois números de exemplo: -14 e 4

4 multiplicado por quanto que gera próximo de -14? 4 vezes 3 equivale a 12, o resto fica dois para 14; como estou querendo um número negativo, faz 4 vezes -3 que dá -12, sobrando -2 para 14. 

Faz os testes:

Contador = 0

-14 - (4 * -1) = -10 | Contador = -1 

-10 - (4 * -1) = -6 | Contador = -2 

-6 - (4 * -1) = -2 | Contador = -3

-2 - (4 * -1) = 2 | Contador = -3

Quando se torna positivo, significa que o número anterior é seu resto.

  
## Como fazer?

* Dá entrada nos números inteiros que serão divididos
* Crie variáveis do tipo inteiro para resto e quociente

* Entra numa estrutura de repetição, criando com o while

### Divisão inteira sem resto

```
	...
	while(num1 > 0) {
		num1 -= num2;
		quociente++
	}
```

#### Divisão inteira com resto

```
	...
	while (num1 > 0){
		num1 -= num2;
		quociente ++
		if(num1 - num2 < 0){
			resto = num1;
			break;
		}
	}
```

### Se digitar zero no divisor

```
	...
	if(num2 != 0){
		while(num1 > 0) {
			num1 -= num2;
			quociente++;
			if(num1 - num2 < 0){
				resto = num1;
				break;
			}
		}
	}	
```

### Divisor negativo

Tem como fazer um exemplo de polimorfismo para esse caso.

```
	if(num2 < 0){
		while(num1 > 0){
			num1 -= num2 * -1;
			quociente--;
		
		}
	}
```