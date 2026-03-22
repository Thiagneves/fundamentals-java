package questao08;

public class Conta {
    private double saldo; // saldo privado

    void depositar(double saldo) {
        this.saldo += saldo; // add this.saldo
    }

    // O saldo da conta não muda pq anteriormente não estavamos informado para o programa que o saldo que receberia saldo é o atributo da classe.
}
