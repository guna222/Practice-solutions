public class PrintLLNode
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
    
    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(12);
        head.next.next.next = new Node(6);
        display();
    }


}
