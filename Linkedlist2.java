package assignments;

//Example2

public class Linkedlist2 {
	static class Node {
		int data;
		Node next;
	}

	/*This function returns true if given linked
	list is circular, else false. */
	static boolean isCircular(Node head)
	{
		// An empty linked list is circular
		if (head == null)
			return true;

		// Next of head
		Node node = head.next;

		// This loop would stop in both cases (1) If
		// Circular (2) Not circular
		while (node != null && node != head)
			node = node.next;

		// If loop stopped because of circular
		// condition
		return (node == head);
	}

	// Utility function to create a new node.
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	/* Driver code*/
	public static void main(String args[])
	{
		/* Start with the empty list */
		Node head = newNode(1);
		head.next = newNode(2);
		
		

		System.out.print(isCircular(head) ? "True\n"
										: "False\n");

		// Making linked list circular
		head.next = head;

		System.out.print(isCircular(head) ? "True\n"
										: "False\n");
	}
}



