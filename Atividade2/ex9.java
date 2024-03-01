package Atividade2;
import java.util.Scanner;

// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12
// Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("numero de maçãs: ");
        double num = scanner.nextDouble();

        if (num >= 12 ){
            System.out.println("R$" + num*1d);
        } else {
            System.out.println("R$" + num*1.3);
        }
    }
}

//teste de mesa
// numero de maçãs: 15
// R$15.0