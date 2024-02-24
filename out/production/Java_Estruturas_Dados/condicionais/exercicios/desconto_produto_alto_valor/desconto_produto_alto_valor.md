# Exercício do Desconto Baseado no Valor do Produto

Crie um programa que recebe um valor do teclado para um valor de produto, caso o valor do produto esteja entre uma dessas faixas, vai executar certos descontos:

* Desconto de 2% se valorProduto está entre 200 e 400 (maior do que 200 e menor do que 400)  
* Desconto de 5% se valorProduto está entre 399 e 900 (maior do que 399 e menor do que 900)  
* Desconto de 8% se valorProduto está entre 899 e 1200 (maior do que 899 e menor do que 1200)
* Desconto de 12% se valorProduto está acima de 1199

Ao final exibe o valor inicial do produto, o desconto aplicado e o valor final

## O que fazer?

O problema principal aqui é verificar se o valor produto é maior do que os limites definidos. Se for, vai aplicar um desconto. Senão, mantém o valor

## Como fazer?

* Primeiro dar entrada no valor do Produto                      

* Declarar variáveis das condições:                             
                                                              
* ValorEntre199e400: valorProduto > 200 && valorProduto < 400;  

* ValorEntre399e800: valorProduto > 399 && valorProduto < 900;  

* ValorEntre899e1200: valorProduto > 899 && valorProduto < 1200;
* ValorAcima1199: valorProduto > 1199;                          

* Verificar se o valor se encontra nas faixas definidas


```
	if(ValorEntre199e400){           
		desconto = 2/100;
}                                
	else if(ValorEntre399e800){     
		desconto = 5/100              
}                                
	else if(ValorEntre899e1200){    
		desconto = 8/100              
}                                
	else if(ValorAcima1199){        
		desconto = 12/100             
}                                
	else{                           
		exibe sem desconto
}                                

valorFinal = valorProduto * (1-desconto);
```

* Exibe ao final o valor inicial, o desconto e o valor final.

## O que aprendi? 

Este foi um exercício para exercitar as condicionais em que eu pude melhorar o nome das variáveis de valor lógico das condicionais, colocando nomes mais condizentes e objetivos, como valorEntre199e400. Também pude entender que, colocando valores constantes nas variáveis do tipo double, é necessário colocar depois do valor um ., .0 ou .00, o que ocorreu no desconto.