

# Exercício: Criar uma Conta Bancária Simples

Crie um programa em Java que simule uma conta bancária simples. Você precisará criar duas classes: ContaBancaria e TesteContaBancaria.

Classe ContaBancaria:

Crie uma classe chamada ContaBancaria com os seguintes atributos:

numeroDaConta (uma String)
saldo (um double)
Crie um construtor para a classe ContaBancaria que recebe o número da conta e o saldo inicial como parâmetros e inicializa os atributos.

Crie métodos para a classe ContaBancaria:

depositar(double valor) - para depositar dinheiro na conta.
sacar(double valor) - para sacar dinheiro da conta. Certifique-se de que o saque não exceda o saldo disponível.
obterSaldo() - para recuperar o saldo atual.
obterNumeroDaConta() - para recuperar o número da conta.
Classe TesteContaBancaria:

Crie uma classe separada chamada TesteContaBancaria com um método main.

No método main, crie duas instâncias de ContaBancaria, deposite e retire dinheiro dessas contas e exiba os detalhes da conta (número da conta e saldo) após cada transação.