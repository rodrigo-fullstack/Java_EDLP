# Expressões lógicas

São expressões entre dois operandos que, havendo uma comparação ou avaliação, retornam um valor verdadeiro ou falso. Necessita-se subdivir em dois campos diferentes que estão interligados entre si: os operadores lógicos e os relacionais.


## Operadores Lógicos

São os operadores cujo resultado da operação são valores como Verdadeiro ou Falso, True ou False. Baseiam-se na álgebra booleana e seus operadores são conjunção(E), disjunção(OU), disjunção exclusiva(XOR) e negação(NÃO). Utilizam a tabela-verdade para identificar a combinação dos valores das variáveis

| Operador | Tipo | Operação | Função | Precedência |
| --- | --- | --- | --- | --- |
| NÃO | Unário | Negação | Dois precisam ser verdade para ser verdadeiro. | 1º |
| E | Binário | Conjunção | Dois precisam ser verdade para ser verdadeiro. | 2º |
| OU | Binário | Disjunção | Pelo menos um para ser True | 3º |
| XOU | Binário | Disjunção Exclusiva | Somente um pode ser verdade para True | 3º |

## Operadores Lógicos em Java

Em Java eles são representados por símbolos de acordo com a tabela a seguir:

| Operador | Tipo | Operação |Função |
| --- | --- | --- | --- |
| ! | Unário | Negação | Nega a expressão (se for verdade se torna falso e vice-versa) |
| && | Binário | Conjunção | Junta duas expressões (os dois precisam ser verdade para retornar verdadeiro) |
| \|\| | Binário | Disjunção | Pelo menos um precisa ser verdade |
| ^ | Binário | Disjunçao Exclusiva | Somente um pode ser verdadeiro |

Acontece que os operadores para E (&&) e OU (||) possuem dois tipos: com curto-circuito lógico e sem curto-circuito lógico.
Os com curto-circuito lógico são justamente esses com duplicidade de símbolos, sua diferença está na maneira como são executadas as expressões

* &&: Caso a primeira expressão seja falsa, desconsidera analisar a segunda e já resulta como falso
* ||: Se a primeira expressão for verdadeira, desconsidera comparar a segunda e já resulta como verdade.

Isto ocorre para economizar tempo e recursos do sistema realizando operações desnecessárias. 
Porém, caso seja realmente necessário verificar o resultado de ambas expressões, utiliza-se os operadores sem curto-circuito lógico, representados por & (E) e | (OU).


## Operadores Relacionais

São operadores que realizam uma comparação entre números ou literais (Strings), são eles no Java:

| Operador | Função |
| --- | --- |
| > | Verifica se um número ou literal é **maior** do que outro |
| < | Verifica se um número ou literal é **menor** do que outro |
| >= | Verifica se um número ou literal é **maior ou igual** do que outro |
| <= | Verifica se um número ou literal é **menor ou igual** do que outro |
| == | Verifica se um número ou literal é **igual** do que outro |
| != | Verifica se um número ou literal é **diferente** do que outro |
