package questao05;

public class Main {
    static void main() {
        Conta a = new Conta();
        a.numero = "123-1";
        a.saldo = 100;

        Conta b = a;
        b.saldo = 200;

        System.out.println(a.saldo);

        // O saldo de da Conta a é alterado pois passamos a referencia de a para b ou seja todas as modificações de b também acontecerá em a
        // Diferente de um Tipo primitivo, neles o valor é copiado. Em objetos a referencia que é copiada.]

        Conta a2 = new Conta();
        a2.saldo = 100;

        Conta b2 = new Conta();
        b2 = a2;

        // Neste novo caso os valores são copiados, não a referencia, portanto poderiamos modificar o saldo de b sem mexer no saldo de a.
    }
}
