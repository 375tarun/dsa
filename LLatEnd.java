public class LLatEnd {
  
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

    public void pushatend(int new_data)
    {
        Node tnode = head;
        while(tnode.next != null){
            tnode = tnode.next;
        }
        Node new_node = new Node(new_data);
        tnode.next = new_node;
        tnode = tnode.next;
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
       
        LLatEnd llist = new LLatEnd();

        llist.push(6);
        llist.pushatend(7);
        llist.pushatend(1);
        llist.pushatend(4);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
}
