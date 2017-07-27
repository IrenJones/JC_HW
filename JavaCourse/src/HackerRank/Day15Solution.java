package HackerRank;

import java.util.Scanner;

public class Day15Solution {

	public static Node insert(Node head, int data) {
		Node node = new Node(data);
		Node start = head;
		if (start != null){
			while (start.next != null) {
				start = start.next;
			}
			start.next = node;
		}
		else{
			head = node;
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node head = null;
		int N = in.nextInt();

		while (N-- > 0) {
			int ele = in.nextInt();
			head = insert(head, ele);
		}
		display(head);
		in.close();
	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
