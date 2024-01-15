# Exercício Forma de Pagamento Complexo

Considere a situação em que um cliente faz uma determinada compra em uma loja. Ao realizar o pagamento, são-lhe oferecidas as seguintes condições para pagamento: 

* Pagamento à vista – 15% de desconto sobre o valor total da compra.

* Pagamento com cheque pré-datado para 30 dias – 10% de desconto sobre o valor total da compra.

* Pagamento parcelado em 3 vezes – 5% de desconto sobre o valor total da compra.

* Pagamento parcelado em 6 vezes – não tem desconto.

* Pagamento parcelado em 12 vezes – 8% de acréscimo sobre o valor total da compra.

De acordo com o valor total da compra, verifique a opção de pagamento do cliente, calcule o valor final da compra e, se a escolha for por pagamento parcelado, calcule também o valor das parcelas.

Apresente ao usuário uma mensagem com o valor total da compra, o valor final da compra, a diferença entre os dois, identifique como desconto se a diferença for positiva, como juros se for negativa, mostre, também, a quantidade e o valor das parcelas.

## O que fazer?

Será necessário dar entrada no valor inicial da compra e na forma de pagamento do cliente. 
Criar switch case selecionando a forma de pagamento para uma das a seguir:

Se a forma de pagamento for **à vista**, desconto de 15%;

Se a forma de pagamento for **cheque pré-datado de 30 dias**, desconto de 10%

Se a forma de pagamento for **parcelado em 3 vezes**, desconto de 5%
 
Se a forma de pagamento for **parcelado em 6 vezes**, sem desconto

Se a forma de pagamento for **parcelado em 12 vezes**, acréscimo de 8%.

Exibir ao final o valor total da compra, o valor final, a diferença entre os dois e verifica se essa diferença é maior do que 0 - se sim, vai exibir que é desconto de x valor, se não exibirá que é juros de x valor.

Se for parcelado, exibe também o valor da parcela e quantidade de parcelas.

## Dividindo o problema

1. Passo: Dar entrada no valor da compra e forma de pagamento (como escolha)

2. Passo: Verificar forma de pagamento

Exemplo: valorCompra = R$1000,00

**Á vista: 15% desconto.**
valorFinal = 1000 \* (1-0.15) = 1000 \* 0.85 = 850

**Cheque pré-datado de 30 dias: 10% desconto.**
valorFinal = 1000 \* (1-0.1) = 1000 \* 0.9 = 900

**Parcelado em 3 vezes: 5% desconto**
valorFinal = 1000 \* (1-0.05) = 1000 \* 0.95 = 950
parcelas = 3
valorParcelas = 950/3 = 316,67 (aproximadamente)

ou

valorParcelas = 1000 / 3 \* (1 - 0.05)
valorParcelas = 333,34 \* 0,95 = 316,67 (aproximadamente)
valorFinal = 316,67 \* 3 = 950 (aproximadamente)
valorParcelasAlterado = 333,34 \* (1-0.05) = 333,34 \* 0.95 = 316,67

* Vou fazer pelo primeiro método por ser mais rápido

**Parcelado em 6 vezes: sem desconto**

valorFinal = 1000;
parcelas = 6;
valorParcelas = 1000/6 = 166,67 (aproximadamente)

**Parcela em 12 vezes: 8% acréscimo**

valorFinal = 1000 \* (1 + 0.08) = 1000 \* 1.08 = 1080
parcelas = 12
valorParcelas = 1080 / 12 = 90

* Terminado testes


## Como fazer?

* Dê entrada no valor da compra e na forma de pagamento (como escolha)

* Crie as variáveis parcelas, acrescimo, desconto e valor parcelas.

* Switch case com a forma de pagamento (inteiro) para cada um dos casos acima

* Modifica o valor final de acordo com a forma de pagamento escolhida

* Exibe ao final valor inicial e valor final, se houver parcelas, exibe também a quantidade de parcelas e o valor das parcelas

* Cria variável diferença que, caso seja > zero, vai exibir que houve desconto, se não, se diferenca == zero, não houve alteração no valor, se não, houve juros sobre o valor

* Esboço de código:

```
	switch (formaPagamento) {
		case 1: desconto = 15.00/100.00;
		
		case 2: desconto = 10.00/100;00;
		
		case 3: 
			desconto = 5.00/100.00;
			parcelas = 3
			
		case 4: 
			desconto = 0;
			parcelas = 6;
		
		case 5: 
			acrescimo = 8/100;
			parcelas = 12;
						
	}
	
	valorFinal = valorProduto * (1-desconto ou acréscimo (no caso está como percentual)
	if(diferenca > 0){
		exibe desconto
	}
	else if (diferenca == 0){
		exibe sem desconto;
	}
	else{
		exibe acréscimo
	}
	
```

## O que aprendi?

Um exercício mais complexo, que demanda maior análise e decisão de como será feito o programa para se evitar maiores quantidades de código e maior legibilidade do mesmo. Foi importante para exercitar as estruturas switch case, mas principalmente para a habilidade de solucionar problemas e identificar quais as melhores soluções para cada caso.