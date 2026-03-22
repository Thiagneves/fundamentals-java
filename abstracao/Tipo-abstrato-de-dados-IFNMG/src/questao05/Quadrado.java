package questao05;

public class Quadrado {

    public int lado;

    Quadrado(int lado){
        this.lado = lado;
    }

    int CalculoArea(){
        return lado*lado;
    }

    void imprimirArea(){
        System.out.println("Area do Quadrado = " +CalculoArea());
    }
}
