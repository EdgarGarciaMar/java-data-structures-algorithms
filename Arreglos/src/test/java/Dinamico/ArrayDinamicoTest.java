package Dinamico;

import dinamicos.arrayDinamico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayDinamicoTest {
    @Test
    void constructorTest(){
        arrayDinamico newDinamico = new arrayDinamico(5);

        assertEquals(5, newDinamico.arr.length);
    }

    @Test
    void insertDinamicoTest(){
        arrayDinamico newDinamico = new arrayDinamico(5);
        newDinamico.insertDinamico(1);
        newDinamico.insertDinamico(2);
        newDinamico.insertDinamico(3);
        newDinamico.insertDinamico(4);
        newDinamico.insertDinamico(5);
        newDinamico.insertDinamico(6);

        assertEquals(1,newDinamico.arr[0]);
        assertEquals(6,newDinamico.arr[5]);
    }

    @Test
    void printTest(){
        arrayDinamico newDinamico = new arrayDinamico(5);
        newDinamico.insertDinamico(1);
        newDinamico.insertDinamico(2);
        newDinamico.insertDinamico(3);
        newDinamico.insertDinamico(4);
        newDinamico.insertDinamico(5);

        // Capturamos la salida del System.out
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        newDinamico.printArrayDinamico();

        // Restauramos la salida estándar
        System.setOut(System.out);

        String expectedOutput = "1 2 3 4 5 " +
                "\n";

        assertEquals(expectedOutput, out.toString());
    }
}
