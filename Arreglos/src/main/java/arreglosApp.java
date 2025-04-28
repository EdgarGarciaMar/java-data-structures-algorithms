import estaticos.arrayClase;
import java.util.Scanner;

public class arreglosApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: ");
        int tam = scanner.nextInt();
        arrayClase a = new arrayClase(tam);
        a.guardarDatos();
        a.imprimirDatos();
    }
}
