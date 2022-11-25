// inserting elements at start of linked list
class LList
{
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
       
        LList llist = new LList();

        llist.push(6);
        llist.push(7);
        llist.push(1);
        llist.push(4);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
}


