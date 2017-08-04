package HackerRank;

import java.util.LinkedList;
import java.util.Scanner;

public class Day23Solution {

	static class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node current;
			if (data <= root.data) {
				current = insert(root.left, data);
			} else {
				current = insert(root.right, data);
			}
			return root;
		}
	}

	static void levelOrder(Node root) {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (queue.size() != 0) {
			root = queue.poll();
			System.out.print(root.data + " ");

			if (root.left != null) {
				queue.add(root.left);
			}
			if (root.right != null) {
				queue.add(root.right);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while (n-- > 0) {
			root = insert(root, sc.nextInt());
		}
		levelOrder(root);
		sc.close();
	}

}
