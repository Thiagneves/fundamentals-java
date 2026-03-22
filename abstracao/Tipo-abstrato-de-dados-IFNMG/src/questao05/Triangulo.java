package questao05;

public class Triangulo {
    public int base;
    public int altura;

    Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    float CalcularArea(){
        return (float) (base*altura)/2;
    }

    void imprimirArea(){
        System.out.println("Area do Triângulo = " +CalcularArea());
    }
}
