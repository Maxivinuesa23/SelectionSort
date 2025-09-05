package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CrearArchivoOrdenado {
    public void crearArchivoOrdenado(ArrayList<Integer> lista) throws IOException {
        FileWriter myWriter = new FileWriter("numerosOrdenadosSelectionSort.txt");
        int max = lista.size();

        for (int k =0; k < max; k++){
            myWriter.write(lista.get(k) + "\n");
        }

        myWriter.close();
    }
}
