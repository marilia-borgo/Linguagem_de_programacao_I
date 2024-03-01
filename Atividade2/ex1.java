package Atividade2;
import java.util.Scanner;

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
// meses e dias e escreva a idade dessa pessoa expressa apenas 
// em dias. Considerar ano com 365 dias e mês com 30 dias. 
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("anos: ");
        int anos = scanner.nextInt();
        System.out.print("meses: ");
        int meses = scanner.nextInt();
        System.out.print("dias: ");
        int dias = scanner.nextInt();

        int idade_anos = anos * 365;
        int idade_meses = meses*30;
        int idade_em_dias = idade_anos + idade_meses + dias;

        System.out.println("A idade em dias é: " + idade_em_dias);

    }

}

//teste de mesa:
// anos: 1
// meses: 1
// dias: 1
// A idade em dias é: 396
