package com.bridgelabz.linkedlist;

public class LinkedList<K> {

    Node head, tail;
    public void append(K key) {
        Node<K> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void print() {
        Node<K> temporaryNode = head;
        while(temporaryNode != null){
            System.out.print(temporaryNode.key+ " ");
            temporaryNode = temporaryNode.next;
        }
    }
}
