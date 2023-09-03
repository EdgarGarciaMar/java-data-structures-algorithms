/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author edgargarcia
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    private Node head;
    private Node tail;
    private int lenght;
    
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        lenght = 1;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head: "+head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }
    public void getLenght(){
        System.out.println("Lenght: "+lenght);
    }
    
    public void append(int value){
        Node newNode = new Node(value);
        if(lenght == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        lenght ++;
    }
    public Node removeLast(){
        if(lenght == 0){
            return null;
        }
            Node pre = head;
            Node temp = head;
            
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            lenght--;
            if(lenght == 0){
                head = null;
                tail = null;
            }
            return temp;
        
    }
    public  void prepend(int value){
        Node newNode = new Node(value);
        if(lenght == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        lenght++;
        
    }
    
    public Node removeFirst(){
        if(lenght == 0)return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        lenght--;
        if(lenght == 0){
            tail = null;
        }
        return temp;
    }
    
    public Node get(int index){
        if(lenght < 0 || index >= lenght) return null;
        Node temp = head;
        for(int i = 0; i < index;i++){
            temp = temp.next;
        }
        return temp;
    }
    
    public boolean set(int index, int value){
       Node temp = get(index);
       if(temp != null){
           temp.value = value;
           return true;
       }
       return false;
    }
    
    public static void main(String[] args) {
       LinkedList myLinkedList = new LinkedList(4);
       myLinkedList.append(2);
       myLinkedList.append(2);
       myLinkedList.prepend(66);
       myLinkedList.prepend(33);
       
       myLinkedList.getHead();
       myLinkedList.getTail();
       myLinkedList.getLenght();
       myLinkedList.printList();
       System.out.println(myLinkedList.removeLast().value);
       System.out.println(myLinkedList.removeFirst().value);
       System.out.println(myLinkedList.get(1).value);
        System.out.println(myLinkedList.set(1,-1));
        
    }
    
}
