package atividade03_clinica;

import java.util.List;
import java.util.Scanner;

public class PacienteUI {
    private final Scanner scanner;
    private final PacienteService pacienteService;

    public PacienteUI() {
        this.scanner = new Scanner(System.in);
        this.pacienteService = new PacienteService();
    }

    public void exibirMenu() {

        System.out.println("========= Clinica +SUS =========");
        System.out.println("1 - Adicionar paciente");
        System.out.println("2 - Atualizar paciente");
        System.out.println("3 - Remover paciente");
        System.out.println("4 - Buscar paciente por id");
        System.out.println("5 - Buscar paciente por CPF");
        System.out.println("6 - Listar todos os pacientes");
        System.out.println("7 - Ativar paciente");
        System.out.println("8 - Desativar paciente");
        System.out.println(" ");
        System.out.println("0 - Sair");
        System.out.println(" ");
    }

    public int lerOpcao() {
        System.out.println("Escolha uma opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }

    public Paciente lerDadosPaciente() {

        System.out.println("Nome do Paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.println("CPF do Paciente: ");
        String cpfPaciente = scanner.nextLine();

        System.out.println("Telefone do Paciente: ");
        String telefonePaciente = scanner.nextLine();

        return new Paciente(nomePaciente, cpfPaciente, telefonePaciente);
    }

    public void exibirPaciente(Paciente paciente) {
        if (paciente == null) throw new IllegalArgumentException("Paciente nao encontrado!");

        System.out.println(paciente);
    }

    public void exibirTodosPacientes(List<Paciente> pacientes) {

        if (pacientes.isEmpty()) throw new IllegalArgumentException("Nenhum Paciente encontrado!");

        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
}
