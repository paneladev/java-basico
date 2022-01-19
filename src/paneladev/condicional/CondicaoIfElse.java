package paneladev.condicional;

import java.util.Scanner;

public class CondicaoIfElse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor aqui:");
        int valor = leitor.nextInt();

        boolean condicao = true;

        if(condicao == true) {
            System.out.println("Valor digitado é maior que zero");
        } else {
            System.out.println("Valor digitado é menor que zero ou é zero");
        }
    }
}
