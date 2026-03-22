package atividade2_locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeiculoUI {
    private final Scanner scanner;
    private final VeiculoService veiculoService;

    public VeiculoUI() {
        this.scanner = new Scanner(System.in);
        this.veiculoService = new VeiculoService();
    }

    public void exibirMenu() {

        System.out.println("========= ALUGA AQUI =========");
        System.out.println("1 - Adicionar Veiculo");
        System.out.println("2 - Atualizar Veiculo");
        System.out.println("3 - Remover Veiculo");
        System.out.println("4 - Buscar Veiculo por ID");
        System.out.println("5 - Buscar Veiculo por Placa");
        System.out.println("6 - Listar Todos os Veiculos");
        System.out.println("7 - Alugar Veiculo");
        System.out.println("8 - Devolver Veiculo");
        System.out.println(" ");
        System.out.println("0 - Sair");
        System.out.println(" ");
    }

    public int lerOpcao() {
        System.out.println("Escolha uma opção:");
        int opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }

    public Veiculo lerDadosVeiculo() {

        System.out.print("Tipo de Veiculo: ");
        String tipoVeiculo = scanner.nextLine();

        System.out.print("Placa do Veiculo: ");
        String placa = scanner.nextLine();

        System.out.print("Marca do Veiculo: ");
        String marca = scanner.nextLine();

        System.out.print("Ano do Veiculo: ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.print("Valor da diaria do Veiculo: ");
        double valor = Double.parseDouble(scanner.nextLine());

        return new Veiculo(tipoVeiculo, placa, marca, ano, valor);
    }

    public void exibirVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            System.out.println("Veiculo Não encontrado!");
            return;
        }

        System.out.println(veiculo);
    }

    public void exibirTodosVeiculos(List<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum Veiculo encontrado!");
            return;
        }

        for (Veiculo veiculo: veiculos) {
            System.out.println(veiculo);
        }
    }
}
