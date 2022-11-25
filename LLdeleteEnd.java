public class LLdeleteEnd {
    Node head; 

	class Node
	{
		int data;
		Node next;
		
		Node(int d) {data = d; next = null; }
	}

    public void push(int new_data)
    {
	    Node new_node = new Node(new_data);
	    new_node.next = head;
	    head = new_node;
    }

    public void deleteEnd()
    {
        Node tnode = head;
        while(tnode.next.next != null){
            tnode = tnode.next;
        }
        tnode.next = null;
    }   
    

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
       
        LLdeleteEnd llist = new LLdeleteEnd();

        llist.push(6);
        llist.push(7);
        llist.push(1);
        llist.push(4);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.deleteEnd();
        System.out.println("\nLinked list is after deletion: ");
        llist.printList();
    }
}
