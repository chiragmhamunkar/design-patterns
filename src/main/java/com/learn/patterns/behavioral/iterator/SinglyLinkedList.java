package com.learn.patterns.behavioral.iterator;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator<>(head.next);
    }

    public static class Node<T>{
        T value;
        Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head = new Node(null, null);
    private Node tail = head;

    private void insert(T value){
        Node node = new Node(value, null);
        tail.next = node;
        tail = node;
    }


    public class NodeIterator<T> implements Iterator<T>{

        Node cur;
        NodeIterator(Node head){
            cur = head;
        }

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public T next() {
            Node next = cur;
            cur = cur.next;
            return (T) next.value;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------- For each ----------");
        list.forEach(System.out :: println);
    }

}
