package classWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import classWork.LinkedList1.Node1;

public class Occurences {
	Node head;

	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 2 };
//		Map<Integer, Integer> map = new HashMap();
//
//		for (int i : arr) {
//			if (!map.containsKey(i)) {
//				map.put(i, 1);
//			} else {
//				map.put(i, map.get(i) + 1);
//			}
//		}
//		boolean good = true;
//		ArrayList<Integer> list = new ArrayList(map.values()); 
//		for (int i = 0; i < list.size(); i++) {
//			int temp = list.get(i);
//			list.remove(i);
//			if (list.contains(temp)) {
//				System.out.println("no");
//				good = false;
//				break;
//			}
//		}
//		if (good) {
//			System.out.println("yes");
//		}
//		for (int i : map.keySet()) {
//			System.out.println(i + " " + map.get(i));
//		}
		
//_________________________________________________________________________________
		
		Occurences list = new Occurences();
		list = Occurences.insert(list, 1);
		list = Occurences.insert(list, 2);
		list = Occurences.insert(list, 12);
		list = Occurences.insert(list, 2);
		list = Occurences.insert(list, 121);
		list = Occurences.insert(list, 21);
		printList(list);
	}

	public static Occurences insert(Occurences list, int val) {
		new Occurences();
		Node node = new Node(val);
		node.next = null;

		if (list.head == null) {
			list.head = node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}

	public Occurences insertion1(Occurences list, int data) {
		new Node(data);
		return list;
	}

	public static void printList(Occurences list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.val + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}
}