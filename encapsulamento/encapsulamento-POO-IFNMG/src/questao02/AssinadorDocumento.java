package questao02;

public class AssinadorDocumento {
    public void assinarDocumento(Usuario usuario, Documento documento, String senhaDigitada) {
        if (senhaDigitada.equals(usuario.getSenhaAssinatura())) {
            documento.setAssinado(true);
        }
        else {
            System.out.println("Senha invalida!");
        }
    }
}
