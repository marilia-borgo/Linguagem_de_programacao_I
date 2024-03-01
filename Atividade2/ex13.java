package Atividade2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

public class ex13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("primeiro valor: ");
            int um = scanner.nextInt();
            System.out.print("segundo valor: ");
            int dois = scanner.nextInt();
            List<Integer> result = organizadorCrescente(um, dois);
            System.out.println("Valores em ordem crescente: " + result);
        }
    }
    public static List<Integer> organizadorCrescente(int um, int dois) {
        List<Integer> lista = new ArrayList<>();
        lista.add(um);
        lista.add(dois);
        Collections.sort(lista);
        return lista;
    }
}


