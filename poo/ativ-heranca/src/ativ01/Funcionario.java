package ativ01;

public class Funcionario extends Pessoa{
    private String matriculaFuncional;
    private String cargo;
    private boolean salario;

    public Funcionario(String nome, String cpf, String dataNascimento, String matriculaFuncional, String cargo, boolean salario) {
        super(nome, cpf, dataNascimento);
        this.matriculaFuncional = matriculaFuncional;
        this.cargo = cargo;
        setSalario(salario);
    }

    private void setSalario(boolean salario) {
        if (salario <= 0) return;
        this.salario = salario;
    }
}
