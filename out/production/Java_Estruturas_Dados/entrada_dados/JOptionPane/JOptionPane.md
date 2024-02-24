# Entrada de Dados em Java - JOptionPane

Ainda existe outra forma de realizar a entrada de dados no Java, que é utilizando a classe JOptionPane, exibindo uma interface gráfica para digitar os valores do teclado. Oferece, portanto, um ambiente mais amigável do que o terminal para a digitação dos dados. Antes de mostrar a entrada, vale ressaltar que esta classe também serve para vários outros usos que podem ser explorados mais adiante.

Para utilizar esta classe, primeiro é preciso importá-la utilizando a declaração import a seguir:

`import javax.swing.JOptionPane //* no lugar de JOptionPane... importa todas as classes de swing`

Depois podemos utilizar o método showInputDialog() para dar entrada em um dado do tipo String:

```java
    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    
```

Caso seja necessário dar entrada de outro tipo, utilize a classe do tipo primitivo (Integer, Double...):

```java
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
```

