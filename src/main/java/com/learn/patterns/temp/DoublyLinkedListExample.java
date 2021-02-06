package com.learn.patterns.temp;

public class DoublyLinkedListExample {
    static class DoublyLinkedList<T> {

        static class Node<T>{
            T data;
            Node prev;
            Node next;
            public Node(T data){
                this.data = data;
            }
        }

        Node head;
        Node tail;

        public DoublyLinkedList(){
            head = new Node(null);
            tail = new Node(null);
            head.next = tail;
            tail.prev = head;
        }

        public Node removeNode(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            return node;
        }

        public Node appendFirst(T data){
            return appendFirst(new Node(data));
        }
        public Node appendFirst(Node node){
            Node firstNode = head.next;
            firstNode.prev = node;
            node.next = firstNode;
            node.prev = head;
            head.next = node;
            return  node;
        }

        public Node appendLast(T data){
            return appendLast(new Node(data));
        }
        public Node appendLast(Node node){
            Node lastNode = tail.prev;
            lastNode.next = node;
            node.prev = lastNode;
            node.next = tail;
            tail.prev = node;
            return node;
        }

        public Node getFirstNode(){
            if(isEmpty()) return null;
            return head.next;
        }

        public boolean isEmpty(){
            return head.next == tail;
        }

        public void print(){
            Node cur = head.next;
            while(cur != tail){
                System.out.print(cur.data.toString() + " ");
                cur = cur.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        DoublyLinkedList.Node<Integer> first = doublyLinkedList.appendFirst(1);

        doublyLinkedList.appendFirst(2);
        doublyLinkedList.print();
        doublyLinkedList.appendLast(3);
        doublyLinkedList.print();
        doublyLinkedList.removeNode(first);
        doublyLinkedList.print();
    }
}
