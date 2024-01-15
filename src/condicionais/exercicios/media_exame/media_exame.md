# Exercício da Média Do Aluno

Um aluno realizou três provas de uma disciplina. Considerando o critério abaixo, faça um programa que mostre se ele ficou para exame. Em caso positivo, leia a nota do exame e veri-
fique se conseguiu a aprovação ou não.

Média = (Prova1 + Prova2 + Prova3)/3

A média deve ser maior ou igual a 7,0. Se não conseguir, a nova média deve ser:

Final = (Média + Exame)/2

Nesse caso, a média final deve ser maior ou igual a 5,0.

## O que fazer?

Criar 3 variáveis para receber as notas das provas do aluno. Realizar a média das notas com quantidade = 3. 

Média = (Prova1 + Prova2 + Prova3)/3

Se a média for menor do que 7, vai dar entrada em exame e calcular média nova. Se essa média for menor do que 5, não é aprovado, se for maior do que 5, é aprovado.

Se não, ou seja, a média for maior ou igual a 7, é aprovado.

Média Final = (Média + Exame)/2

## Como fazer?

* Dar entrada nas provas

* Calcular média

```
	
	if(media<7){
		notaExame = entrada;
		mediaFinal = (media + notaExame)/2;
		if(mediaFinal < 5){
			resultado = reprovado;
		}
		else{
			resultado = aprovado
		}
	}
	else{
		resultado = aprovado
	}
```

* Exibe ao final o resultado do estudante

## Teste de mesa

                                  
Notas           
                  
7, 8, 9:                          

media = (7 + 8 + 9) / 3 = 24/3 = 8

resultado = aprovado   

==============================           
                                  
7, 5, 3                           
media = (7 + 5 + 3) / 3 = 15/3 = 5
                                  
se exame = 8                      
mediaFinal = (5+8)/2 = 13/2 = 6.5 
                                  
resultado = aprovado              

""""""""""""""""""""""""""""""""
                                  
se exame = 3                      
                                  
mediaFinal = (5+3) / 2 = 8 / 2 = 4
                                  
resultado = reprovado             

==============================
                                  
3,5,4                             
                                  
media = (3+5+4) / 3 = 12/3 = 4    
                                  
resultado = reprovado;            

## O que aprendi?

Melhor compreensão quanto às condicionais e organização das declarações das variáveis diante dos ifs, como por exemplo quando declaro uma variável do tipo boolean relacionada à segunda fase.