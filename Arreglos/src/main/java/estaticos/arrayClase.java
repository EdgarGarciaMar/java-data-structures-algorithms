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



}