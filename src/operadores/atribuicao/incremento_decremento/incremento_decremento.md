# Incremento e Decremento

Realizar um incremento ou decremento significa aumentar ou diminuir em um certo valor. Colocando diante das variáveis, seja posterior ou anteriormente, isto ocorre da seguinte maneira no Java:

* ++ = aumenta em um
* -- = diminui em um

Um exemplo para entender sobre o local onde está posicionado o operador está a seguir:
```java
    int x = 0;
    x++;
    ...println(x); //x = 1
    ...println(x++) //Imprime x(1) e depois soma 1
    ...println(++x) //Soma 1 e depois imprime

    x--;
    ...println(x); //x = 2
    ...println(x--) //Imprime x(2) e depois subtrai 1
    ...println(--x) //subtrai 1 1 e depois imprime
```
Ocorre o seguinte com esses operadores: colocando antes da variável (vide ++x), o incremento vem em primeiro lugar, porém ao se pôr depois (x--), é executado primeiro o necessário -- um método ou função --, depois é que é decrementado. Lembrando que o mesmo acontece tanto para incremento como para decremento. 
