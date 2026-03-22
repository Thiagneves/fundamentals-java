package questao04;

public class Main {
    static void main() {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

        p1.setNome("Linux");
        p1.setForca(150);
        p1.setVida(500);

        p2.setNome("Windows");
        p2.setForca(50);
        p2.setVida(100);

        p1.status();
        p2.status();

        p1.atacar(p2);
        p2.atacar(p1);

        p1.status();
        p2.status();
    }
}
