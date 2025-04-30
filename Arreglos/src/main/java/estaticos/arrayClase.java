package estaticos;


import java.util.Scanner;

/**
 * Clase de arreglos con numeros enteros.
 */
public class arrayClase {
    /** Arreglo de enteros. **/
    int[] arr;
    /** Variable de tamaño del arreglo. **/
    int num;
    /** Variable iterador global. **/
    int i = 0;

    /**
     * Constructor de la clase.
     * @param num tamaño del arr.
     */
    public arrayClase(int num) {

        this.num = num;

        this.arr = new int[num];

    }

    /**
     * Metodo para leer y guardar los datos.
     */
    public void guardarDatos() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");

        System.out.println("Ingresa los numeros:");

        for (i = 0; i < num; i++) {

            arr[i] = scanner.nextInt();

        }

    }

    /**
     * Metodo para imprimir en consola los datos.
     */
    public void imprimirDatos() {

        System.out.println("*****************************************");

        System.out.println("Los datos existentes en el arreglos son:");

        for (i = 0; i < num; i++) {

            int pos = i + 1;

            System.out.println("[" + pos + "]: " + arr[i]);

        }


    }

    /**
     * Metodo para retornar el arreglo.
     * @return arr.
     */
    public int[] getArr() {
        return this.arr;
    }

    /**
     * Metodo para buscar linearmente un numero en el arreglo.
     * @param arr arreglo de enteros.
     * @param tam tamaño del arreglo.
     * @param val valor a buscar en el arreglo.
     * @return posicion del val en el arreglo o -1 si no esta.
     */
    public int busquedaLinear(int[] arr, int tam, int val) {
        int res = -1;
        for (i = 0; i < tam; i++) {
            if (val == arr[i]) {
                res = i;
                return res;
            }
        }
        return res;
    }

    /**
     * Metodo de ordenamiento heap.
     * @param arr arreglo de enteros.
     * @param n tamaño del arr.
     * @param i iterador.
     */
    public void heapify(int[] arr, int n, int i) {

        // Initialize largest as root
        int largest = i;

        // left index = 2*i + 1
        int l = 2 * i + 1;

        // right index = 2*i + 2
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /**
     * Metodo principal del ordenamiento heap
     * @param arr arreglo de enteros.
     * @return arreglo ordenado.
     */
    public int[] heapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        return arr;
    }

    /**
     * Metodo de busqueda binaria.
     * @param arr arreglo de enteros.
     * @param x numero a buscar.
     * @return posicion en el arr o -1.
     */
    public int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }


}