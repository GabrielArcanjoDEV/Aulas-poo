package Exercicio;

public class ContaCorrente {

    String titular;
    double saldo;
    int numeroConta;


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Erro: valor inválido para depósito.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro: saldo insuficiente ou valor inválido.");
        }
    }


    public void transferir(ContaCorrente destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Erro na transferência.");
        }
    }


    public void getSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        conta1.titular = "Gabriel";
        conta1.numeroConta = 1;

        ContaCorrente conta2 = new ContaCorrente();
        conta2.titular = "Maria";
        conta2.numeroConta = 2;

        // Depósitos
        conta1.depositar(1000);
        conta2.depositar(500);

        // Saque
        conta1.sacar(200);

        // Transferência
        conta1.transferir(conta2, 300);

        // Tentando sacar mais que o saldo
        conta2.sacar(2000);

        // Mostrar saldo final
        conta1.getSaldo();
        conta2.getSaldo();
    }
}