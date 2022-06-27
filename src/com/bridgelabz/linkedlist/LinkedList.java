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

    public void addAfter(K searchNode, K key) {
        Node<K> nodeFound = search(searchNode);
        Node<K> newConnectionNode = new Node<>(key);

        if(nodeFound != null){
            newConnectionNode.next = nodeFound.next;
            nodeFound.next = newConnectionNode;
        }
    }

    private Node<K> search(K searchNode) {
        Node<K> temp = head;
        Node<K> nodeFound = null;

        while(temp != null){
            if(temp.key == searchNode){
                nodeFound = temp;
                break;
            }
            temp = temp.next;
        }
        return nodeFound;
    }
}
