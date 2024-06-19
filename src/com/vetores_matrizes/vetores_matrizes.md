# Estruturas de Dados Estáticas

Em alguns casos na programação, é preciso armazenar e dispor diversos dados para um problema. De acordo com o que se em visto até agora, é possível criar várias variáveis para armazenar cada um desses valores. Porém esta é uma tarefa muito repetitiva e não engenhosa.

Para solucionar esse problema, existem as variáveis compostas, que armazenam um conjunto de valores associados. As tais estruturas de dados estáticas, chamadas de com.vetores e matrizes.

## Vetores 

## O que são?

Como já foi visto, em alguns casos é preciso criar uma estrutura que armazene um conjunto de dados sem a necessidade de instanciar diversas variáveis para isso. Para isso, pode-se utilizar os com.vetores, também chamados de estruturas indexadas ou *arrays*. 

Vetores são variáveis compostas que podem armazenar mais de um valor. A captura de seus valores ocorre por meio do seu índice, o qual começa em 0 e termina na quantidade diminuída de 1. Diferente de variáveis comuns, eles podem armazenar uma gama de variáveis.

São na realidade representados como uma linha de valores, possuindo somente uma única dimensão de dados.

Representação:
 
```
Índices:    [0]         [1]      [2]      [3]       [4]
Animais = ["Cachorro", "Gato", "Coelho", "Jabuti", "Tigre"]
```


Os valores, de mesmo tipo, que compõem o vetor são chamados de elementos, e a associação àquele valor é chamado índice. 

Observando o exemplo acima, visando a se referenciar ao elemento "Coelho", é preciso primeiro dizer qual o vetor onde ele está - Animais - depois associá-lo ao índice ou posição em que se encontra - [2] -. Por fim, combinando esses passos, a referenciação fica: Animais[2].

Nessa referência, inclusive, pode ocorrer a manipulação dos dados associados, alterando-se seus valores, mudando de posição ou outras funcionalidades.


## Vetores em Java

A estrutura para a criação de um vetor em Java é dada a seguir:

```java
	tipo nome[] = new tipo[quantidade];
	
	ou
	
	tipo[] nome = new tipo[quantidade];
```

Também é possível inicializar o vetor na própria linha, sem a necessidade de utilizar o operador new e declarar quantidade de elementos. Veja a estrutura desta maneira a seguir:

```
	tipo nome[] = {elem1, elem2, elem3..., elemN;)
```



No caso do Java, os com.vetores são objetos que precisam ser instanciados utilizando o operador new (construtor da classe). Sendo objetos, eles terão seus próprios atributos e métodos que podem ser executados. Mais à frente será visto mais especificamente sobre eles. Veja um exemplo para duas possibilidades de criação de com.vetores em java

```java
	...
	double[] notas = new double[] {5.0, 7.0, 6.0, 9.0};
	...println(notas[1]);
	
	String classificacaoSeres[] = new String[5];
	classificacao[0] = "Animais";
	classificacao[1] = "Monera";
	classificacao[2] = "Fungi";
	classificacao[3] = "Protista";
	classificacao[4] = "Vegetais";
```

O código acima cria um vetor do tipo double, de nome "notas" com as notas entre chaves separadas por vírgulas. Para acessar um valor específico das notas utiliza-se o nome do vetor e o índice entre colchetes. No caso, ali no comando println não será exibido o "5.0", o primeiro elemento, pois os índices dessas estruturas começam por 0. Será exibido o número "7.0".

Também é criado um vetor do tipoString para exemplificar a outra maneira de declaração. Em seguida são definidos os valores das posições desse vetor.

## Alterando e atribuindo Valores dos Vetores

A alteração e atribuição dos dados de um vetor deve ocorrer de um a um. Normalmente chamamos o vetor com seu respectivo índice, para alterar os valores. Imagine um vetor "pessoasCadastradas", com nomes de pessoas ["Ronaldo", "Jovenice", "Bartolomu"...] e outros nomes. Suponha-se que houve um erro na digitação do terceiro elemento, de índice 2, assim a alteração ocorre da seguinte maneira:

`pessoasCadastradas[2] = "Bartolomeu"; `

Veja outro exemplo dessa alteração das informações:

```java

double vetorNotas[] = {2.5, 9.4, 10.5, 9.2;

vetorNotas[0] = 6.5;
vetorNotas[1] = 8.2;
vetorNotas[2] = 9,3;
vetorNotas[3] = 9.5;

```

Como se pôde ver, esse processo ocorre, no momento, de maneira extremamente manual e repetitiva. É interessante ressaltar também que é possível incluir, na consulta indexada dos valores do vetor, expressões aritméticas, variáveis e constantes. Um exemplo claro desse uso é quando se busca capturar o valor de um termo próximo, anterior ou posterior. Veja essa aplicação a seguir:

```
	int posicaoAtual = 1;
	int numeros[] = {2,9, 20, 34
	int anteriorPosicao = numeros[posicaoAtual - 1];
	int posteriorPosicao = numeros[posicaoAtual - 1];
```

### Utilizando **For**

Para facilitar, entretanto, a manipulação de uma maior quantidade de elementos de um vetor, utiliza-se as estruturas de repetição para percorrer a estrutura, mais especificamente o "for". Veja um exemplo a seguir:

```
	int numeros[] = {2, 4, 5, 92, -5};
	for (int i = 0; i < 5 ; i++) {
		...println(numeros[i]);
	}
	
```

Um exemplo clássico, que vai exibir os elementos que compõem esse vetor. Vale destacar também sobre a maneira com a qual o Java trata essas estruturas. Muitos dados no Java podem ser manipulados por meio de tipos primitivos ou objetos instanciados. Como os com.vetores são objetos, pode-se utilizar seus atributos e métodos correspondentes. O mais conhecido é o vetor.length, que vai retornar o valor do tamanho do vetor, muito útil para utilizar nas estruturas de repetição interagindo com os com.vetores.

Reescrevendo o exemplo acima utilizando o presente método:

```
	int numeros[] = {2, 4, 5, 92, -5};
	for (int i = 0; i < numeros.length; i++;
		...println(numeros[i]);
```



