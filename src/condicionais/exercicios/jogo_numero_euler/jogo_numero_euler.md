# Exercício do Número de Euler Adivinhação

Crie um programa para exercitar condicionais utilizando switch case que pergunta os 5 primeiros digitos das casas decimais do famoso número de Euler. 
  
Resposta correta: 2.71828

## O que fazer?

Criar um programa que verifica um número digitado pelo usuário, se é a resposta correta do número de Euler. Caso o seja, exibe "você acertou, resposta correta 2,71828". Caso digite somente 2, vai exibir "faltam 5 casas decimais, dois é o número das unidades", caso 2.7, faltam 4 casas decimais, caso 2.71 (faltam 3 casas decimais), caso 2.718 (faltam 2 casas decimais), caso 2.7182 (falta 1 casa decimal), caso tenha errado, exibe "Você errou."
  
## Como fazer?
  
* Dar entrada no número de adivinhação do usuário 
* Criar switch case que testa entradas aproximadas e corretas do usuário:

```
switch (entrada){
        case 2:
        exibe("2 é o número da unidade, faltam 5 casas decimais.")
        ...
}
```

* Exibe em cada switch case se encontrou ou está aproximado
* Se estiver completamente longe, diz que está incorreto

## O que aprendi?

Neste exercício pôde-se exercitar as estruturas switch e principalmente utilizá-lo para prever entradas próximas do usuário ao número de adivinhação, no caso, o número de Euler 2,71828.