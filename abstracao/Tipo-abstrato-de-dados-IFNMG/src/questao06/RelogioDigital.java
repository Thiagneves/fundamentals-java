package questao06;
import java.time.LocalTime;

public class RelogioDigital {

    void exibiHoraAtual(){
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);
    }

    static String converterMinutosEmHoras(int minutos){
        int hora; int minuto;
        hora = minutos / 60;
        minuto = minutos % 60;

        return String.format("%02d:%02d", hora, minuto);
    }

    static String somaHoras(int h1, int m1, int h2, int m2){

        return String.format("%02d:%02d", h1+h2, m1+m2);
    }

    boolean HorarioValido(int h, int m){
        boolean horaValida = (h >= 0 && h <= 23);
        boolean minutoValido = (m >= 0 && m <= 59);

        if (horaValida && minutoValido) {
            return true;
        }
        else {
            throw new RuntimeException("Parametros Invalidos!");
        }
    }
}
