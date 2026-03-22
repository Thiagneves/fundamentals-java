package atividade03_clinica;

import java.util.ArrayList;

public class PacienteService {
    private final PacienteDAO pacienteDAO;

    public PacienteService() {
        this.pacienteDAO = new PacienteDAO();
    }

    public Paciente adicionarPaciente(Paciente paciente) {
        if (paciente.getId() == null) throw new IllegalArgumentException("Id do Paciente não pode ser null.");

        validarDadosBasicos(paciente);
        validarDuplicidadeNoCadastro(paciente);

        return pacienteDAO.salvarPaciente(paciente);
    }

    public Paciente atualizarPaciente(Paciente paciente) {
        if (paciente.getId() == null) throw new IllegalArgumentException("Id do Paciente não pode ser null.");

        validarDadosBasicos(paciente);
        validarDuplicidadeNoCadastro(paciente);

        return pacienteDAO.atualizarPaciente(paciente);
    }

    public void removerPaciente(int id) {
        pacienteDAO.excluirPaciente(id);
    }

    public Paciente obterPacientePorId(int id) {
        return pacienteDAO.buscarPacientePorId(id);
    }

    public Paciente obterPacientePorCpf(String cpf) {
        return pacienteDAO.buscarPacientePorCpf(cpf);
    }

    public ArrayList<Paciente> listarTodosPacientes() {
        return pacienteDAO.listarTodosPacientes();
    }

    public Paciente ativarPaciente(int id) {
        Paciente paciente = pacienteDAO.buscarPacientePorId(id);

        validarDadosBasicos(paciente);

        paciente.desativarAtendimento();
        return paciente;
    }

    public Paciente desativarPaciente(int id) {
        Paciente paciente = pacienteDAO.buscarPacientePorId(id);

        validarDadosBasicos(paciente);

        paciente.ativarAtendimento();
        return paciente;
    }

    private void validarDadosBasicos(Paciente paciente) {
        if (paciente == null) throw new IllegalArgumentException("Paciente nao pode ser nulo.");

        if (isBlack(paciente.getNome())) throw new IllegalArgumentException("Nome do Paciente nao pode ser nulo.");

        if (isBlack(paciente.getCpf())) throw new IllegalArgumentException("CPF do Paciente nao pode ser nulo.");

        if (isBlack(paciente.getTelefone())) throw new IllegalArgumentException("Telefone do Paciente nao pode ser nulo.");
    }

    public boolean isBlack(String valor) {
        return valor == null || valor.trim().isEmpty();
    }

    public void validarDuplicidadeNoCadastro(Paciente novoPaciente) {
        Paciente pacienteMesmoCpf = pacienteDAO.buscarPacientePorCpf(novoPaciente.getCpf());

        if (pacienteMesmoCpf != null) throw new IllegalArgumentException("Ja existe um paciente com esse mesmo CPF");
    }
}
