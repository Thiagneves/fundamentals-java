package atividade2_locadora;

import java.util.ArrayList;

public class VeiculoService {
    private final VeiculoDAO veiculoDAO;

    public VeiculoService() {
        this.veiculoDAO = new VeiculoDAO();
    }

    public Veiculo adicionarVeiculo(Veiculo veiculo) {
        validarDadosBasicos(veiculo);
        validarDuplicidadeNoCadastro(veiculo);

        return veiculoDAO.salvarVeiculo(veiculo);
    }

    public Veiculo atualizarVeiculo(Veiculo veiculo) {
        if (veiculo.getId() == null) {
            throw new IllegalArgumentException("Id do veiculo não pode ser null.");
        }

        validarDadosBasicos(veiculo);
        validarDuplicidadeNoCadastro(veiculo);

        return veiculoDAO.atualizarVeiculo(veiculo);
    }

    public void removerVeiculo(int id) {
        veiculoDAO.excluirVeiculo(id);
    }

    public Veiculo obterVeiculoPorId(int id) {
        return veiculoDAO.buscarVeiculoPorId(id);
    }

    public Veiculo obterVeiculoPorPlaca(String placa) {
        return veiculoDAO.buscarVeiculoPorPlaca(placa);
    }

    public ArrayList<Veiculo> listarTodosVeiculos() {
        return veiculoDAO.listarTodosVeiculos();
    }

    public Veiculo alugarVeiculo(int id) {
        Veiculo veiculo = veiculoDAO.buscarVeiculoPorId(id);

        validarDadosBasicos(veiculo);

        veiculo.setDisponivel(false);
        return veiculo;
    }

    public Veiculo devolverVeiculo(int id) {
        Veiculo veiculo = veiculoDAO.buscarVeiculoPorId(id);

        validarDadosBasicos(veiculo);
        validarDuplicidadeNoCadastro(veiculo);

        veiculo.setDisponivel(true);
        return veiculo;
    }

    private void validarDadosBasicos(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veiculo nao pode ser nulo.");
        }
        if (isBlank(veiculo.getMarca())){
            throw new IllegalArgumentException("Marca nao pode ser nulo.");
        }
        if (isBlank(veiculo.getPlaca())) {
            throw new IllegalArgumentException("Placa nao pode ser nulo.");
        }
        if (isBlank(veiculo.getTipoVeiculo())) {
            throw new IllegalArgumentException("Tipo de Veiculo nao pode ser nulo.");
        }
        if (veiculo.getAno() == null || veiculo.getAno() <= 0) {
            throw new IllegalArgumentException("Ano deve ser maior que zero");
        }
        if (veiculo.getValor() <= 0) {
            throw new IllegalArgumentException("Valor do veiculo deve ser maior que zero");
        }
    }

    private void validarDuplicidadeNoCadastro(Veiculo novoVeiculo) {
        Veiculo veiculoMesmaPlaca = veiculoDAO.buscarVeiculoPorPlaca(novoVeiculo.getPlaca());

        if (veiculoMesmaPlaca != null) {
            throw new IllegalArgumentException("Ja existe um carro com essa placa");
        }
    }

    private boolean isBlank(String valor) {
        return valor == null || valor.trim().isEmpty();
    }
}
