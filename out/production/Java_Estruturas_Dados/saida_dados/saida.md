# Saída De Dados Conceito

A saída de dados se conceitua como, utilizando-se de um dispositivo de saída, exteriorizar, exibir uma informação processada no sistema. Na verdade, fazendo uma analogia ao cotidiano humano, isso ocorre com frequência. Quando estamos pensando e colocamos para fora o nosso pensamento estamos fazendo uma "Saída de dados".

Na computação, esse tipo de instrução é sempre dada como "Escreva", "Exiba" ou "Imprima".

# Saída De Dados em Java

Como foi visto no programa do HelloWorld, a saída de dados básica no Java é 

`System.out.println("Texto a ser exibido");`

Porém existem outros tipos de saída no Java que podem se adaptar para casos específicos, vamos falar sobre os tipos de saída especificamente a seguir. Veja os códigos para entender melhor.

## Println

O println é o mais conhecido, visto pelos iniciantes, seu funcionamento é imprimir o texto no console e colocar o cursor de saída (o próximo comando de print ocorre no cursor de saída) na próxima linha. 

## Print

Nesse caso, também imprime o texto, porém mantém o cursor de saída na mesma linha. É interessante para fazer mensagens comunicando ao usuário que ele deve dar entrada em um dado.

## Sequências de escape

As sequências de escape é um conjunto de caracteres iniciados por "\\" que possuem certas funcionalidades nos métodos print. Um exemplo é o "\n" que serve para quebrar linhas no print sem precisar de executar um novo comando. Existem várias sequências de escape que podem ser descobertas no seguinte site: 

Eis na tabela alguns principais exemplos

Caracter | Função
--- | ---
\n | Quebra de linha
\t | Tabulação
\r | Retorno de "Carro", coloca o cursor no início da linha e sobrescreve os textos pelo caminho
\b | Apaga o caracter anterior
\\ | Na verdade é barra invertida duas vezes, serve para exibí-la no print
\" | Exibe aspas duplas
\' | Exibe aspas simples

### Diferença entre \n, %n e \r\n

A principal diferença está na implementação do sistema operacional. A quebra de linha padrão no Windows é \r\n (Retorno de carro + Nova Linha), de sistemas Unix somente \n e de MacOS versões antes do X \r. O "%n" somente é utilizado no printf e serve para substituir a sequência de escape de acordo com o sistema que acessa a aplicação Java. Já quando se escreve "\n" no código Java a aplicação vai forçar uma quebra de linha independente da plataforma. A melhor opção, entretanto, é utilizar o %n para haver maior portabilidade de código dependendo da plataforma. 

## Printf

O printf é um método que possibilita maiores formatações do seu texto exibido. Ele utiliza especificadores de formato para especificar o tipo de dados e como eles serão exibidos. A estrutura desse método é essa:

`...printf("Mensagem", parametros na ordem definida)`

Um exemplo do uso do printf:

`...printf("Olá, %s! Esta é a mensagem de número %d.", "Mundo", 2);`

Seu uso se torna mais importante com variáveis.

```
String nome = Ivan;
int num = 12;

System.out.printf("Olá, %s!%nSeu número foi %d.", nome, num);
```

No caso, para especificar onde irão as variáveis são utilizados os especificadores de formato, caracteres antecedidos por "%". Os principais são:

* %s: Exibe uma string
* %d: Exibe um número inteiro do tipo decimal
* %...f: Exibe um número de ponto flutuante do tipo decimal. Onde está as reticências pode ser substituído pelo arredondamento do número: .2 para 2 casas decimais, .4 para 4 casas, etc.
* %b: Exibe um booleano

Para mais informações sobre o printf (em inglês): https://www.baeldung.com/java-printstream-printf
