package Atividade2;
import java.util.Scanner;

/* A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, 
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).  */


public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("horas Trabalhadas: ");
        double horasTrabalhadasPorSemana = scanner.nextDouble(); 
        System.out.print("salário por hora: ");
        double salarioPorHora = scanner.nextDouble(); 
        double salarioTotal = calculoSalarioTotal(horasTrabalhadasPorSemana, salarioPorHora);
        System.out.println(salarioTotal);
    }

    public static double calculoSalarioTotal(double horasTrabalhadasPorMes, double salarioPorHora){
        double horasNormais = 0;
        double horasExtras = 0;
        if (horasTrabalhadasPorMes < 160){
            horasNormais = horasTrabalhadasPorMes;
        } else {
            horasNormais = 160;
            horasExtras = horasTrabalhadasPorMes -160;
        }
        double valorTotalHorasRegulares = horasNormais * salarioPorHora;
        double valorHorasExtras = (horasExtras * salarioPorHora) * 1.5; 
        return valorHorasExtras + valorTotalHorasRegulares;

    }
}

//teste de mesa