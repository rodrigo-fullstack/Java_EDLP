# Exercício da Média Dinâmica

Crie um programa que recebe do usuário uma quantidade de números inteiros indefinidos até ele apertar -1 e realiza a média desses números. Se o usuário apertar -1 e der enter, o fluxo de digitação de números deve ser encerrado. Ao final, deve ser exibido a quantidade de números digitados, a soma de todos os números e a média desses números.

## O que fazer?

Será necessário dar entrada dentro de uma estrutura de repetição. A condição de parada dessa estrutura será se o usuário digitar -1, ou seja, se o número digitado for igual a -1. Será necessário criar uma variável somatorio que vai se somando toda vez que aparece um número novo e uma variável quantidade que se soma em um toda vez que é digitado um novo número. Quando for digitado -1, deverá ser exibido a quantidade de números digitados, a soma desses números e a média dos mesmos.

## Como fazer?

* Primeiro, iniciar as variáveis que estarão dentro do while
* Criar estrutura while true que interrompe quando o número digitado for -1

* Esboço:

```
numDigitado = 0;
soma = 0;
quantidade = 0;

boolean condicaoParada = true;
while(true){
	numDigitado = input.nextInt();
	
	condicaoParada = numDigitado==-1;
	if(condicaoParada) break;
	
	soma += numDigitado;
	quantidade++;
	
}
```

* Criar estrutura *do-while* que somente realiza a soma e aumenta a quantidade se número digitado for diferente de -1.

* **Explicação Soma:**

* O que ocorre com a soma é o seguinte: a soma começa com zero; quando o usuário digita um número, a soma vai se somar a esse número (se ele digita 5 e a soma era 0, fica 5); se ele digitar outro número, vai somar o resultado anterior com o número (digamos 7, totalizando 12). Isto se faz até que o número digitado seja -1.

* Quantidade vai sendo somado +1 toda vez que se digita um novo número

* Media = soma/quantidade

* Exibir quantidade, soma e média.

## Teste de mesa

                                            
Se for digitado                             
                                            
5, 4, 3, 9, 12;                             

soma = 33;                                  

quantidade = 5;                             

média = 33/5 = 6,6.                         

========================
                                            
Se for digitado:                            
                                            
100, 232, 705, 904                          
                                            
soma = 332 + 705 + 904 = 1037 + 904 = 1941; 
quantidade = 4;                             
media = 1941/4 = 485,25;                    

## O que aprendi?

Pôde-se compreender como utilizar as estruturas de repetição para criar programas dinâmicas com fim determinado pelo usuário, realizar acumuladores (exemplo variável somatorio e quantidade) nessas estruturas e foi fundamental para exercitar o pensamento computacional.