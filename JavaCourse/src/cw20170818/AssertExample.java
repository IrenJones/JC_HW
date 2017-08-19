package cw20170818;

import java.util.Scanner;

public class AssertExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		assert n>0 : "Less zero!";
		
		System.out.println("I am " + n);
		
	}

}
