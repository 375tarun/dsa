import java.util.*;
public class queueFromStack {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	public void enQueue(int x)
	{
		
		while (!s1.isEmpty())
		{
			s2.push(s1.pop());			
		}
		s1.push(x);
		while (!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	public int deQueue()
	{
		if (s1.isEmpty())
		{
			System.out.println("Q is Empty");
			System.exit(0);
		}
		int x = s1.peek();
		s1.pop();
		return x;
	}


public static void main(String[] args)
{
	queueFromStack q = new queueFromStack();
	q.enQueue(67);
	q.enQueue(78);
	q.enQueue(45);
    q.enQueue(66);

	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
    System.out.println(q.deQueue());
}
}

