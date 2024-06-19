# Anotações sobre o Exercícios dos Gastos com a Amazon Prime

 
Você está planejando assinar o plano Amazon Prime e gostaria de saber quanto você gastará ao longo do tempo.
Crie um programa que recebe como entrada do usuário o tipo do plano Amazon Prime (mensal ou anual) e o tempo de anos utilizando o plano. Realize o cálculo, se necessário, para 1 ano e para os próximos n anos. Exiba ao final o preço que será pago em 1 ano para ambos planos, variando de acordo com o seu plano atual, a diferença nesse contexto e o preço que será pago nos próximos n anos para cada um dos planos junto com a diferença para o valor pago nesses anos.
 
## Como fazer? 
* Receba como entrada do usuário como String o tipo do plano Amazon Prime

* Receba como entrada também o tempo

* Criar variáveis valorPlanoAtual, valorPlanoOposto, valor1AnoAtual, valor1AnoOposto. 

* Crie as condições para determinar valor de pagamento. Se for mensal, valorPlano = 14,90; se for anual, valorPlano = 119,0.

* Armazene o valor do pagamento em uma variável chamada valorPlano que vai passar em um if:

* Nesse if também será feito o cálculo de 1 ano de pagamento para caso seja necessário.

``` 
	...
 	if(plano == mensal){
 		valorPlanoAtual = 14,90
 		valor1AnoAtual = valorPlano * 12;
 		valorPlanoOposto = 119,00;
 		valor1AnoOposto = valorPlanoOposto;
 		
 } 	else if(plano == anual){
 		valorPlanoAtual = 119,90
 		valor1AnoAtual = valorPlano;
 		valorPlanoOposto = 14,90;
 		valor1AnoOposto = 14,90 * 12
 }
 else{
 		Exibe("Erro na digitação") // Posso aprimorar com um while e com isso criar uma estrutura de tratamento de exceções
 }
 ```
 
* Verificar diferença entre os dois anos primários.
 
* Calcular para n anos

* valorAnosVarPlanoAtual = valor1AnoAtual tempoAnos;

* valorAnosVarPlanoOposto = valor1AnoAtual tempoAnos;
 
* Verificar diferença entre os dois planos com anos variáveis
 
## Teste de mesa
 
Cálculos:

Mensal = 14,90

1 ano em mensal = 14,90 12, logo tem-se 178,80
diferença1Ano = 178,80 - 119 = 59,80

Se tempo anos = 5

valorAnosVarPlanoAtual = 178,8 \* 5 = 894 

valorAnosVarPlanoOposto = 119 \* 5 = 595

diferançaAnosVar = 894 - 595 = 299

## O que aprendi?

Neste exercício, foi importante para perceber os diferentes contextos que a programação está sendo utilizada, no caso, aqui com um exemplo de programação e planejamento de finanças. Também foi interessante para exercitar a lógica condicional utilizando-se do if para verificar qual plano é melhor ao longo do tempo. 