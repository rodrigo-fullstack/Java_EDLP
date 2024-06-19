# Empresa JS 

A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de funcionários para várias empresas em diversos ramos de atuação. Atende em média 30 candidatos por dia, mas esse valor aumenta quando faz divulgação de vagas. Para facilitar o trabalho de identificação do perfil dos candidatos que se inscrevem para as vagas, resolveu fazer um programa para registrar alguns dados para obter as informações a seguir:

» número de candidatos do sexo feminino;

» número de candidatos do sexo masculino;

» idade média dos homens;

» idade média das mulheres com experiência;

» porcentagem dos homens entre 35 e 45 anos entre o total dos homens;

» menor idade entre as mulheres que já têm experiência no serviço;

» nível de escolaridade dos candidatos entre: ensino fundamental, ensino médio, graduação e pós-graduação.

Faça um algoritmo para calcular as informações solicidadas anteriormente, sabendo que a cada iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato. Quando a resposta for negativa, os resultados deverão ser apresentados.

## O que fazer?

Será necessário dar entrada em todos dados implícitos do enunciado acima dentro de um while, sendo calculados dependendo do contexto. 

Quantas variáveis serão necessárias? 6 variáveis por enquanto. 

Qual o mais fácil de fazer? Declarar variáveis.

Qual estrutura de repetição utilizar? While, por não saber quando vai acabar.

O que precisa ser feito com relação a cada problema:

Como dar entrada no número de candidato baseado no sexo?

Como dar entrada nas mulheres com experiência?

Como armazenar os valores das idades dos homens que se encontram na faixa etária de 35 e 45 anos, calculando a porcentagem sobre o total?

Como verificar a menor idade das mulheres com experiência?

Como calcular quantidade por ensino médio, ensino superior, ensino fundamental?

## Dividindo o problema

### Como calcular número de candidatos?

Primeiro, dá entrada no sexo, se é homem (m) ou mulher (f). Se for homem, aumenta a quantidade de homens. Se for mulher, verifica se possui experiência, se não, não soma à quantidade de mulheres com experiência, se possui, soma mais um no número de mulheres com experiência.

Entrada: M
Quantidade de Homens ++;

Entrada: F
Possui Experiência: S;
Quantidade de Mulheres ++;

Entrada: F
Possui Experiência: N;
Não soma

### Como calcular média das idades dos homens?

Cria variável somaIdadesHomens para somar à medida que a idade vai sendo digitada.

Exemplo:

soma = 0;
quantidadeHomens = 0;

idadeHomem = 15;

soma = soma + 15 = 0 + 15 = 15;

quantidadeHomens = 1;

===

idadeHomem = 20;

soma = soma + 20 = 15 + 20 = 35;

quantidadeHomens = 2;

===

idadeHomem = 22;

soma = soma + 22 = 35 + 22 = 57;

quantidadeHomens = 3;

===

Media = soma/quantidadeHomens = 57/3 = 19

Soma à medida que vai sendo digitado, junto com isso aumentando a quantidade. Ao final realiza o cálculo da soma das idades dos homens dividido pela quantidade de Homens

### Como calcular média das idades das mulheres com experiência?

Soma e aumenta a quantidade de mulheres se e somente se possuir experiência.

somaF = 0;
quantidadeMulheresExp = 0;

IdadeMulher = 22;

PossuiExp = 1 (sim);

somaF = somaF + 22 = 0 + 22 = 22;

quantidadeMulheresExp++;

====

IdadeMulher = 21;

PossuiExp = 0 (não);

===

IdadeMulher = 29

PossuiExp = 1;

somaF = somaF + 29 = 22 + 29 = 51;

quantidadeMulheresExp++;

Fim

===

MediaMulheresExp = somaF/quantidadeMulheresExp = 51/2 = 25.5;

### Porcentagem homens entre 35 e 45 anos

Para calcular a porcentagem dos homens entre 35 e 45 anos, deve verificar primeiramente se a idade digitada está entre a faixa etária. Se sim, aumenta a quantidade dessa faixa.
Ao final, realiza o cálculo sobre a quantidade de homens totais.

Faça assim:

quantidadeHomens = 0;

quantidadeHomens35e45 = 0;


idadeHomem = 36

quantidadeHomens = 1;

quantidadeHomens35e45 = 1;

===

idadeHomem = 32

quantidadeHomens = 2;

quantidadeHomens35e45 = 1;

===

idadeHomem = 35

quantidadeHomens = 3;

quantidadeHomens35e45 = 2;

===

idadeHomem = 50

quantidadeHomens = 4;
quantidadeHomens35e45 = 2;

===

PorcentagemHomensEntre35e45 = 
100/(quantidadeHomens/quantidadeHomens35e45 =
100/(4 / 2) = 100 / 2 = 50

ou 

PorcentagemHomensEntre35e45 = 
quantidadeHomens35e45 * 100 / quantidadeHomens =
2 * 100 / 4 = 200 / 4 = 50

### Menor Idade de Mulher com Experiência

É necessário verificar toda vez se a idade digitada é menor do que a atual menor. Também é preciso atentar-se ao fato de que, se a quantidade de mulheres for zero, a menor idade precisa ser a primeira idade. Lembrando de que isso somente serve para as mulheres com experiência. 

Faça assim:

menorIdadeMulherExp = 0;

idadeMulher = 40;

menorIdadeMulherExp = 40;

===

idadeMulher = 30;

menorIdadeMulherExp = 30;

===

idadeMulher = 22;

menorIdadeMulherExp = 22;

===

idadeMulher = 29;

menorIdadeMulherExp = 22

### Quantidade de nível de escolaridade

Pergunta qual opção condiz com o candidato: 1 = Fundamental; 2 = Médio; 3 = Graduação; 4 = Pós-Graduação;

Aumenta em 1 para cada um dos casos

## Teste de mesa

1. 

Entrada sexo = M;

qtdHomens = 1;

idadeM = 22; 

somaIdadesM = 22;

NívelEscolar = 1 (Fundamental)

qtdFundamental = 1;

===
2. 

Entrada sexo = M;

idadeM = 37;

somaIdadesM = 59;

qtdHomens = 2;

qtdHomens35e45anos = 1;

NívelEscolar = 3 (Graduação);

qtdGraduacao = 1;

===
3. 

Entrada sexo = F;

idadeF = 21;

exp = 1 (possui);

qtdMulheresExp = 1;

somaIdadeFExp = 21

menorFExp = idadeF = 21;

NívelEscolar = 2 (Médio);

qtdMedio = 1;

===

4.

Entrada sexo = F

idadeF = 35;

exp = 1;

qtdMulheresExp = 2;

somaIdadeFExp = 56;

NívelEscolar = 4 (Pós-Graduação);

qtdPosGraduacao = 1;

===

5. 

Entrada sexo = F

idadeF = 19;

exp = 0 (não possui);

NívelEscolar = 2 (Médio);

qtdMédio = 2;

===

Dados finais:

candidatos = 2;

candidatas com Experiência = 2;


somaIdadesM = 59;

MédiaM = somaIdadesM/qtdHomens = 59/2 
= 29.5


somaIdadesFExp = 56;

MédiaF = 56/2 = 28;


qtdHomens35e45Anos = 1;

porcentagem = 50%;


menorFExp = 21;


qtdFundamental = 1;

qtdMedio = 2;

qtdGraduacao = 1;

qtdPosGraduacao = 1;

## Como fazer?

O "como fazer?" desse programa foi feito proceduralmente com a divisão do problema dada a complexidade do programa. Existem comentários explicando o que cada linha faz no programa.

## Anotação Erro String Index Out of Bonds

Tenho enfrentado um problema esquisito que está aparecendo no programa de TestesRecrutamento. Quando eu dou entrada na idade da mulher, não consigo dar entrada no caracter correspondente a experiência por algum motivo. Gera um erro chamado String Index Out of Bonds. Porém quando altero o tipo de experiencia para inteiro, assim vai.

Troquei para entrada na classe JOptionPane, provável que seja problema na classe Scanner.

## Problema de Programas Estruturados

Eis aí o problema de programas estruturados. Criado este programa com quase 200 linhas de código, completo, porém que pode ser simplificado com o paradigma procedural e a orientação a objetos.

## O que aprendi?

Este foi um programa fundamental para aplicar a utilidade da programação no dia-a-dia; também foi importante na confecção de programas maiores e mais complexos. Pôde-se perceber também o dilema da programação estruturada: códigos muito extensos e repetidos em certas, o que pode ser solucionado com a programação procedural e orientada a objetos.