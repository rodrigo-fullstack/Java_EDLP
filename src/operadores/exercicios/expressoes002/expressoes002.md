# Exercício de Expressões Complexas

Crie um programa que realiza várias expressões complexas, antes recebendo do teclado três valores, exibindo seus devidos resultados com printf. Essas expressões devem envolver a maior parte dos operadores descritos nos documentos. Crie ao final 3 variáveis que se baseiam em condições simples (ternárias) desses valores. A seguir estão as expressões e as condições para o operador ternário:

Expressão 001 = (n1 + n2) \* (n3² + 2)

Expressão 002 = (n1 \* n2) == n3 & n3 - n2 < n1

Expressão 003 = n1 / (raizQuadrada(n2) - n3) > n2/n1-18 && (n1 \* (n2 + n3) < n3 % n2 + 12 || n1² - n2/2 == n3/4)

Ternário 001: Se n1 + n2 == n3 ? tern = media dos três : senão tern = subtração dos três

Ternário 002: Se n1 - n2 < n3/2 ? tern = 2^(n1^2) : senão tern = raizQuadrada(n2)

Ternário 003: Se n1 > n2/4 && n3/3 != n1 + n2 ? tern = 2\*n1 : n1/3

## O que fazer?

* Dê entrada com a classe Scanner nos 3 números
* Criar variáveis para as expressões. Na terceira, cria variáveis auxiliares para representar os resultados das subexpressões no intuito de simplificar a expressão e torná-la mais limpa
* Criar variáveis para as condições ternárias
* Exibe após o cálculo de cada uma o seu devido resultado. 

## Teste de mesa
 * Entrada = 
 
 01
 
 * 1, 2, 3
 
 02
 
 * 3, 5, 7
 
 * Expressões
 * 001 = (n1 + n2) \* (n3² + 2)
 
 * Processando:
 * = (1 + 2) \* (3² + 2) 
 * = 3 \* (9 + 2)
 * = 3 \* 11 = 33
 
 * 002 = (n1 \* n2) == n3 & n3 - n2 < n1
 
 * Processando:
 * = (3 \* 5) == 7 & 7-5 < 3
 * = resultado final: false
 * 
 * 003 = n1 / (raizQuadrada(n2) - n3) > n2/n1-18 && (n1 \* (n2 + n3) < n3 % n2 + 12 || n1² - n2/2 == n3/4)
 
 * Processando:
 * 1. 
 * 1 / (1.41 - 3) > 2/1 - 18
 * 1 / (-1.59) > -16
 * -0.62 > -16
 * R: true
 
 * 2.
 * 1 \* (2 + 3) < 3 % 2 + 12
 * 1 \* 5 < 1 + 12
 * 5 < 13
 * R: true
 
 * 3.
 * 1² - 2/2 == 3/4
 * 1 - 1 == 0.75
 * 0 == 0.75 
 * R: true
 
 * Resolvendo lógica: 
 * true && (true || false)
 * true && (true)
 * R: true
 
 * Condições
 
 * 001: Se n1 + n2 == n3 ? tern = media dos três : senão tern = subtração dos três
 * 002: Se n1 - n2 < n3/2 ? tern = 2^(n1^2) : senão tern = raizQuadrada(n2)
 * 003: Se n1 > n2/4 && n3/3 != n1 + n2 ? tern = 2\*n1 : n1/3

## O que aprendi?

Nesse exercício eu misturei a maior parte dos operadores vistos na pasta conteudos, sendo eles aritméticos, lógicos, ternário, relacionais e outros. Foi importante para eu praticar e entender como os operadores funcionam, como também para se habituar com expressões maiores e mais complexas em Java.