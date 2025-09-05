package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        CrearArchivoRandom crearRandom = new CrearArchivoRandom();
        SelectionSort selectionSort = new SelectionSort();
        CrearArchivoOrdenado crearOrdenado = new CrearArchivoOrdenado();

        ArrayList<Integer> lista = new ArrayList<>();
        int numeroDeComparaciones = 0;

        crearRandom.crearArchivo();
        lista = selectionSort.ordenar();
        long inicio = System.nanoTime();

        numeroDeComparaciones = selectionSort.selectionSort(lista);

        long fin = System.nanoTime();

        long duracion = fin - inicio;
        System.out.println("Tiempo de ejecución para el selection sort: " + duracion / 1_000_000 + " ms");

        crearOrdenado.crearArchivoOrdenado(lista);
    }
}