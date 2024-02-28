package Atividade1;
public class MySecondJavaProgram {
    public static void main(String[] args) {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        int gastoTotalTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        double mediaMensal = gastoTotalTrimestre / 3.0;

        // Imprime os resultados
        System.out.println("Gasto trimestre: " + gastoTotalTrimestre + " reais");
        System.out.println("Média trimestre: " + mediaMensal + " reais");
    }
}
