public class TialandHeadNodeInsert
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

    static void display()
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static void displayTailNode(int data)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
            if (head == null)
            {
                head = new Node(99);
                System.out.println(head.data);
                head = head.next;
            }
        }

    }

    static Node returnTailNode(int data)
    {
        if (head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node newnode = head;
            while (newnode.next != null)
            {
                newnode = newnode.next;
            }
            newnode.next = new Node(data);

        }
        return head;
    }

    static Node returnHeadNode(int data)
    {
        Node newnode = new Node(data);
        if (head == null)
        {
            head = new Node(data);
        }
        else
        {
            newnode.data = data;
            newnode.next = head;
        }
        return newnode;
    }
    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(12);
        head.next.next.next = new Node(6);
        display();
        displayTailNode(99);//Display Tail Node Insert
        returnTailNode(99);//Return tain Node Insert
        returnHeadNode(99);//Return Head Node Insert

    }
}
