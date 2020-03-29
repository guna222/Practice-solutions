// LinkedListLoop.java - (insert one line description here)
// (C) Copyright 2020 Hewlett Packard Enterprise Development LP

package TreeDataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class LinkedListLoop
{
    static Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    static boolean LinklistTravel()
    {
        List<Node> li = new ArrayList<Node>();
        while (head != null)
        {
            System.out.println(head.data);
            if (li.contains(head))
            {
                head = null; // if u want remove loop
               return true;
            }
            li.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args)
    {

        head = null;
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(12);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = head.next.next;

        if (LinklistTravel())
        {
            System.out.println("Loop found");
            if (head == null)
            {
                System.out.println("loop removed with  " + head);
            }
        }
        else
        {
            System.out.println("No Loop");
        }
    }

}
