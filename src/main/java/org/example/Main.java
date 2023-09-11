package org.example;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(45);

        //Append called
        doubleLinkedList.append(34);
        doubleLinkedList.append(78);
        doubleLinkedList.append(89);
        doubleLinkedList.append(45);
        System.out.println();
        System.out.println("Double Linked List after append : ");
        doubleLinkedList.printDLL();
        System.out.println();

        //Prepend called
        doubleLinkedList.prepend(23);
        doubleLinkedList.prepend(12);
        doubleLinkedList.prepend(90);
        System.out.println();
        System.out.println("Double Linked List after prepend : ");
        doubleLinkedList.printDLL();
        System.out.println();

        //remove last called
        doubleLinkedList.removelast();//45 removed
        doubleLinkedList.removelast();//89 removed
        System.out.println("Double Linked List after removeLast : ");
        doubleLinkedList.printDLL();
        System.out.println();

        //remove first called
        doubleLinkedList.removefirst();//90 removed
        doubleLinkedList.removefirst();//12 removed
        System.out.println("Double Linked List after removefirst : ");
        doubleLinkedList.printDLL();
        System.out.println();

        //get method called
        System.out.println("Get Method: ");
        System.out.println("Value at index 0 : " + doubleLinkedList.get(0).value);
        System.out.println("Value at index 1 : " + doubleLinkedList.get(1).value);
        System.out.println("Value at index 2 : " + doubleLinkedList.get(2).value);
        System.out.println();

        //set method called
        doubleLinkedList.set(0, 11);
        doubleLinkedList.set(1, 56);
        System.out.println("Set Method called : changed the value of the node at index 0 and 1");
        doubleLinkedList.printDLL();

        //insert method is called
        System.out.println();
        doubleLinkedList.insert(2, 77);
        System.out.println("Insert Method called : inserted 77 at the index 2");
        doubleLinkedList.printDLL();

        //remove method is called
        System.out.println();
        doubleLinkedList.remove(1);
        System.out.println("Remove Method called : Removed ");
        doubleLinkedList.printDLL();












    }
}