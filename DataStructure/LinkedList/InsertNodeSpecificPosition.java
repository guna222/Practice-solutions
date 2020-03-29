static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
            SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
            int count =0;
            SinglyLinkedListNode temp = head;
            while(temp!=null)
            {
                if((position-1) == count )
                {
                    newnode.next = temp.next;
                    temp.next=newnode;
                }
                temp = temp.next;
                count++;
            }
            return head;

    }
