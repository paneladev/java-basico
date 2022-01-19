package paneladev.metodos;

public class Metodos {

    public static void main(String[] args) {
        String msg = "Hello Java";
        imprimeMsg(msg);

        System.out.println(soma(10, 20));

        int soma = soma(5, 5);

        System.out.println(soma);
    }

    public static void imprimeMsg(String msg) {
        System.out.println(msg);
    }

    public static int soma(int val1, int val2) {
        int total = val1 + val2;
        return total;
    }
}