package questao02;

public class Documento {
    private String titulo;
    private String conteudo;
    private boolean assinado = false;

    void addDocumento(String titulo, String conteudo) {
        if (titulo == null) {
            System.out.println("Titulo invalido, gentileza fornecer um titulo para esse documento");
        }
        else {
            setTitulo(titulo);
        }

        if (conteudo == null) {
            System.out.println("Gentileza fornecer o conteúdo desse documento!");
        }
        else {
            setConteudo(conteudo);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public boolean isAssinado() {
        return assinado;
    }

    public void setAssinado(boolean assinado) {
        this.assinado = assinado;
    }
}
