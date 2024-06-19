# Exercício do Aumento Linear Transversal - Ótica

Faça um programa sobre Ótica a respeito de uma lente esférica divergente, ou seja, convexa, recebendo 3 valores do teclado, tamanho do objeto, tamanho da imagem e distância da imagem até a lente. O programa deve calcular a distância do objeto até a lente.

  Atenção:
* Imagem Virtual: p'< 0
* Imagem Direita: I > 0
 
Fórmula aumento linear transversal: 
* i = tamanho imagem
* o = tamanho objeto
* p' = distância lente até a imagem
* p = distância lente até o objeto
* i/o = -p'/p

## O que fazer?

* Dar entrada nas 3 variáveis ditadas por classe Scanner e método (nextDouble)
* Calcular a distãncia como sendo

* Na fórmula: p = (-p' + o)/i
* distânciaObjeto = (-distanciaDaImagem * tamanhoDoObjeto) / tamanhoDaImagem
* Exibe ao final o valor da distância do objeto