package questao01;

public class Principal {
    static void main() {
        Personagem p1 = new Personagem();

        p1.nome = "Harry Potter";
        p1.vida = 100;
        p1.forca = 20;
        p1.exibirStatus();

        System.out.println(" ");

        Personagem p2 = new Personagem();

        p2.nome = "Steve";
        p2.vida = 100;
        p2.forca = 10;
        p2.exibirStatus();

        p1.receberDano(p2.forca);
        p2.receberDano(p1.forca);

        System.out.println(" ");
        p1.exibirStatus();
        System.out.println(" ");
        p2.exibirStatus();

    }
}
