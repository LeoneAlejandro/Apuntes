package com.leonealejandro;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Main {
    public static Node insert(Node head,int data) {
        Node nodo = new Node(data);
        nodo.next = head;
        return nodo;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
