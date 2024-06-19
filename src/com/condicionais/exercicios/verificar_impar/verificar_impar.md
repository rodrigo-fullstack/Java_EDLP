# Exercício para Verificar se um Número é Ímpar ou Par

Verifique se um número fornecido pelo usuário é par ou ímpar, exibindo ao final "O número é " + sua característica (par ou ímpar).

## O que fazer?

O exercício está pedindo para que eu verifique se um número é par ou ímpar. A variável do número terá que ser inteiro. Como eu posso verificar se é par ou ímpar? Todo número par é divisível por 2, já todo número ímpar não é. Como posso verificar se um número é divisível por outro? Utilize o operador mod ou "%", o operador de resto, se o resto for 0, então é divisível, se não, não é
Logo, se o número informado não for divisível por 2, é um número ímpar. Se não, é um número par. Exibe ao final justamente sua característica.

## Como fazer?

* Dar entrada no número
* Verificar se é par ou ímpar

```
num = entrada
resto = num%2
numNaoÉDivisivelPor0 = resto != 0
if(numNaoÉDivisivelPor0){
	exibe Impar
}
else{
	exibe Par
}
```

* Exibe o resultado

## O que aprendi?

Pude praticar mais a classe JOptionPane e entender aplicado ao conceito de com.condicionais como utilizar e verificar características de um número, nesse caso, se ele é par ou ímpar.