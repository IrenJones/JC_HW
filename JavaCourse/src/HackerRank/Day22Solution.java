package HackerRank;

import java.util.Scanner;

public class Day22Solution {
	
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

	public static int getHeight(Node root) {
		int result = -1;
		if (root != null) {
			int lHeight = getHeight(root.left);
			int rHeight = getHeight(root.right);

			result = Math.max(lHeight, rHeight) + 1;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while (n-- > 0) {
			root = insert(root, sc.nextInt());
		}
		System.out.println(getHeight(root));
		sc.close();
	}

}
