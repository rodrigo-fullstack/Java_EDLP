# Exercício da Compra de um Produto

Você foi contratado para desenvolver um programa que auxilie um vendedor a calcular o valor final de uma venda com base no valor do produto e na forma de pagamento. O programa deve solicitar o valor do produto e a forma de pagamento, e em seguida calcular e exibir o valor final com descontos, se aplicáveis.

**Escreva um programa em Java que solicite o valor do produto e a forma de pagamento (por exemplo, "à vista" ou "parcelado").**

Utilize condicionais para calcular o valor final da venda de acordo com as seguintes regras:

Se a forma de pagamento for "à vista", aplicar um desconto de 10% sobre o valor do produto.

Se a forma de pagamento for "parcelado", não aplicar desconto.

Imprima o valor final da venda com ou sem desconto, de acordo com a forma de pagamento inserida.

## O que fazer?

* Dar entrada no valor do produto

* Dar entrada na forma de pgto

* Verificar se é admissível de desconto: se forma de pgto = à vista, então vai aplicar desconto de 10%; se não, mantém o valor inicial

```java
	...
	descontoAdmissivel = formaDePgto == "à vista";
	if(descontoAdmissivel){
		valorFinal = valorProduto * 0.9;
	}
	exibe("Valor Final = " + valorFinal)
```

* Exiba ao final o valor do produto inical, o seu valor final, a forma de pagamento e o desconto de x%.

## Anotação

Para realizar a comparação entre Strings, utiliza-se o método **equals("String")** e **equalsIgnoreCase("String")**, criado pelo objeto de nome x (definido pelo programador).

## O que aprendi?

Este exercício foi importante para entender o fluxo de execução dos programas com as condicionais, em que se executam passos somente se uma condição for verdadeira. Se não for especificado o senão, depois do if são executadas instruções independente da condição ser verdadeira ou não. Ou seja, foi fundamental para entender como isso acontece por meio da exibição do valor final mesmo se não for admitido desconto.