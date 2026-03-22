package questao02;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.addNovoUsuario("Thiago", "thiago@email.com", "MinhaSenha123");


        Documento documento = new Documento();
        documento.addDocumento("Certidão", "Certidão valida cartorio");

        AssinadorDocumento assinadorDocumento = new AssinadorDocumento();
        assinadorDocumento.assinarDocumento(usuario, documento, "MinhaSenha123");

    }
}
