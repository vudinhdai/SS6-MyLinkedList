package com.company;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList mylinkedList = new MyLinkedList(10);
        mylinkedList.addFirst(5);
        mylinkedList.addFirst(4);
        mylinkedList.add(1, 6);
        mylinkedList.printList();
    }


}
