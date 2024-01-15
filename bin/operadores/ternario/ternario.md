# Operador Ternário em Java

Este operador consiste em realizar uma expressão condicional simples em uma única linha, de forma resumida. Muito utilizado para quando nao é necessário dedicar muitas linhas de código para um if/else. Para utilizá-lo no java é feito da seguinte maneira:

```
    tipo variavel = (comparacao) ? valor1 : valor2;
```

Lê-se: variável do tipo x é igual a valor 1 se comparacao é verdade, senão é igual a valor 2

Exemplo:

```java
    int a = 12;
    int b = 24;
    int c = (b==2*a) ? c = 100 : c = 10;
```