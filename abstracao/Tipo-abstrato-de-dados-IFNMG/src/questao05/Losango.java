package questao05;

public class Losango {
    public int diagonalmaior;
    public int diagonalmenor;

    Losango(int diagonalmenor, int diagonalmaior){
        this.diagonalmaior = diagonalmaior;
        this.diagonalmenor = diagonalmenor;
    }

    float CalcularArea(){
        return (float) (diagonalmaior*diagonalmenor)/2;
    }

    void imprimirArea(){
        System.out.println("Area do Losango = " +CalcularArea());
    }
}
