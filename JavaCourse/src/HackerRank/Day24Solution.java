package HackerRank;

import java.util.Scanner;

public class Day24Solution {

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} 
		Node curr = root;
		
		while(curr.next !=null){
			curr= curr.next;
		}
		curr.next = new Node(data);
		return root;
	}
	
    public static Node removeDuplicates(Node head) {
        Node curr = head;
        Node prev = head;
        if(curr!=null){
            curr = curr.next;
        }
        while(curr!=null){
            if (curr.data == prev.data){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while (n-- > 0) {
			root = insert(root, sc.nextInt());
		}
		root = removeDuplicates(root);
		sc.close();
		display(root);
	}

	private static void display(Node head) {
		Node start = head;
		while(start!=null){
			System.out.print(start.data + " ");
			start = start.next;
		}
		
	}
}
