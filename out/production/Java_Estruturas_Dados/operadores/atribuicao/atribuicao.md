# Operadores de Atribuição Compostos

Messe contexto, são operadores que realizam cálculos durante a atribuição dos valores, tomando o valor anterior da variável como base. Comumente, quando queremos alterar um valor de uma variável considerando seu valor anterior, utilizamos:

```java
    int quantidade = 6;
    quantidade = quantidade + 4;
    ...println(quantidade) //10
```

Porém com os operadores de atribuição compostos podemos reduzir a quantidade de código escrito, tornando mais simples e legível da seguinte maneira:

```java
    int quantidade = 6;
    quantidade += 4;
    ...println(quantidade) //10
```

O que ocorreu foi a integração da soma de quantidade nela mesma. Por isso, os operadores de atribuição compostos mais utilizados em java são:

| Operador | Função |
| --- | --- |
| += | Soma a um determinado número a própria variável |
| -= | Subtrai a um determinado número ... |
| *= | Multiplica a um determinado número ... |
| /= | Divide a um determinado número ... |
| %= | Resultado do resto da divisão da própria variável com um determinado número |

Existem outros também como <<=, >>=, <<<=, &=, |=, ^=, que são operadores relacionados aos bits (representação binária) do número, podendo manipular e modificar seu código binário.
