# Break e Continue no Java

Nas ilnguagens de programação, existem comandos para parar ou retomar as estruturas de repetição. 
Esses comandos são o break e o continue. 

O break é utilizado para interromper a estrutura de repetição. Veja um exemplo a seguir:

```java
    
    String nome = "";
    while (true){
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        if(nome.equals("Rodrigo")) break;
            
            }
```

Já o continue é utilizado para retornar ao começo do código.

```java
    while(true){
        num = input.nextInt();
        if(num%2 != 0)
            continue
        soma += num;       
            }
```

