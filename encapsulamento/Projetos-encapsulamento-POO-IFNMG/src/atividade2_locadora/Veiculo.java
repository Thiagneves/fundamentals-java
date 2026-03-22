package atividade2_locadora;

public class Veiculo {
    private Integer id;
    private String tipoVeiculo;
    private String placa;
    private String marca;
    private Integer ano;
    private double valor;
    private boolean disponivel = false;

    public Veiculo(String tipoVeiculo, String placa, String marca, Integer ano, double valor) {
        setTipoVeiculo(tipoVeiculo);
        setPlaca(placa);
        setMarca(marca);
        setAno(ano);
        setValor(valor);
        System.out.println("Veiculo cadastrado com sucesso!");
    }

    public Veiculo(String tipoVeiculo, String placa, Integer ano, double valor) {
        setTipoVeiculo(tipoVeiculo);
        setPlaca(placa);
        setAno(ano);
        setValor(valor);
        System.out.println("Veiculo cadastrado com sucesso!");
    }

    public void alugar() {
        setDisponivel(false);
    }

    public void devolver() {
        setDisponivel(true);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
