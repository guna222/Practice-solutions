// DeleteNOde.java - (insert one line description here)
// (C) Copyright 2020 Hewlett Packard Enterprise Development LP

package LinkedListParactice;

/**
 *
 */
public class DeleteNode
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

    static Node delete(int position)
    {
        Node temp = head;
        int count = 1;
        while (temp != null)
        {
            if (position == count)
            {
                temp.next = temp.next.next;
            }

            temp = temp.next;
            count++;
        }
        return head;
    }
    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(5);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(20);
        Node nt = delete(2);
        System.out.println();
    }
}
