/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mx.itson.aa_uc2_00000244335;

import static mx.itson.aa_uc2_00000244335.Ordenamientos.insertionSort;

/**
 *
 * @author Gabs
 */
public class Pruebas {

    public static void main(String[] args) {
        int[] lista = {5, 3, 8, 4, 2};

        insertionSort(lista);

        int n = lista.length - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(lista[i]);
        }
    }
}
