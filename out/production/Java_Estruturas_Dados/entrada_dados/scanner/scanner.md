# Entrada de dados em Java - Scanner

Para realizar a entrada de dados nesta linguagem, pode-se instanciar o objeto da Classe Scanner. Primeiro realize o import devido:

`import java.util.Scanner;`

Isso vai importar a classe que vai possibilitar a entrada de dados. O import é uma declaração para trazer recursos da linguagem necessários para o seu programa. Para criar o objeto é preciso instanciá-lo como:

`Scanner leitor = new Scanner(System.in);`

Isto vai instanciar o seu objeto Scanner com o nome de leitor. Em seguida, para dar entrada em algum dado, basta você chamar uma variável, exemplo: String nome;, com o valor a seguir.

`nome = leitor.nextLine();`

Nesse caso o nosso leitor vai ficar esperando entrada de dados do tipo String por parte do usuário no console. Para caso de inteiros ou decimais, utilize seus respectivos tipos diante do next, como:

`num = leitor.nextInt();`

`num2 = leitor.nextDouble();`

Existem vários métodos na classe Scanner que merecem uma atenção futura de minha parte.

Por último, vale ressaltar que toda vez que não for mais necessária a classe Scanner é preciso utilizar o método leitor.close() para reduzir vazamentos de memória
