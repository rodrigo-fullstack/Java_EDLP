# Exercício da Formação e Classificação de Triângulos

Faça um algoritmo que receba três valores que representarão os lados de um triângulo e serão fornecidos pelo usuário. Verifique se os valores formam um triângulo e classifique
esse triângulo como:

equilátero – três lados iguais;
isósceles – dois lados iguais;
escaleno – três lados diferentes

## Dividindo o problema

### Para que nenhum dos lados seja zero:
ladosDiferente0 = a != 0 && b != 0 && c != 0;

### Para ser um triângulo:
As somas precisam ser maiores do que os lados para poder formar um triângulo, se isso não for verdade, não completa o triângulo

* a < b+c

* b < a+c

* c < a+b

### Para ser equilátero:
a == b && a == c && b == c;

Pode simplificar como a == (b & c)? Não. Pois o & vai utilizar uma operação bit a bit, o que não tem relação com a minha lógica, que é verificar se todos os 3 valores são iguais.

Pode simplicar como a == b && b == c, pois se a = b e b = c, logo a = c também.

### Para ser isósceles:
* a == b && b != c, pois se a = b, então a também é diferente de c

ou

* a == c && c != b, pois se a = c, então a também é diferente de b

ou

* b == c && c != a, pois se b = c, então b também é diferente de a

###Para ser escaleno

* Nega a expressão do equilatero
* !(a == b && b == c)

ou
 
* (a != b && b != c), se a é diferente de b e b é diferente de c, logo a é diferente de c. Vou escolher esse por questão de prática



## O que fazer?

* Dar entrada nos lados do triângulo

* Considerar as condições primeiro isoladamente, para não complicar o problema (utilize valores exemplos)

* Verificar se todos lados são diferentes de zero:

```java
	entrada A;
	entrada B;
	entrada C;
	
	boolean ladosDiferenteZero = A != 0 && B != 0 && C != 0;
	
	if(ladosDiferentesZero){
		...
	}
```
* Verificar se é um triângulo, se não for exibe que não é um triângulo

```java
	...
		boolean formacaoTriangulo = A < B + C && B < A + C && C < A + B;
		if(formacaoTriangulo){
			...
		}
		else{
			exibe não é triângulo
		}
```

* Se é um triângulo, verificar se é equilátero, isósceles ou escaleno. 

```
	...	
		...
		boolean equilatero = A == B && B == C;
		boolean escaleno = A != B && B != C && A != C;
		
		if(equilatero){
			exibe que é um triângulo equilátero
		}
		else if(escaleno) {
			exibe que é um triângulo escaleno
		}
		else{
			exibe que é um triângulo isósceles
		}
```

## O que aprendi?

Este foi um exercício importante para exercitar a lógica de programação e a resolução de problemas, principalmente com as com.condicionais e a organização das expressões com os com.operadores lógicos e relacionais.
