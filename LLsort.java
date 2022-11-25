public class LLsort {
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

    public void sort(){
        boolean flag;
        Node tnode;
        if(head == null){
            return;
        }

        do{
            flag = false;
            tnode = head;
            while(tnode.next != null)
            {
                if(tnode.data > tnode.next.data){
                    swap(tnode, tnode.next);
                    flag = true; 
                }
                tnode = tnode.next;
            }
        }while(flag);
    }

    public void swap(Node a, Node b)
    {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
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
       
        LLsort llist = new LLsort();

        llist.push(6);
        llist.push(7);
        llist.push(1);
        llist.push(4);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.sort();
        System.out.println("\nSorted Linked list is: ");
        llist.printList();
    }
}
