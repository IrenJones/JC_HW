package HackerRank;

import java.util.Scanner;

public class Day14Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		in.close();
		
		Difference d = new Difference(a);
		d.computeDifference();
		System.out.println(d.maximumDifference);
	}
}

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] el) {
		elements = new int[el.length];
		for (int i = 0; i < el.length; i++) {
			this.elements[i] = el[i];
		}
	}

	public void computeDifference() {
		for (int i = 0; i < this.elements.length; i++) {
			for (int j = i + 1; j < this.elements.length; j++) {
				if (Math.abs(this.elements[i] - this.elements[j]) > this.maximumDifference) {
					this.maximumDifference = Math.abs(this.elements[i] - this.elements[j]);
				}
			}
		}
	}
}
