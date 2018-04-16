package com.company;



public class Main {

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println(n1.getData());
        System.out.println(n2.getData());
        System.out.println(n3.getData());

        n1.setNext(n2);
        n2.setNext(n3);



    }
}
