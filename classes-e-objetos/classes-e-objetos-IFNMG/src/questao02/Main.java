package questao02;

public class Main {
    static void main() {
        Conta c1 = new Conta();

        c1.numero = 123;
        c1.saldo = 1200.00;

        c1.estrato();

        Conta c2 = c1; // apontei c2 -> c1

        System.out.println(" ");

        c2.depositar(1000);

        c1.estrato(); // quando muda o c1 muda o c2
        c2.estrato();

        // o c2 também é alterado pq c2 aponta para c2, ou seja é o mesmo endereço.

        System.out.println(" ");

        c1.numero = 2001;

        c1.estrato();
        c2.estrato();

        /*
         * quando usamos dados primitivos não acontece o mesmo, pois quando dizemps que a = 10 e b = a, estamos informado que
         * o valor que vamos colocar na casa b é o mesmo que está em a, ou seja, não estamos apontando a coordenada b.
         */
    }
}
