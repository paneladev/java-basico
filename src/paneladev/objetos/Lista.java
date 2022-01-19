package paneladev.objetos;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<String> listaMarcas = new ArrayList<>();
        listaMarcas.add("Ford");
        listaMarcas.add("Fiat");
        listaMarcas.add("Jeep");

        for (String marca : listaMarcas) {
            System.out.println(marca);
        }
    }
}
