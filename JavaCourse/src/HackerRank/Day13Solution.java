package HackerRank;


import java.util.Scanner;

public class Day13Solution {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		sc.close();
		
		Book book = new MyBook(title, author, price);
		book.display();
	}
}
