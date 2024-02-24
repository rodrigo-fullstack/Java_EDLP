# Vetores 

## O que são?

Vetores são variáveis compostas que podem armazenar mais de um valor. A captura de seus valores ocorre por meio do seu índice, o qual começa em 0 e termina no número especificado. Diferente de variáveis comuns, eles podem armazenar uma gama de variáveis.

# Vetores em Java

Para criar um vetor no Java, você deve utilizar o seguinte comando. Um vetor de double é criado da seguinte forma:

```java
	...
	double[] notas = new double[] {5.0, 7.0, 6.0, 9.0};
	...println(notas[1]);
```

O código acima cria um vetor do tipo double de nome "notas" com as notas entre chaves separadas por vírgulas. Para acessar um valor específico das notas utiliza-se o nome do vetor e o índice entre colchetes. No caso, ali no comando println não será exibido o "5.0", o primeiro elemento, pois os índices dessas estruturas começam por 0. Será exibido o número "7.0".
