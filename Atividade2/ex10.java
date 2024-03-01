package Atividade2;
import java.util.Scanner;

// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno
// foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("nota2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println(media);


        if (media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

//teste de mesa 
// nota1: 10
// nota2: 10
// media : 10.0
// Aprovado