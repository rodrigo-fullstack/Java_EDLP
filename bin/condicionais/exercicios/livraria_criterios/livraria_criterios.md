# Exercício Desconto Livraria

Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador pode escolher entre dois critérios de
desconto:

Critério A: R$ 0,25 por livro + R$ 7,50 fixo
Critério B: R$ 0,50 por livro + R$ 2,50 fixo

Faça um programa em que o usuário digite a quantidade de livros que deseja comprar e o programa diga qual é a melhor opção de desconto.

## O que fazer?

Será necessário criar uma variável dando entrada na quantidade de livros. Calcular depois disso o gasto para a quantidade de livros em ambos os critérios. Verificar se um critério é maior do que o outro e se é igual. 

## Como fazer?

* Dá entrada com a classe Scanner

* Cria variáveis para os critérios A e B

* CritérioA = 0.25 \* livros + 7.50

* CritérioB = 0.50 \* livros + 2.50

* Verifica se o critério A é melhor do que o critério B e se são iguais.

```
	if(criterioA < criterioB){
		exibe que criterioA é melhor que B para quantidade x de livros
	}
	else if(criterioA == criterioB){
		exibe que são iguais para quantidade de livros y
	}
	else{
		exibe que o critério B é melhor que o critério A para quantidade z de livros
	}
```

* Realize a devida saída para o usuário

## Teste de mesa

Se livros = 10   
                 
* CriterioA = 10   

* CriterioB = 7,50 
                 
Se livros = 20   
                 
* CriterioA = 12,50

* CriterioB = 12,50
                 
Se livros = 90   

* CriterioA = 30   

* CriterioB = 47,50

## O que aprendi?

Este exercício foi importante para realizar a comparação de duas funções do 1º grau e verificar quando que uma vale mais a pena do que a outra no contexto da livraria. No caso, foi observado que abaixo de 20 o critério B era mais vantajoso; com 20 livros, possuíam o mesmo valor; acima de 20 livros, o A se tornava mais viável.

.