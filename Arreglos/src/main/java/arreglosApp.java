import dinamicos.arrayDinamico;
import estaticos.arrayClase;

import java.sql.SQLOutput;
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
                    "4: Busqueda binaria\n" +
                    "5: Agregar valor\n" +
                    "6: Arreglos dinamicos\n" +
                    "7: Salir\n");
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
                    System.out.println("Ingresa el número a buscar:");
                    int x = scanner.nextInt();
                    a.heapSort(a.getArr());
                    System.out.println("---Arreglo ordenado----");
                    a.imprimirDatos();
                    int resBinary = a.binarySearch(a.getArr(),x);
                    if(resBinary == -1) {
                        System.out.println("No se encontro el valor");
                    }else {
                        resBinary+=1;
                        System.out.println("El numero "+x+" Se encontro en la pos: "+resBinary);
                    }
                    break;
                case 5:
                    System.out.println("Ingresa la posicón del arreglo:");
                    int pos = scanner.nextInt();
                    System.out.println("Ingresa el nuevo valor:");
                    int newVal= scanner.nextInt();
                    a.agregarValor(pos,newVal);
                    a.imprimirDatos();
                break;
                case 6: //El arreglo dinamico consiste en incrementar al doble el tamaño del arreglo con cada insert
                    arrayDinamico newDinamico = new arrayDinamico(tam);
                    System.out.println("Ingresa los datos:");
                    newDinamico.insertDinamico(1);
                    newDinamico.insertDinamico(2);
                    newDinamico.insertDinamico(3);
                    newDinamico.insertDinamico(4);
                    newDinamico.insertDinamico(5);
                    newDinamico.insertDinamico(6);
                    newDinamico.printArrayDinamico();

                break;
                case 7:
                    return;
                default:
                    System.out.println("tralalero tralala");
            }
        }


    }
}
