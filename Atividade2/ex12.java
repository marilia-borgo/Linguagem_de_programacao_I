package Atividade2;
import java.util.Scanner;

// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 

public class ex12 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("num1: ");
        int num1 = scanner.nextInt();

        System.out.print("num2: ");
        int num2 = scanner.nextInt();


        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
    
}


// teste de mesa
// num1: 10
// num2: 2
// 10