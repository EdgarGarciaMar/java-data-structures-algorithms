package estaticos;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class arrayTest {

    @Test
    void testConstructor() {
        arrayClase arrTest = new arrayClase(5);
        assertEquals(5, arrTest.num);
        assertEquals(5, arrTest.arr.length);
    }

    @Test
    void testGuardarDatos() {
        arrayClase arrTest = new arrayClase(3);
        String input = "10\n20\n30\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        arrTest.guardarDatos();
        System.setIn(System.in); // Restaura la entrada estándar

        assertArrayEquals(new int[]{10, 20, 30}, arrTest.arr);
    }

    @Test
    void testImprimirDatos() {
        arrayClase arrTest = new arrayClase(2);
        arrTest.arr[0] = 5;
        arrTest.arr[1] = 15;

        // Capturamos la salida del System.out
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        arrTest.imprimirDatos();

        // Restauramos la salida estándar
        System.setOut(System.out);

        String expectedOutput = "*****************************************\n" +
                "Los datos existentes en el arreglos son:\n" +
                "[1]: 5\n" +
                "[2]: 15\n";

        assertEquals(expectedOutput, out.toString());
    }
    @Test
    void testBusquedaLinearIsInArr(){
        arrayClase arrTest = new arrayClase(2);
        arrTest.arr[0] = 5;
        arrTest.arr[1] = 15;
        int res = arrTest.busquedaLinear(arrTest.getArr(),arrTest.getArr().length,5);

        assertEquals(0, res);
    }
    @Test
    void testBusquedaLinearIsNotInArr(){
        arrayClase arrTest = new arrayClase(2);
        arrTest.arr[0] = 5;
        arrTest.arr[1] = 15;
        int res = arrTest.busquedaLinear(arrTest.getArr(),arrTest.getArr().length,3);

        assertEquals(-1, res);
    }
    @Test
    void heapAsendenteTest() {
        arrayClase arrTest = new arrayClase(3);
        arrTest.arr[0] = 50;
        arrTest.arr[1] = 1;
        arrTest.arr[2] = 149;
        int[] arrResult = {1, 50, 149};

        assertArrayEquals(arrResult,arrTest.heapSort(arrTest.getArr()));
    }
    @Test
    void busquedaBinaria(){
        arrayClase arrTest = new arrayClase(3);
        arrTest.arr[0] = 50;
        arrTest.arr[1] = 149;
        arrTest.arr[2] = 142;
        int resBusquedaBinaria =arrTest.binarySearch(arrTest.getArr(),149);

        assertEquals(1,resBusquedaBinaria);
    }

    @Test
    void busquedaBinariaIsNotInArray(){
        arrayClase arrTest = new arrayClase(3);
        arrTest.arr[0] = 50;
        arrTest.arr[1] = 149;
        arrTest.arr[2] = 142;
        int resBusquedaBinaria =arrTest.binarySearch(arrTest.getArr(),5);

        assertEquals(-1,resBusquedaBinaria);
    }

}