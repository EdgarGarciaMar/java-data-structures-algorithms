package estaticos;



import java.util.Scanner;



public class arrayClase {

    int arr[];

    int num;

    int i = 0;



    public arrayClase(int num){

        this.num=num;

        this.arr = new int[num];

    }



    public void guardarDatos(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");

        System.out.println("Ingresa los numeros:");

        for(i= 0; i<num; i++){

            arr[i]=scanner.nextInt();

        }

    }



    public void imprimirDatos(){

        System.out.println("*****************************************");

        System.out.println("Los datos existentes en el arreglos son:");

        for(i=0;i<num;i++){

            int pos= i+1;

            System.out.println("["+pos+"]: "+arr[i]);

        }



    }

    public int[] getArr(){
        return this.arr;
    }

    public int busquedaLinear(int arr[], int tam, int val ){
        int res = -1;
        for(i =0; i<tam;i++){
            if(val == arr[i]){
                res = i;
                return res;
            }
        }
        return res;
    }

    public void heapify(int arr[], int n, int i) {

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

    // Main function to do heap sort
    public int[] heapSort(int arr[]) {
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

}