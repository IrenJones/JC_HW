package HackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18Solution {
	
	public static class Solution{
		Stack <Character> stack = new Stack<>();
		Queue <Character> q = new LinkedList<Character>();

		public void pushCharacter(char c) {
			stack.push(c);
		}

		public void enqueueCharacter(char c) {
			q.add(c);
			
		}

		public char popCharacter() {	
			return stack.pop();
		}

		public char dequeueCharacter() {
			return q.remove();
		}
		
	}
	
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		char[]s = input.toCharArray();
		
		Solution p = new Solution();
		
		for(char c:s){
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}
		
		boolean isPalindrome = true;
		for (int i=0;i<s.length/2;i++){
			if (p.popCharacter() != p.dequeueCharacter()){
				isPalindrome = false;
				break;
				
			}
		}
		
		System.out.println(isPalindrome);
	}
}
