package Atividade2;
import java.util.Scanner;

// Escreva um algoritmo para ler o número total de eleitores de um município, 
// o número de votos brancos, nulos e válidos. 
// Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Brancos: ");
        double brancos = scanner.nextDouble();
        System.out.print("Nulos: ");
        double nulos = scanner.nextDouble();
        System.out.print("validos: ");
        double validos = scanner.nextDouble();

        double total_votos = brancos + nulos + validos;
        double porcentagemValidos = (validos / total_votos) * 100;
        double porcentagemBrancos = (brancos / total_votos) * 100;
        double porcentagemNulos = (nulos / total_votos) * 100;

        System.out.println("Total votos " + total_votos);
        System.out.println("porcentagem validos " + porcentagemValidos + " %");
        System.out.println("porcentagem brancos " + porcentagemBrancos  + " %");
        System.out.println("porcentagem nulos " + porcentagemNulos  + " %");
    }
}

//teste de mesa
// Brancos: 100
// Nulos: 100
// validos: 100
// Total votos 300.0
// porcentagem validos 33.33333333333333 %
// porcentagem brancos 33.33333333333333 %
// porcentagem nulos 33.33333333333333 %
