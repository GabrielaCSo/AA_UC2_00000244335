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
    /**public static void insertionSort(int[] lista) {
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
     * @param arr}**/
    
    /**
     * Ordena un arreglo usando Selection Sort
     * @param arr 
     */
    /**public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Encuentra el índice del menor elemento
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de elementos
            int valorTemporal = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = valorTemporal;
        }
    }**/
     public static void quicksort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = arr[fin]; // Elegimos el último elemento como pivote
            int i = inicio - 1;    // i marca la posición para intercambios
            // Recorremos el arreglo de inicio a fin-1
            for (int j = inicio; j < fin; j++) {
                if (arr[j] <= pivote) {
                    i++;
                    // Intercambiamos arr[i] con arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Colocamos el pivote en su posición correcta
            int temp = arr[i + 1];
            arr[i + 1] = arr[fin];
            arr[fin] = temp;
            
            int indicePivote = i + 1; // Ahora el pivote está en su lugar
            // Llamamos recursivamente al lado izquierdo y derecho del pivote
            quicksort(arr, inicio, indicePivote - 1);
            quicksort(arr, indicePivote + 1, fin);
        }
    }
}
