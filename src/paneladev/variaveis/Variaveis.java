package paneladev.variaveis;

// paneladev.variaveis.Variaveis é o nome da classe
public class Variaveis { // aqui vai um comentario

    //Método responsável por executar o programa
    public static void main(String[] args) { // possa comentar

        /*
         Abaixo veremos os tipos mais utilizados
         de variáveis em Java.
         */

        byte vByte = 127; //8bits de -128 ate 127
        short vShort = 32767; //16bits -32.768 ate 32.767
        int vInt = 2147483647; //32bits -2.147.483.648 ate 2.147.483.647
        long vLong = 9223372036854775807L; //64bits -9.223.372.036.854.775.808L e -9.223.372.036.854.775.807L

        char vChar = 'C';

        float vFloat = 2.6f; //32bits até 7 digitos
        double vDouble = 3.59; //64bits ate 15 digitos

        boolean tipoBooleano = true; // true ou false

        String mensagem = "Hello Java!";

        System.out.println(mensagem);
    }
}