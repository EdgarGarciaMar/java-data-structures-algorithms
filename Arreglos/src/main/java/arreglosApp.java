import estaticos.arrayClase;
import java.util.Scanner;

public class arreglosApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: ");
        int tam = scanner.nextInt();
        arrayClase a = new arrayClase(tam);
        a.guardarDatos();
        System.out.println("Seleccione una de las siguientes opciones: ");
        System.out.println("1: Imprimir datos\n" +
                "2: Busqueda linear\n" +
                "3: Busqueda binaria\n");
        int op =scanner.nextInt();
        switch (op){
            case 1 :
                a.imprimirDatos();
            case 2 :
                System.out.println("Ingresa el número a buscar: ");
                int val = scanner.nextInt();
                int res = a.busquedaLinear(a.getArr(),tam,val);
                if(res == -1){
                    System.out.println("No se encontro el "+val+" en el arreglo");
                }else{
                    res+=1;
                    System.out.println("El "+val+" Se encuentra en la pos :"+res);
                }
        }



    }
}
