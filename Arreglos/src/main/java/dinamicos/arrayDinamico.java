package dinamicos;

/**
 * Clase de arreglos dinamicos
 */
public class arrayDinamico {
    public int arr[];
    private int count;
    int i;

    // Method to return length of array
    public arrayDinamico(int size){
        arr = new int[size];
    }

    // Method to print array
    public void printArrayDinamico(){

        for (i = 0; i < count; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    // Method to insert element in array
    public void insertDinamico(int ele){

        if (arr.length == count) {

            // Creating a new array double the size
            // of array declared above
            int newArr[] = new int[2 * count];

            for (i = 0; i < count; i++)
                newArr[i] = arr[i];

            // Assigning new array to original array
            arr = newArr;
        }

        arr[count++] = ele;
    }

}
