package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Usuário: ");
        usuario.use = sc.nextLine();

        System.out.println("Senha: ");
        usuario.senha = sc.nextLine();

        usuario.autenticar(usuario.use, usuario.senha);
    }
}
