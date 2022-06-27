package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();
        myList.append(48); 
        myList.append(32);
        myList.append(44);

        myList.print();

        myList.addAfter(32, 59);

        System.out.println();

        myList.print();

    }
}
