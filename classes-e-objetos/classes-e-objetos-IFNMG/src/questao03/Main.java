package questao03;

public class Main {
    static void main() {
        Carro carro1 = new Carro();

        carro1.setModelo("Astra");
        carro1.ligar();
        carro1.acelerar(100);
        carro1.frear(20);
        carro1.exibirStatus();
    }
}
