/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edgargarcia
 * 
 * 
 LL: Find Kth Node From End ( ** Interview Question)
Implement a method called findKthFromEnd that returns the k-th node from the end of the list.

If the list has fewer than k nodes, the method should return null.

Note: This implementation of the Linked List class does not have the length attribute.

Method signature:

public Node findKthFromEnd(int k)


Example:

LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);
 
Node result = myList.findKthFromEnd(2); // Output: Node with value 4
 
result = myList.findKthFromEnd(5); // Output: Node with value 1
 
result = myList.findKthFromEnd(6); // Output: null


Note:

In this problem, you should use the two-pointer technique to efficiently find the k-th node from the end of the linked list.


 */
public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

	// WRITE FINDKTHFROMEND METHOD HERE //
	//                                  //
	//                                  //
	//                                  //
	//                                  //
	//////////////////////////////////////
    public Node findKthFromEnd(int N){
        int len = 0;
        Node temp = head;
 
        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
 
        // check if value of N is not more than length of
        // the linked list
        if (len < N)
            return null;
 
        temp = head;
 
        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;
 
        //System.out.println(temp.data);
        return temp;
    }
}


