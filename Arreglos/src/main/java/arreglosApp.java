import estaticos.arrayClase;

import java.util.Scanner;

public class arreglosApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: ");
        int tam = scanner.nextInt();
        arrayClase a = new arrayClase(tam);
        a.guardarDatos();
        while (true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Seleccione una de las siguientes opciones: ");
            System.out.println("1: Imprimir datos\n" +
                    "2: Busqueda linear\n" +
                    "3: Heap sort\n" +
                    "4: Salir\n");
            System.out.println("Introduce tu selección:");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    a.imprimirDatos();
                    break;
                case 2:
                    System.out.println("Ingresa el número a buscar: ");
                    int val = scanner.nextInt();
                    int res = a.busquedaLinear(a.getArr(), tam, val);
                    if (res == -1) {
                        System.out.println("No se encontro el " + val + " en el arreglo");
                    } else {
                        res += 1;
                        System.out.println("El " + val + " Se encuentra en la pos :" + res);
                    }
                    break;
                case 3:
                    a.heapSort(a.getArr());
                    a.imprimirDatos();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("tralalero tralala");
            }
        }


    }
}
