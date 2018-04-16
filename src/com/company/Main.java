package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {


//        Node c = new Node(10,null);
//        System.out.println(c);
//        Node b = new Node(20,c);
//        System.out.println(b);
//        Node a = new Node(30,b);
//        System.out.println("LinkedList: " + a);

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println(n1.getData());
        System.out.println(n2.getData());
        System.out.println(n3.getData());
        System.out.println();

        n1.setNext(n2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println();

        n2.setNext(n3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println();

        Random random = new Random();
        int num = random.nextInt(5);

        Node head = create(num);
        System.out.println(head);

    }

    public static Node create(int num) {
        
    }
}
