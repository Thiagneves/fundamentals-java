package questao04;

public class Usuario {

    public String use;
    public String senha;
    public boolean login;

    void autenticar(String use, String senha){
        if (use.equals("thiagneves") && senha.equals("M1534")){
            System.out.print("Carregando...");
            login = true;
        }
        else {
            System.out.print("Usuário não identificado!");
            login = false;
        }
    }
}
