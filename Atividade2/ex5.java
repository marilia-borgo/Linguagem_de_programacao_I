package Atividade2;
import java.util.Scanner;

// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo 
// por mês, mais uma comissão também fixa para cada carro vendido e
// mais 5% do valor das vendas por ele efetuadas. 
// Escrever um algoritmo que leia o número de carros por ele vendidos, 
// o valor total de suas vendas, o salário fixo e o valor que ele
// recebe por carro vendido. Calcule e escreva o salário final do vendedor.


public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("salário fixo: ");
        double salario_fixo = scanner.nextDouble();
        System.out.print("valor total de vendas: ");
        double valor_vendas = scanner.nextDouble();
        System.out.print("Quantidade de carros vendidos: ");
        double qtd_carros = scanner.nextDouble();
        System.out.print("porcentagem por carro vendido: ");
        double vlr_por_carro = scanner.nextDouble();

        double comissao_carro = qtd_carros * (vlr_por_carro/100);
        double comissao_venda = valor_vendas * (5d/100);
        double salario = salario_fixo + comissao_carro + comissao_venda;


        System.out.println(comissao_carro);
        System.out.println(comissao_venda);

        System.out.println("O salario é: " + salario);

    }
    
}

//teste de mesa
// salário fixo: 1000
// valor total de vendas: 100
// Quantidade de carros vendidos: 100
// porcentagem por carro vendido: 50
// comissao carro :50.0
// comissao vendas : 5.0
// O salario é: 1055.0