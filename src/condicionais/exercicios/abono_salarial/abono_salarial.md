# Exercício do Abono Salarial da Empresa XSoftware

A empresa XSoftwares Ltda. concedeu um bônus de 20 por cento do valor do salário a todos os funcionários com tempo de trabalho na empresa igual ou superior a cinco anos e de 10 por cento aos demais. Calcular e exibir o valor do bônus.

## O que fazer?

Será dado um bônus de 20% para o salário do funcionário que ficou na empresa com tempo igual ou superior a 5 anos. Isto pode ser feito dando entrada no salário e nos anos trabalhados pelo funcionário por meio do teclado. Os que não trabalharam acima de 5 anos, receberão bônus de 10%.

Ou seja, se anosTrabalhados >= 5 anos, recebe bônus de 20%, senão, recebe bônus de 10%. Portanto, será necessário calcular o percentual do bônus sobre o salário.
Um exemplo: se o funcionário recebe 5000 e está há mais de 10 anos na empresa, o resultado do seu abono tem que ser:

5000 \* 20/100

Já se ele recebe 5000 porém há menos de 10 anos, então seu abono será:

5000 \* 10/100

Exibe ao final o bônus sobre o salário, não o salário com bônus.

## Como fazer?

* Dê entrada no salário do funcionário e em seus anos trabalhados
* Criar condição sobre se é maior do que 5 anos o tempo de trabalho.
* Se for verdadeira, vai exibir na tela "Você recebeu um abono de 20% por ser veterano" e vai calcular o bônus do salário
* Senão, vai exibir na tela "Você recebeu um abono de 10%" e vai calcular o bônus

```java
salario = 5000
if(maiorQue5AnosTrabalho){
	percentualAbono = 20./100.
}
else{
	percentualAbono = 10./100.
}
abono = salario * percentualAbono
exibe abono
```

* Vale a pena fazer o cálculo dentro do se ou fora do se?
* Vale fazer fora do se como uma fórmula geral.

### O que aprendi?

Esse exercício foi importante para exercitar a programação em um contexto empresarial, percebendo-se a importância para lidar com grande quantidade de dados. Caso um ser humano fosse realizar a tarefa de calcular o abono sobre os salários de cada funcionário, seria uma tarefa muito demorada e repetitiva, porém com os programas isso se torna muito mais rápido. Essa prática pode ser melhorada utilizando-se estruturas de repetição e vetores no futuro.
