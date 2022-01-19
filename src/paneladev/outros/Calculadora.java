package paneladev.outros;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int continuar = 1;

        while (continuar != 0) {

            System.out.println("Digita um valor inteiro numerico? ");
            int valor1 = leitor.nextInt();

            System.out.println("Digita outro valor inteiro numerico? ");
            int valor2 = leitor.nextInt();

            System.out.println("Digite 1 para somar os valores.");
            System.out.println("Digite 2 para subtrair os valores.");
            System.out.println("Digite 3 para multiplicar os valores.");
            System.out.println("Digite 4 para dividir os valores.");

            int operacao = leitor.nextInt();

            switch(operacao) {
                case 1:
                    calculaSoma(valor1, valor2);
                    break;
                case 2:
                    int subtracao = valor1 - valor2;
                    System.out.println("Subtracao dos valores: " + subtracao);
                    break;
                case 3:
                    int multiplicacao = valor1 * valor2;
                    System.out.println("Multiplição dos valores: " + multiplicacao);
                    break;
                case 4:
                    int divisao = valor1 / valor2;
                    System.out.println("Divisão dos valores: " + divisao);
                    break;
                default:
                    System.out.println("Operação não encontrada");
            }

            System.out.println("Digite 0 para sair do programa.");
            continuar = leitor.nextInt();

        }
    }

    public static void calculaSoma(int val1, int val2) {
        int soma = val1 + val2;
        System.out.println("Soma dos valores: " + soma);
    }
}
