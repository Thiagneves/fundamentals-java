package questao03;

public class Carro {
    private String modelo;
    private int velociadadeAtual;
    private boolean ligado;

    void ligar(){
        setLigado(true);
    }
    void desligar(){
        setLigado(false);
    }
    void acelerar(int valor){

        if (ligado == true) {
            this.velociadadeAtual += valor;
            return;
        }

        System.out.println("Ligue o carro, para acelerar!");

    }
    void frear(int valor){
        if (velociadadeAtual > 0) {
            this.velociadadeAtual -= valor;
            return;
        }
        System.out.println("O carro deve está em movimento para frearmos.");
    }
    void exibirStatus(){
        System.out.println("Modelo: " +getModelo());
        System.out.println("Velocidade Atual: " +getVelociadadeAtual());
        System.out.println("Ligado: " +isLigado());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelociadadeAtual() {
        return velociadadeAtual;
    }

    public void setVelociadadeAtual(int velociadadeAtual) {
        this.velociadadeAtual = velociadadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
