# Exercício pedindo argumento por meio da JVM

Este é um exercício simples que vai pedir argumentos por meio do console, isso não vai ocorrer através da classe Scanner, mas sim por meio da declaração do console: 

`java NomeDaClasse NomeDigitado.`

Para fazer isso, é preciso no código java que as variáveis estejam recebendo o valor das posições dos argumentos do método main. Ou seja, ficamos assim:

```
String nome = args[0];
String sobrenome = args[1];
```
No caso, para mais de um nome sendo passado no console, basta aumentar o índice do "args". Em seguida, basta acessar o console e abrir a aplicação java passando os parâmetros desejados. Com o console na pasta ExerciciosGerais, deve-se executar o seguinte comando:

`...\ExerciciosGerais> java pedindo_argumento_console.meu_package.Main Rodrigo Faria`

E assim é possível passar argumentos, parãmetros para o seu programa por meio do console sem utilizar o Scanner.
