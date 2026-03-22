package questao07;

public class TesteEscopo {
    int numero = 10;

    void metodo() {
        int numero = 20;
        System.out.println(numero);
    }

    /*
     * Neste codigo a impressão será do numero 20
     * Para imprimir o atributo da clase basta alterar numero para this.numero no println
     */
}
