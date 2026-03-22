package atividade03_clinica;

import java.util.ArrayList;

public class PacienteDAO {
    ArrayList<Paciente> pacientes = new ArrayList<>();
    private int proximoId = 1;

    public Paciente salvarPaciente(Paciente paciente) {
        paciente.setId(proximoId);
        pacientes.add(paciente);
        proximoId++;

        return paciente;
    }

    public Paciente atualizarPaciente(Paciente paciente) {
        if (paciente.getId() == null) throw new IllegalArgumentException("Paciente nao encontrado para atualizacao.");

        int indice = buscarIndicePorId(paciente.getId());
        if (indice == -1) throw new IllegalArgumentException("Paciente nao encontrado para atualizacao.");

        pacientes.set(indice, paciente);
        return paciente;
    }

    public void excluirPaciente(int id) {
        int indice = buscarIndicePorId(id);
        if (indice == -1) throw new IllegalArgumentException("Paciente nao encontrado para exclusao.");

        pacientes.remove(indice);
    }

    public Paciente buscarPacientePorCpf(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    public ArrayList<Paciente> listarTodosPacientes() {
        return new ArrayList<>(pacientes);
    }

    public int buscarIndicePorId(int id) {
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            if (paciente.getId() != null && paciente.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Paciente buscarPacientePorId(int id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() != null && paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }
}
