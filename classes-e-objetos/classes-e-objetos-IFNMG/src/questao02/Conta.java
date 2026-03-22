package questao02;

public class Conta {
    int numero;
    double saldo;

    void depositar(double valor){
        this.saldo += valor;
    }

    void estrato(){
        System.out.println("Conta: " +numero+ " | Saldo:" +this.saldo);
    }
}


