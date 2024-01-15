# Exercício do SobrePeso
O posto de atendimento médico e hospitalar de uma pequena cidade atende em média 138 pessoas por dia e vem observando, ao longo do tempo, que os casos de pessoas com problemas de sobrepeso têm aumentando a cada ano. Sabe-se que o sobrepeso pode colaborar de maneira negativa com a saúde das pessoas. 

Assim, o posto de atendimento determinou que em todos os atendimentos o médico ou o enfermeiro deverão calcular o peso ideal de todos os pacientes atendidos. Para isso, deverá ser elaborado um programa que verifique se o paciente está acima de seu peso ideal de acordo com a condição abaixo:

* para homens: (72.7 \* altura) – 58;
* para mulheres: (62.1 \* altura) – 44.7.

## O que fazer?

Dar entrada na altura, no peso e no sexo. O peso ideal para homens é dado pela fórmula: (72.7 \* altura) - 58; já para as mulheres é dado por (62.1 \* altura) - 44.7. Para isso, verifica primeiro se é homem ou mulher com uma variável. Se é homem recebe aquela fórmula, se é mulher recebe essa fórmula. 

Depois, testa se o peso digitado é maior do que o peso ideal. Se for maior, vai exibir que está sobrepeso, se for menor igual que está no peso ideal. 

## Como fazer?

* Entrada de altura, peso (doubles) e sexo (char).
* Entrada de char = **input.next().charAt(0)** 

* if(pacienteHomem) pesoIdeal = 72.7 \* altura - 58
* else if(pacienteMulher) pesoIdeal = 62.1 \* altura - 44.7
* else exibe que foi digitado incorreto e coloca um flag para evitar saídas desnecessárias

* If peso <= pesoIdeal exibe que o paciente está na faixa de peso ideal
* else, exibe que está no sobrepeso

## O que aprendi?

Este foi um exercício importante para compreender como a programação está engendrada em diversos contextos da vida cotidiana e como pode ser útil para reduzir tempo e esforço com tarefas básicas do dia a dia, no caso, a verificação do peso ideal de um paciente.

## Teste de mesa

01                                                             

altura = 1,90
peso = 60,90
sexo = m

pesoIdeal = 72.7 * 1,90 - 58 = 80,30                                

60,90 < 80,30 Verdadeiro, logo exibe que está na faixa de peso ideal

==============================

02                                                   
                                                     
altura = 1,57                                        
peso = 52                                            
sexo = f                                             
                                                     
pesoIdeal = 62,1 * 1,57 - 42.7 = 54,797              
                                                     
52 < 54,797 Verdadeiro, exibe que está no peso Ideal.

==============================

03.

altura = 1,70                                  
peso = 120,74                                  
sexo = m                                       
                                               
pesoIdeal = 72.7 * altura - 58 = 65,59         
                                               
120,74 < 65,59, falso, exibe que está sobrepeso

==============================

04                                         
                                           
altura = 1,49                              
peso = 93,77;                              
sexo = f                                   
                                           
pesoideal = 62,1 * altura - 42,7 = 49,83   
                                           
93,77 < 49,83 falso, exibe que está sobrepeso


## Comentário do ChatGPT

Seu código parece estar bem estruturado e faz o que se propõe a fazer. No entanto, aqui estão algumas sugestões de melhorias e boas práticas que você pode considerar:

1. **Validação de Entrada:**
   - Adicione verificações para garantir que as entradas do usuário sejam válidas (por exemplo, altura e peso não podem ser valores negativos).

2. **Mensagens de Saída Descritivas:**
   - Forneça mensagens mais descritivas em caso de erros ou exceções.

3. **Nomes de Variáveis Significativos:**
   - Escolha nomes de variáveis mais descritivos. Isso pode tornar o código mais fácil de entender.

4. **Evite o Uso de Variáveis de Controle Globais:**
   - Evite o uso de variáveis de controle globais (como `flag`). Isso pode ser melhorado ajustando a lógica para remover a necessidade dessa variável.

5. **Lidando com Maiúsculas e Minúsculas no Sexo:**
   - Considere normalizar a entrada do sexo para evitar problemas de comparação (por exemplo, tornar todo o caractere minúsculo). Isso tornará o código mais robusto.

6. **Utilização de `printf`:**
   - Use `printf` para formatação de saída, como você já fez em alguns lugares. Isso torna o código mais legível.

Aqui está uma versão modificada do seu código incorporando algumas dessas sugestões:

```java
import java.util.Scanner;

public class VerificandoSobrePeso {

    public static void main(String[] args) {
        System.out.println("== Verificando se o paciente está acima do peso ideal == ");
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o sexo do paciente? (M ou F): ");
        char sexo = input.next().toLowerCase().charAt(0);

        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();

        System.out.print("Digite o peso em quilogramas: ");
        double peso = input.nextDouble();
        input.close();

        double pesoIdeal = 0;

        if (sexo == 'm') {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo == 'f') {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo digitado incorretamente");
            return;
        }

        System.out.printf("Faixa do peso ideal do paciente = %.2fkg%n", pesoIdeal);

        boolean pacienteEstaPesoIdeal = peso <= pesoIdeal;
        System.out.printf("O paciente de altura %.2fm e peso %.2fkg está %s.%n",
                altura, peso, pacienteEstaPesoIdeal ? "na faixa do peso ideal" : "sobrepeso");
    }
}
```

Essas são sugestões para tornar o código mais robusto, legível e seguindo boas práticas de programação.

