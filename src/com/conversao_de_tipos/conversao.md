# Conversão de Tipos em Java

Em alguns casos na programação, pode ser necessário a conversão dos tipos dos valores das variáveis para que haja o devido funcionamento do programa. Tal conversão pode ocorrer de forma implítica e de forma explícita. 
Quando se atribui um inteiro a um double é um exemplo clássico de conversão implícita, já que o tipo double engloba o tipo inteiro. Porém quando ocorre de um tipo menor para outro vê-se uma conversão explícita.

## Conversão implícita

A conversão implícita é aquela em que não é necessário especificar a conversão, pois o valor atribuido já faz parte daquele conjunto. O processo de atribuição implícita pode ocorrer com os seguintes tipos de dados em Java:

byte -> short -> int -> long -> float -> double

Lê-se este esquema da seguinte maneira: byte é aceito por short, short é aceito por int, etc. Sendo que um tipo aceita todos os seus anteriores, ou seja, double também aceita byte. Porém, no caso, se a ordem for invertida, teremos erros de compilação. Um byte não pode receber um short, um inteiro não pode receber um double, e por aí vai. Por isso é que existem as conversões explícitas.

## Conversão explícita

Nas conversões explícitas, para converter os tipos, é necessário utilizar uma ferramenta chamada **cast**. O cast é quando especificamos o tipo dado entre parênteses antes da variável receber o dado. Em Java, ocorre da seguinte maneira:

```java
    double numDouble = 12.65;
    int numInteger = (int)numDouble;
    ...println(numInteger);
```

No entanto, como muitos desses tipos não aceitam casas decimais, por exemplo, algumas informações podem ser perdidas, passando a haver arredondamentos dos números. Um exemplo a seguir:

```java


```
 Ainda, é importante ressaltar que, quando se converte um número de tipo maior excedendo o limite de memória para o tipo menor, ocorre um processo chamado de overflow. Veja um exemplo a seguir: 

```java
    int numInt = 129;
    byte numByte = (byte)numInt;
    ...println(numByte)
```

Por exceder o limite do tipo byte, o resultado se torna "corrompido" para se enquadrar na faixa desse tipo. Então atente-se ao limite dos tipos para não ocorrer de gerar números sem sentido e também para que o arredondamento não interfira em algo no programa.

### Conversão de caracteres para inteiros, inteiros para caracteres