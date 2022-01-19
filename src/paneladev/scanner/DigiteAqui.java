package paneladev.scanner;

import java.util.Scanner;

public class DigiteAqui {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor aqui:");
        int valor = leitor.nextInt();
        System.out.println("Valor digitado: " + valor);
    }
}
