package atividade2_locadora;

import java.util.ArrayList;

public class VeiculoDAO {
    private final ArrayList<Veiculo> veiculos = new ArrayList<>();
    private int proximoID = 1;

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        veiculo.setId(proximoID);
        veiculos.add(veiculo);
        proximoID++;

        return veiculo;
    }

    public Veiculo atualizarVeiculo(Veiculo veiculo) {
        if (veiculo.getId() == null ) {
            throw new IllegalArgumentException("Veiculo nao encontrado para atualizacao.");
        }

        int indice = buscarIndicePorId(veiculo.getId());

        if (indice == -1) {
            throw new IllegalArgumentException("Veiculo nao encontrado para atualizacao.");
        }

        veiculos.set(indice, veiculo);
        return veiculo;
    }

    public void excluirVeiculo(int id) {

        int indice = buscarIndicePorId(id);

        if (indice == -1) {
            throw new IllegalArgumentException("Veiculo nao encontrado para exclusão.");
        }

        veiculos.remove(indice);
    }

    private int buscarIndicePorId(int id){
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculo = veiculos.get(i);
            if (veiculo.getId() != null && veiculo.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Veiculo buscarVeiculoPorId(int id) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() != null && veiculo.getId() == id) {
                return veiculo;
            }
        }
        return null;
    }

    public Veiculo buscarVeiculoPorPlaca(String placa) {
        for (Veiculo veiculo: veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public ArrayList<Veiculo> listarTodosVeiculos() {
        return new ArrayList<>(veiculos);
    }
}
