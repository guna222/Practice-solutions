// ReverseLL.java - (insert one line description here)
// (C) Copyright 2020 Hewlett Packard Enterprise Development LP

package LinkedListParactice;


/**
 *
 */
public class ReverseLL
{
    static Node head;

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    static Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(5);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(20);
        Node nt = reverse();
        System.out.println();
    }
}
