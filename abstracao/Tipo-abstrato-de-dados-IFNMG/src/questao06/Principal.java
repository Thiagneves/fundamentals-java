package questao06;

public class Principal {
    public static void main(String[] args) {
        RelogioDigital relogioDigital = new RelogioDigital();
        relogioDigital.exibiHoraAtual();
        System.out.println(RelogioDigital.converterMinutosEmHoras(125));
        System.out.println(RelogioDigital.somaHoras(3, 20, 1, 10));
        System.out.println(relogioDigital.HorarioValido(3, 10));
    }
}
