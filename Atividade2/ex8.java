package Atividade2;
import java.util.Scanner;

// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 


public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("numero: ");
        double num = scanner.nextDouble();

        if (num >= 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}

//teste de mesa
// numero: 3
// Positivo