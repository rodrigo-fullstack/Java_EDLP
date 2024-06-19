# Exercício da Multiplicação feita somente com somas

Crie um algoritmo que realiza a multiplicação de um número recebendo do teclado o multiplicando e o multiplicador, ao final exibindo o resultado. Essa multiplicação, porém, deverá ser feita somente com somas, não podendo utilizar o operador "*".

## O que fazer?

Primeiro, será necessário criar as variáveis de entrada. Depois, criar uma estrutura while que interrompe quando o multiplicador chega a 1. Será necessário criar uma variável produto para armazenar o resultado final. Também é preciso que o multiplicador vá decrescendo até chegar a 1 na estrutura while. Ao final vai exibir o resultado.

## Testes

Dado dois números: 2, 5. Realize a multiplicação deles sem o sinal de multiplicar.

num1 = 2

num2 = 5

2 \* 5 =  2 + 2 + 2 + 2 + 2 = 10

Por partes:

2 + 2 = 4, retira 1 do num2. num2--
 
4 + 2 = 6, num2-- (3)

6 + 2 = 8, num2-- (2)

8 + 2 = 10, num2-- (1)

Quando chega a 1 é que chega no resultado.
Se for zero, resultado será 0.

## Programas feitos

Foram feitos 3 programas com soluções diferentes porém com mesmos resultados. 

No primeiro programa, o produto somente é inicializado verificando se os números digitados são iguais a zero, se sim, o produto final é zero, senão, o produto vai ser executado com a estrutura while começando pelo próprio multiplicando.
Se começa pelo próprio número o limite para a condição ser verdadeira é até 1, decrescendo o multiplicador.

No segundo programa, é possível perceber que foi bastante simplificado com a declaração do produto já inicializado com 0. Também a condição do while foi transposta para uma expressão nos parênteses. Multiplicador continua decrescendo, porém seu limite agora é até 0.
O produto agora é não começa com o produto no while, mas sim com 0, justificando porque o limite agora é 0.

Já no terceiro programa foi utilizado um contador que vai se somando para chegar até o multiplicador na estrutura while. 
Foi criada antes do while uma condição que será alterada dentro da estrutura, primeiro se verifica se o contador != do multiplicador, pois se o multiplicador for 0, nem entra no while, e se for 1, soma somente o próprio multiplicando a zero resultando no próprio número; verifica depois se o multiplicando é diferente de zero. Se ambos forem verdade, entra no código, se não, resulta como zero. A condição é alterada dentro do while para não mais verificar se multiplicando é igual a zero porque não há mais necessidade.

## O que aprendi?

Este é um exercício simples porém de extrema importância para exercer e praticar o pensamento computacional, ensinando-se a pensar como um computador pensaria, voltando à base para se aplicar uma operação matemática que é a multiplicação por meio das somas somente.
