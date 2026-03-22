package questao05;

public class Principal {

    public static void main(String[] args){
        Circulo circulo = new Circulo(3);
        Losango losango = new Losango(5, 5);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 5);
        Triangulo triangulo = new Triangulo(4, 5);

        circulo.imprimirArea();
        losango.imprimirArea();
        quadrado.imprimirArea();
        retangulo.imprimirArea();
        triangulo.imprimirArea();

    }

}
