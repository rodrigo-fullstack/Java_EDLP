# Tipos Primitivos

Antes de falar sobre os tipos primitivos, é importante entender a diferença entre os dados e as informações. Os dados são elementos brutos, sem processamento e formatação. Já uma informação é um dado processado, analisado e de onde pôde-se inferir novos conteúdos. Por exemplo, o dia 25 de dezembro é um dado puro, agora dizer que nesse dia é o Natal se consolida como uma informação, pois podemos extrair novos elementos a partir de um dado. Isso ocorre muito frequentemente com as variáveis, nesse caso poderíamos dizer que Natal = "25/12". 
Outro exemplo é quando observamos o nosso peso. Você se pesa em cima da balança e vê um número. Esse número por si só não tem significado, mas, quando você analisa o contexto em que está inserido, pode-se deduzir que ele é o seu peso, criando-se uma informação. 
Na resolução dos problemas, portanto, trabalhamos veementemente com esses conceitos. Esses dados, entretanto, de onde se podem retirar informações, possuem seus devidos tipos na computação. Esses tipos de dados são Literais ou Caracteres, Booleanos, Inteiro e Real.

## Literais

Também chamados em inglês como Strings, são cadeias de caracteres. São representados normalmente por mensagens ou dados formatados, envolvidos por aspas duplas ou únicas. Exemplos são: "Rodrigo", "Fruta", "Nome", "Digite o seu nome: ", "O valor foi: 12", "90". Vêm frequentemente acompanhados de variáveis para armazenar seus valores, sobre as quais serão tratadas mais adiante:

* formaDePagamento = "cartão";
* ocupacao = "Gerente";
* CPF = "321.097.245-90";
* nome = "Rodrigo";


## Booleanas 

O tipo booleano diz respeito a valores lógicos como verdadeiro ou falso, 0 ou 1, true ou false.
Exemplos:

* temCartao = true;
* ignicao = 1;
* condicao = verdadeiro;

## Números

Os tipos relativos a números se dividem em dois: inteiros e reais.

### Inteiros

São números sem casas decimais, pertencentes ao conjunto dos números inteiros (negativos, nulo e positivos).
Exemplos:

* num1 = 27;
* quantidade = 12;
* peso = 70;
* minutos = 45;

### Reais

Nesse caso, são compostos pelos números do conjunto dos números reais. Ou seja, incluem números inteiros e racionais como frações, números decimais, etc..

* altura = 1.75;
* pi = 3.1415;
* divida = 290.21;
* distancia = 72.32;

# Variáveis e Constantes

As variáveis são dados que podem ser alterados, armazenados temporariamente no endereço da memória RAM do computador rotulados por um nome. Para visualizar seu conteúdo, basta utilizar uma instrução de saída para exibir o valor da variável.
Exemplo: 

* nomeDoCliente = "João Faria";
* num_do_cliente = 231453456;
* numerodetelefone = 54985342110;
* email = "teste@123.com.br"

A estrutura das variáveis é a seguinte: primeiro é declarado o seu tipo, dependendo do tipo de linguagem que você utiliza (Java precisa declarar seu tipo, já Python não precisa); segundo lugar define-se o seu nome antes do sinal de atribuição (normalmente "="); depois do sinal de atribuição é digitado o conteúdo da variável, que pode ser todos os tipos já citados.

Vale ressaltar que, uma vez que são **variáveis**, podem ter seus dados modificados. Diferente desses locais de armazenamento, existem também as constantes, que não podem ter seu valor alterado.

## Convenções, Regras e exceções

* Não utilizar acentos e símbolos especiais no nome de variáveis.
* Não iniciar com números os seus identificadores
* Não utilizar espaços entre as letras do nome
* Não utilizar palavras reservadas da linguagem como nome: if, boolean, double são alguns exemplos
* Utilizar nomes objetivos e concisos com a informação.
* Case Sensitive: a maior parte das linguagens de programação são case sensitive, ou seja, diferenciam maiúsculas de minúsculas
* Coerção: algumas variáveis podem receber tipos diferentes de sua declaração, por exemplo, uma variável do tipo real receber um tipo inteiro. No caso do Java, um inteiro ou um double pode receber um char (caracter) como ASCII code, e um double pode receber um inteiro.
* Atente-se aos padrões e convenções da linguagem para nomes de variáveis, para que torne o seu código mais legível e adequado.


# Tipos Primitivos e Variáveis em Java

## Tipos Primitivos

Os tipos primitivos de dados no Java são: int, String, char, long, double, float, boolean, short e byte.
Os dois últimos são poucos utilizados.

### Números Inteiro
As variáveis de tipo inteiro são: 

* byte: é um tipo de dado que recebe números de 0 a 127 e de 0 a -128.
* short: sua faixa chega a aproximadamente 32000, com seu respectivo equivalente no negativo.
* int: vai até aproximadamente 2 milhões.
* long: vai até 9 quintilhões.

### Números Ponto Flutuante
Já as variáveis que podem receber valores decimais, ou seja, de ponto flutuante, são: 

* float, precisão de 6 a 7 dígitos
* double, precisão de 15 dígitos

Ambas aceitam números absurdamente grandes

Desses relacionados a números, mais frequentemente se utiliza int e double no Java.

Um ponto interessante utilizando o float e o long é que depois de declarar a variável, é necessário adicionar um F, de float, ou um L, de long, no final do número dependendo do tipo selecionado. Na pasta "conteudos", existem exemplos tratando sobre isso.

### Gerais
Existem também os String, os literais já citados, que são conjuntos de caracteres. 
Os char, os quais representam somente um único caracter.
E o boolean, que aceita valores true ou false

## Declaração de variáveis

Para realizar a declaração de variáveis em Java, é realizado da seguinte maneira:

`tipo nomedavariável = conteudo`

O Java é uma linguagem fortemente e estaticamente tipada, por isso é necessário que as variáveis possuam seus tipos declarados antes de sua definição e nunca possuam valores de tipos diferentes de sua declaração. Por exemplo: se eu declarasse:

```java
    ...
    int num = 12;
    num = "Gato";

```
Isso iria resultar em um erro, já que a variável num somente pode receber inteiros. Também, você não pode declarar uma variável duas vezes, da seguinte forma:

```java
    ...
    String nome = "Rodrigo";
    String nome = "Jose";
```

## Instruções de Variáveis

A instrução relacionada às variáveis é a atribuição e existem pontos interessantes a serem ressaltados. Na definição de um valor, observe o seguinte exemplo:

```java
    ...
    int num = 12;
    num = 23;

    String nome = "Rodrigo";
    nome = "Vazio";

    num = 90;
```

O código acima faz o seguinte: declara uma variável num com valor 12, depois altera esse valor para 23 (o valor 12 foi destruído). Isso é chamado de um processo destrutivo. Depois declara uma variável nome com valor = "Rodrigo" e depois altera esse valor para "Vazio". Por último altera o valor de num para 90. É interessante destacar a ordem com que foram executadas as instruções. O valor de num e nome começam de uma forma e terminam com outros valores, nesse caminho seus valores podem ser utilizados lendo-se na memória do computador, sendo chamado de um processo não destrutivo.

## Convenções e Regras de Variáveis

Para facilitar a legibilidade de código, utiliza-se convenções e padrões da linguagem. Estes são os padrões para as Variáveis do Java:

* Declare cada variável em uma declaração separada das outras. Isto ajuda na legibilidade e na documentação do arquivo fonte.
* Siga os padrões da linguagem para nomes, no caso o camelCase, as variáveis começam com letra minúscula e, quando são palavras compostas, as próximas começam com letra maiúscula. Para constantes é utilizado o SCREAMING_SNAKE_CASE, todas com letras maiúsculas e separados por underline.
* Dê nomes convenientes para a informação da variável, evitando abreviar ou colocar nomes sem sentido como x, y, z, etc.
* Não utilizar símbolos especiais, acentos ou palavras-chave da linguagem.

## Por que não utilizar float e double para representar dinheiro nas linguagens de programação?

Uma vez que as linguagens, quando compilam seus códigos, passam para a linguagem de máquina os números na base 2, isto pode gerar alguns erros de precisão. Não à toa que, muitas vezes, quando se executam operações entre doubles e float acaba gerando valores com digitos imprecisos, por exemplo, se você multiplica 0,01 por 10, não acaba gerando exatamente 0,1, mas 0.099999999786..., algo semelhante. Por isso, realizando muitas operações com o dinheiro, pode ocorrer de se tornar algo muito impreciso, motivo pelo qual é melhor utilizar inteiro ou "BigDecimal" para representar dinheiro.