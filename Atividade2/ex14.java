package Atividade2;
import java.util.Scanner;

// Ler a hora de início e a hora de fim de um jogo de Xadrez 
// (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de
//  duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.  */

public class ex14 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Hora do Inicio da partida ");
       int inicio = scanner.nextInt();
       System.out.print("Hora do termino da partida ");
       int termino = scanner.nextInt();
       int horasJogadas = calculadorHorasJogadas(inicio, termino);
       System.out.println(horasJogadas);
    }
    
    public static int calculadorHorasJogadas(int inicio, int termino){
       int total;
       if (inicio >= termino) {
           total = (24 - inicio) + termino;
       } else {
           total = termino - inicio;
       }
       return total;
    }
}