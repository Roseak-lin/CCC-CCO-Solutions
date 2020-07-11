package classWork;

public class LinkedList1 {
	Node1 head; // head of list
	/* linked list node */

	static class Node1 {
		int data;
		Node1 next; // Next is by default initialized as null

		Node1(int d) {
			data = d;
		}
	}

	// method to create a Singly linked list with n nodes
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList1 list = new LinkedList1();

		// Insert the values
		list = insertion(list, 1);
		list = insertion(list, 2);
		list = insertion(list, 3);
		list = insertion(list, 4);
		list = insertion(list, 5);
		list = insertion(list, 6);
		list = insertion(list, 9);
		list = insertion(list, 7);
		list = insertion(list, 7);
		list = insertion(list, 8);

		// Print the LinkedList
		printList(list);
	}

	// Method to create a new list and insert a new node
	public static LinkedList1 insertion(LinkedList1 list, int data) {
		// Create a new node with given data
		LinkedList1 ll1 = new LinkedList1();

		Node1 new_node = new Node1(data);

		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse until the last node
			// and insert the new_node there
			Node1 last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}

	public LinkedList1 insertion1(LinkedList1 list, int data) {
		Node1 nd1 = new Node1(data);
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList1 list) {
		Node1 currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}
}
