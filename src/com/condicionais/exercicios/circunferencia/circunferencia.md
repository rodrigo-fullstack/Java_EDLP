# Exercício da Verificação da Raio da Circunferência

Escreva um programa que receba o raio de uma circunferência, depois verifica se é maior do que zero. Se sim, mostra o diâmetro, comprimento e área desta, se não exibe a mensagem dado incorreto. Utilizar JOptionPane.

## O que fazer?

Receber o raio de uma circunferência e verificar se é positivo. Se sim, calcula o comprimento, diâmetro e área da circunferência. Se não, exibe que o dado foi incorreto.

## Como fazer?

* Dar entrada com JOPane no raio                    
* Declarar constante PI;                            
* Declarar variáveis de diâmetro, comprimento e área
* Realizar verificação do raio (raio > 0 realiza as instruções, senão, não realiza.):

```java
	if(raio>0){                                       
     	diametro = 2*raio;                           
	     comprimento = 2*raio*PI;                     
	     área = PI*r*r; Pode usar classe Math;        
	     exibir(raio, diametro, comprimento e area);  
	}                                                 
	else{
		exibir que o usuário digitou dados incorretos
	}
```

* Exibe os dados necessários

## Teste de mesa

PI = 3; Depois mudo para 3.14

raio = 2;                    
                             
diametro = 2*2 = 4;          
comprimento = 2 \* 2 \* 3 = 12;    
area = 3\*2² = 3\*4 = 12;      
                             
raio = 4;                    

diametro = 4*2 = 8;          
comprimento = 4\*2\*3 = 24;    
area = 3\*4² = 3 \* 16 = 48;   


## O que aprendi?

Neste exercício simples pude entender um contexto em que as com.condicionais é importante, para controlar a entrada dos usuários de forma a não digitar dados errôneos para o programa e evitar processamentos desnecessários.