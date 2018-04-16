package com.company;



public class Main {

    public static void main(String[] args) {

        Node c = new Node(12, null);
        Node b = new Node(3,c);
        Node a = new Node(1,b);
        System.out.println(a);

    }
}
