package questao01;

public class Personagem {
    String nome;
    int vida;
    int forca;

    void exibirStatus() {
        System.out.println(nome);
        System.out.println("Vida: " +vida);
        System.out.println("Força " +forca);
    }

    void receberDano(int dano) {
         if (vida == 0) {
             vida = 0;
             return;
         }
        this.vida -= dano;
    }
}
