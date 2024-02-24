# Exercício da Soma e Diferença dos Tempos

Dados seis números inteiros representando dois intervalos de tempo (horas, minutos e segundos), faça um programa para calcular a soma desses intervalos. Faça outro programa para calcular a diferença entre os intervalos. O resultado deverá ser apresentado em horas, minutos e segundos.

## O que fazer?

Será necessário dar entrada em 6 números representando dois 2 intervalos de tempo (horas01, horas02, minutos01, minutos02, segundos01, segundos02) que será somado e subtraído em programas diferentes. 

Problema: como somar e subtrair o tempo corretamente?

É preciso criar a condição correta para a operação entre os tempos: se a soma dos minutos for >= 60, aumenta em 1 hora e subtrai o minuto por 60, se a subtração dos minutos for < 0, subtrai 1 da hora e soma com 60.

## Como fazer?
* Dar entrada em um intervalo de tempo:
horas01, minutos01 e segundos01.

* Dar entrada em outro intervalo de tempo:
horas02, minutos02 e segundos02

* Criar variáveis para soma e diferença nos programas.

### **Problema Pt1:**

* Se a soma dos minutos >= 60, soma mais um nas horas e subtrai por 60 (ou armazena o resultado do resto da divisão da soma por 60)

* Se a soma dos segundos for >= 60, soma mais um nos minutos e subtrai por 60 

* Se a subtração das horas for < 0, volta as horas para 24 e subtrai pelo próprio número de horas da diferença, para obter o restante de horas

* Se a subtração dos minutos for < 0, subtrai menos um na hora e soma por 60 os minutos

* Se a subtração dos segundos for < 0, subtrai menos um no minuto e soma por 60 os segundos

### **Problema Pt2: **

* Se a soma dos minutos for >= 60 e ultrapassar mais de uma vez o limite, soma às horas a quantidade de vezes que excedeu e calcula o restante com o resto da divisão do número somado com o próximo múltiplo de 60 (ID: #1)

* Se a soma dos segundos for >= 60 superando o limite mais de uma vez, repete o processo de cima agora para os minutos

* Se a subtração das horas gerar números menores que o limite 0 e -24, calcula-se o excedente negativo (24 * a quantidade de vezes que excedeu - 24) + 1 -- o +1 provém da ultrapassem do limite dos números negativos (<0) -- e a soma das horas atuais (valor negativo) com esse último resultado. (Representação no programa subHoras += 24 * excedenteHr) (ID: #2)

* Se a subtração dos minutos ocasionar em números menores do que os limites 0 e -24, será calculado o excedente semelhante ao de cima, agora com 60. Subtrai das horas a quantidade de vezes que excedeu e realiza o cálculo dos minutos restando como subMinutos += 60 * excedenteMin (ID: #3)

* Se a subtração dos segundos acarretar em números menores do que os limite 0 e -24, repete o mesmo processo dos minutos agora para segundos.

### **Problema Pt3: **

* Se somando aos minutos nos segundos a quantidade de vezes que excedeu gerar um número acima de 60, repete todo o processo #1

* Se subtraindo as horas nos minutos gerar um número negativo, repete todo o processo #2

* Se subtraindo os minutos nos segundos gerar um número negativo, repete o processo #3. Nesse sentido, se gerar um número negativo, repete também o processo #2

* Exibe o resultado ao final

## Teste de mesa

### Soma Intervalos
                       
01                     
                       
Horas1 = 04            
Minutos1 = 02          
Segundos1 = 03         
                       
Horas2 = 02            
Minutos2 = 40          
Segundos2 = 23         
                       
=== Resultado Final ===
                       
somaHoras = 06         
somaMinutos = 42       
somaSegundos = 26      

================           
                           
02                         
                           
Horas1 = 08                
Minutos1 = 46              
Segundos1 = 52             
                           
+                          
                           
Hora2 = 09                 
Minutos2 = 27              
Segundos2 = 35             
                           
                           
somaHoras = 17             
                           
somaMinutos = 46 + 27 = 73 
somaHoras = 17+1 = 18      
somaMinutos = 73-60 = 13   
                           
somaSegundos = 52 + 35 = 87
somaMinutos = 13 + 1 = 14  
somaSegundos = 27          
                           
=== Resultado Final ===    
                           
somaHoras = 18             
somaMinutos = 14           
somaSegundos = 27          
                           
===================    

E se o usuário digitar quantia maior do que o dobro de 60 para segundos e minutos?

03
                   
Horas1 = 23        
Minutos1 = 300     
Segundos1 = 900    

Horas1 = 03          
Minutos2 = 452     
Segundos2 = 500    

SomaHoras = 26        

SomaMinutos = 300 + 452 = 752 (60*12)   
ExcedenteLimiteMinutos = 752 / 60 = 12 (divisão inteira da soma por 60)
somaHoras = 26 + 12 = 38
somaMinutos = somaMinutos % (60*12)
somaMinutos = 752 % 720 = 32

SomaSegundos = 900 + 500 = 1400 (60*23)
ExcedenteLimiteSegundos = 1400 / 60 = 23
somaMinutos = 32 + 23 = 55;
somaSegundos %= (60 * 23) = 1400 % 1380 = 20
somaSegundos = 20    

=== Resultado Final ===
somaHoras = 38       
somaMinutos = 55     
somaSegundos = 20
    
### Diferença Intervalos
01              
                
Horas1 = 2;     
Minutos1 = 30;  
Segundos1 = 12; 
                
Horas2 = 1      
Minutos2 = 18;  
Segundos2 = 6;  
                
Resultado:      
                
subHoras = 1;   
subMinutos = 12;
subSegundos = 6;

===========================


02                           
                             
Horas1 =  1;                 
Minutos1 = 30;               
Segundos1 = 40;              
                             
Horas2 = 2;                  
Minutos2 = 45;               
Segundos2 = 50;              
                             
subHoras = 1 - 2 = -1;       
subHoras = 24 - subhoras = 23
                             
subMinutos = 30 - 45 = -15   
subHoras = 23 - 1            
subMinutos = -15 + 60        
subMinutos = 45              
                             
subSegundos = 40 - 50 = -10  
subMinutos = 45 - 1 = 44     
subSegundos = -10 + 60 = 50  

============================

03                          
                            
Horas1 = 15                 
Minutos1 = 30               
Segundos1 = 45              
                            
Horas2 = 24                 
Minutos2 = 100              
Segundos2 = 120             
                            
subHoras = 15 - 24 = -9     
subHoras = 24 - 9 = 15;     
                            
subMinutos = 30 - 100 = -70 (passou de 0 subHoras - 1, passou de 60 subHoras -1;
subMinutos = -70 % -120 = 50
subHoras = 13 - 2 = 11      
                            
subSegundos = 45 - 120 = -75
subSegundos = 120 - 75 = 45 
subMinutos = 50 - 2 = 48    

===============

04                                            
                                              
horas1 = 48;                                  
minutos1 = 120;                               
segundos1 = 230;                              
                                              
horas2 = 100;                                 
minutos2 = 360;                               
segundos2 = 900;                              
                                              
subHoras = 48 - 100 = - 52                    
excedenteHr = - 52 / -24 = 2 + 1 = 3          
subHoras = -52 + (24 * 3) = -52 + 72 = 20     
                                              
subMinutos = -240;                            
excedenteMin = -240 / -60 + 1 = 4 + 1 = 5;    
subHoras = 20 - 5;                            
subHoras = 15;                                
subMinutos = -240 + 60 * 5 = 300 - 240 = 60   
subMinutos = 0;                               
                                              
subSegundos = 230 - 900 = - 670               
excedenteSeg = -670 / -60 + 1 = 11 + 1 = 12   
subMinutos = 0 - 12;                          
subSegundos = - 670 + 60 * 12 = 720 - 670 = 50
                                              
subMinutos = -12;                             
excedenteMin = -12 / -60 + 1 = 0 + 1 = 1;     
subHoras = 15 - 1 = 14                        
subMinutos = -12 + 60 * 1 = 60 - 12 = 48      ]


## O que aprendi?

Exercício fundamental para exercitar a lógica de programação, construindo uma base sólida e mais forte para enfrentar desafios mais difíceis ao longo do tempo.

## Comentários do ChatGPT

### Soma do Tempo
Seu código parece estar funcionando bem, mas aqui estão algumas sugestões de melhorias:

1. **Comentários Claros e Concisos:**
   - Os comentários ajudam a entender a lógica do código. Certifique-se de ter comentários claros e concisos para explicar as partes mais complexas do seu código.

```java
// Verifica se há excedente de minutos
if(minutosExcedente) {
    // Soma às horas a quantidade de vezes que excedeu
    somaHoras += quantidadeExcedenteMin;
    
    // Calcula o restante de minutos
    somaMinutos %= (limiteMinSeg * quantidadeExcedenteMin);
}
```

2. **Métodos para Melhorar a Legibilidade:**
   - Considere dividir a lógica em métodos mais curtos e específicos para melhorar a legibilidade do código.

```java
private static int calcularExcedente(int valor, int limite) {
    int quantidadeExcedente = valor / limite;
    return quantidadeExcedente;
}

private static int calcularRestante(int valor, int limite, int quantidadeExcedente) {
    return valor % (limite * quantidadeExcedente);
}
```

3. **Usar `try-with-resources` para `Scanner`:**
   - Ao usar `Scanner`, é aconselhável usar `try-with-resources` para garantir que o recurso seja fechado corretamente, mesmo se ocorrer uma exceção.

```java
try (Scanner input = new Scanner(System.in)) {
    // código do scanner aqui
} catch (Exception e) {
    // tratamento de exceção
}
```

4. **Validação de Entrada:**
   - Adicione verificações para garantir que as entradas do usuário sejam válidas (por exemplo, não permitir valores negativos para horas, minutos ou segundos).

5. **Tratamento de Exceções:**
   - Adicione tratamento de exceções para lidar com casos em que o usuário fornece entrada inválida (por exemplo, letras em vez de números).

6. **Formato de Saída:**
   - Considere o uso de formatação mais avançada para a saída, como `String.format`, para tornar o código mais legível.

### Diferença do tempo

Você fez algumas melhorias no código em termos de simplicidade, e o código geral parece funcionar bem. No entanto, ainda há alguns pontos que você pode considerar para melhorar ainda mais:

1. **Uso de Métodos e Funções:**
   - Em vez de repetir a lógica para lidar com horas, minutos e segundos negativos várias vezes, você pode criar métodos ou funções para essas operações, melhorando a modularidade e a reutilização de código.

```java
private static int corrigirNegativos(int valor, int limite) {
    int excedente = valor / limite + 1;
    return valor + (limite * excedente);
}

// Uso:
subHoras = corrigirNegativos(subHoras, 24);
subMinutos = corrigirNegativos(subMinutos, 60);
subSegundos = corrigirNegativos(subSegundos, 60);
```

2. **Tratamento de Entrada e Exceções:**
   - Considere adicionar validação para garantir que o usuário forneça entradas válidas (por exemplo, números inteiros) e tratar possíveis exceções.

3. **Limites Fixos:**
   - O código ainda depende de limites fixos (24 horas, 60 minutos, 60 segundos). Considere tornar esses limites configuráveis ou baseados em constantes para facilitar a manutenção.

4. **Comentários e Documentação:**
   - Adicione comentários explicativos para as seções mais complexas do código, ajudando os outros (ou até mesmo você mesmo no futuro) a entender a lógica.

5. **Uso de Estruturas de Controle Simplificadas:**
   - Algumas partes do código podem ser simplificadas usando estruturas de controle mais diretas. Por exemplo, a lógica de correção de negativos pode ser mais simples.

```java
subHoras = (subHoras % 24 + 24) % 24;
subMinutos = (subMinutos % 60 + 60) % 60;
subSegundos = (subSegundos % 60 + 60) % 60;
```

Lembre-se de que a simplicidade e a legibilidade do código são essenciais. Ao tornar o código mais claro e modular, você facilita a manutenção e a compreensão futura do mesmo.

