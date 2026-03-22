package questao05;

public class Retangulo {
    public int base;
    public int altura;

    Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    int CalculoArea(){
        return base*altura;
    }

    void imprimirArea(){
        System.out.println("Area do Retângulo = " +CalculoArea());
    }
}
