package questao05;

public class Circulo {
    public float raio;

    Circulo(int raio){
        this.raio = raio;
    }

    float CalculoArea(){
        return (float) (3.14 * (this.raio*this.raio));
    }

    void imprimirArea(){
        System.out.println("Area do Circulo = " +CalculoArea());
    }
}
