package Atividade2;
import java.util.Scanner;

// Escreva um algoritmo para ler o salário mensal atual
//  de um funcionário e o percentual de reajuste.
//  Calcular e escrever o valor do novo salário. 

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("salario mensal atual: ");
        double salario = scanner.nextInt();
        System.out.print("reajuste: ");
        double reajuste_porcentagem = scanner.nextInt();

        double valorAumento = salario * (reajuste_porcentagem / 100);
        double novoSalario = salario + valorAumento;

        System.out.println("O novo salario será: " + novoSalario);

    }

}

// teste de mesa
// salario mensal atual: 100
// reajuste: 50
// valorAumento: 50.0
// O novo salario será: 150.0
