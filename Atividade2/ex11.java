package Atividade2;
import java.util.Scanner;

// Ler o ano atual e o ano de nascimento de uma pessoa.
// Escrever uma mensagem que diga se ela poderá ou não votar este ano 
// (não é necessário considerar o mês em que a pessoa nasceu).


public class ex11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("ano atual: ");
        double atual = scanner.nextDouble();

        System.out.print("ano nascimento: ");
        double nascimento = scanner.nextDouble();


        if ((atual - nascimento) > 18){
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }
    
}

// teste de mesa
// ano atual: 2024
// ano nascimento: 2017
// Não pode votar
