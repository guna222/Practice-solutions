public class InsertLLatMid
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

    static void insertMidLL(int x)
    {

        if (head == null)
        {
            head = new Node(x);
        }
        else
        {
            Node newNode = new Node(x);
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            slow.next = newNode;
            System.out.println(head);
        }
    }
    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(12);
        head.next.next.next = new Node(34);
        head.next.next.next.next = new Node(44);
        head.next.next.next.next.next = new Node(16);

        Node temp = head;
        int count = 0;
        while (head != null)
        {
            head = head.next;
            count++;
        }
        int midoflinklist = count / 2;
        //int midoflinklist = ((count % 2) == 0) ? (count / 2) : (count + 1) / 2;
        int loop = 1;
        System.out.println("midoflinklist   " + midoflinklist);

        while (temp != null)
        {
            if (loop == midoflinklist)
            {
                Node newNode = new Node(99);
                newNode.next = temp.next;
                temp.next = newNode;

            }

            System.out.println(temp.data);
            temp = temp.next;
            loop++;

        }

    }

}
