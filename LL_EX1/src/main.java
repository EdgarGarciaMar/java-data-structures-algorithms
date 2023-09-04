/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edgargarcia
 */
public class main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        

        System.out.println("Middle Node:");
        System.out.println( myLinkedList.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Middle Node:
            3

        */

    }

}
