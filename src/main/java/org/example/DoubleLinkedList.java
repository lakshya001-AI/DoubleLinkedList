package org.example;

public class DoubleLinkedList {
    //The node of the doublelinkedlist contains the value , next, and prev pointers
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }
   private Node head;
   private Node tail;
   private int length;

    public DoubleLinkedList(int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length =1;
    }

    public void printDLL(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void gethead(){
        System.out.println(head.value);
    }

    public void gettail(){
        System.out.println(tail.value);
    }
    public void getlength(){
        System.out.println(length);
    }

    //so, in the Double linked list we can perform several operations like
    //Operations : append, prepend, removelast, removefirst, get, set, insert, remove

    //append operation is used to insert the node at the last of the linked list

    public void append(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode ;
            tail = newnode;
        }
        else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        length++;
    }

    //Prepend method is used to add the node from the start of the double linked list
    public void prepend(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
        }
        else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        length++;
    }

    //remove last is used to remove the node from the last of the list

    public Node removelast(){
        if (length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        temp.prev = null;
        length--;

        return temp;
    }

    //remove first  is used to remove the node from the starting of the list

    public Node removefirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        length--;

        return temp;

    }

    //get method is used to get the particular node from the index

    public Node get(int index){
        if(index < 0 || index > length){
            return null;
        }
        Node temp = head;
        for (int i= 0 ; i < index; ++i){
            temp = temp.next;
        }
        return temp;
    }

    //Set method is used to set the particular value by using the index
    public boolean set(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //insert method is used to insert the node at particular index
    public boolean insert(int index, int value){
        if (index == 0 || index > length ){
            return false;
        }
        Node newnode = new Node(value);
        Node before = get(index -1);
        Node after = before.next;

        newnode.next = after;
        newnode.prev = before;
        before.next = newnode;
        after.prev = newnode;

        length++;

        return true;

    }

    public boolean remove(int index){
        if (index < 0 || index > length){
            return false;
        }
        Node before = get(index -1);
        Node after = get(index + 1);
        Node temp = get(index);

        temp.next = null;
        temp.prev = null;
        before.next = after;
        after.prev = before;

        length--;

        return true;
    }




}
