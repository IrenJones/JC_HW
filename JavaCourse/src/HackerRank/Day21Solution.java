package HackerRank;

import java.util.Scanner;

public class Day21Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = in.nextInt();
		}

		n = in.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = in.next();
		}

		Printer<Integer> intPrinter = new Printer<>();
		Printer<String> stringPrinter = new Printer<>();
		
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		
		in.close();
	}
}

class Printer<T> {
	public <E> void printArray(E[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
