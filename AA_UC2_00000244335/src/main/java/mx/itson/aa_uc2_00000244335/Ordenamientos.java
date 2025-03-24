/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc2_00000244335;

/**
 *
 * @author Gabs
 */
public class Ordenamientos {
    
    

    /**
     * Ordena listas desordenadas
     * @param lista desordenada 
     */
    public static void insertionSort(int[] lista) {
        int n = lista.length;  // Obtiene la longitud del arreglo

        // Recorre el arreglo desde el segundo elemento hasta el final
        for (int i = 1; i < n; i++) {
            int num = lista[i];  // Elemento actual a insertar en la parte ordenada
            int j = i - 1;  // Índice del último elemento de la parte ordenada

            // Mueve los elementos mayores que 'num' una posición a la derecha
            while (j >= 0 && lista[j] > num) {
                lista[j + 1] = lista[j];  // Desplaza el elemento a la derecha
                j = j - 1;  // Decrementa 'j' para seguir comparando con los anteriores
            }

            // Inserta 'num' en su posición correcta dentro de la parte ordenada
            lista[j + 1] = num;
        }
    }

}
