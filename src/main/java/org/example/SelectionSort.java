package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SelectionSort {
    //Metemos los datos dentro de un array.
    public ArrayList<Integer> ordenar() throws IOException {
        FileReader myReader = new FileReader("numerosDesordenados.txt");
        BufferedReader br = new BufferedReader(myReader);

        ArrayList<Integer> numeros = new ArrayList<>();
        String linea;
            while ((linea = br.readLine()) != null){
            int valorDado = Integer.parseInt(linea);
            numeros.add(valorDado);
        }
            return numeros;
    }

    public int selectionSort(ArrayList<Integer> lista){
        int n = lista.size();
        int numeroDeComparaciones = 0;

        for (int i = 0; i < n-1; i++){
            int min_idx = i;

            for (int j = i+1; j < n; j++){
                if ( lista.get(j) < lista.get(min_idx)){
                    min_idx = j;
                    numeroDeComparaciones ++;
                }
            }

            int temp = lista.get(i);
            lista.set(i, lista.get(min_idx));
            lista.set(min_idx, temp);
        }
        return numeroDeComparaciones;
    }



    
}
