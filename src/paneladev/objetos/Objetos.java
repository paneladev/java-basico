package paneladev.objetos;

import java.util.Scanner;

public class Objetos {

    public static void main(String[] args) {
        Objetos meuObjeto = new Objetos();

        System.out.println(meuObjeto);


        Integer valor = new Integer(10);

        System.out.println("Digite um valor: ");
        Scanner leitor = new Scanner(System.in);
        Integer valorDigitado = leitor.nextInt();

        String frase = "Hello Java";

        if(valor.equals(valorDigitado)) {
            System.out.println("Valor Digitado é Igual");
        } else {
            System.out.println("Valor Digitado é Diferente");
        }
    }

}