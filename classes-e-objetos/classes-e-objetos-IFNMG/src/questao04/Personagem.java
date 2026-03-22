package questao04;

import com.sun.security.jgss.GSSUtil;

public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    void atacar(Personagem alvo) {
        this.vida -= alvo.forca;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    void status() {
        System.out.println("------ Status ------");
        System.out.println("Personagem: " +nome);
        System.out.println("Vida: " +vida);
        if (this.vida == 0) {
            System.out.println("F Familia");
        }
        System.out.println("Força: " +forca);
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
