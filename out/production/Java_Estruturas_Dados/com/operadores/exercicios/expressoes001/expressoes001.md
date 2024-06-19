# Exercício Expressões Aritméticas

Crie um programa que recebe três variáveis com valores, sendo os 2 primeiros int e o último double, realizando as seguintes expressões:

a-) A² + B*C - C
b-) (2B - (A + 3C))/A
c-) B - C/2 + 4A
d-) (3A + (2B - C * (sqrt(B)-1))/2)

## O que fazer?


* Declare as variáveis e dê entrada
* Organize as expressões em variáveis
* Já que existe um double na operação, é mais aconselhável que a variável da expressão seja double também
* Exibir valor de cada expressão ao final
 
## Teste de mesa

 *  Entrada: A = 1; B = 2; C = 3;
 
 *  Operações: 
 
a-) 1² + 2*3 - 3 = 1 + 6 - 3 = 4
 
============
 
b-) (2*2 - (1 + 3*3))/1 = (4 - (1+9))/1 = 4-10 = -6

============
 
c-) 2 - 3/2 + 4*1 = 2 - 1.5 + 4 = 4.5

============

d-) (3*1 + (2*2 - 3 * (sqrt(2)-1))/2) 
 
= (3 + (4 - 3 * (1.4 - 1))/2) 

= (3 + (4 - 3 * 0.4)/2) 

= (3 + (4 - 1.2)/2) 

= (3 + 2.8/2)

= 3  + 1.4 

= (aproximadamente) 4.4

*  Saída: 4, -6, 4.5, 4.4

## O que aprendi?

Este foi um exercício em que eu pude entender sobre a ordem de precedência dos com.operadores aritméticos, sobre os parênteses, ordem da multiplicação, divisão, resto, soma e subtração. Também aprendi alguns métodos da classe Math, como Math.pow(num, expoente), que eleva um número a um determinado expoente, e Math.sqrt(num), o qual calcula a raiz quadrada