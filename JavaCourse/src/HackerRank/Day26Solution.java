package HackerRank;

import java.time.LocalDate;
import java.util.Scanner;

public class Day26Solution {

	public static void main(String[] args) {
		LibraryBook book = new LibraryBook();
		Scanner in = new Scanner(System.in);
		int fine  = LibraryBook.calculateFine(Integer.parseInt(in.next()), Integer.parseInt(in.next()), Integer.parseInt(in.next()), 
				Integer.parseInt(in.next()), Integer.parseInt(in.next()), Integer.parseInt(in.next()));
		System.out.println(fine);
		in.close();
	}
}

class LibraryBook {
	public static int calculateFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int res = 0;
		LocalDate expectDate = LocalDate.of(y2, m2, d2);
		LocalDate returnDate = LocalDate.of(y1, m1, d1);

	        if (returnDate.isEqual(expectDate) || returnDate.isBefore(expectDate)) {
	            res = 0;
	        } else if (returnDate.getMonth() == expectDate.getMonth() && returnDate.getYear() == expectDate.getYear()) {
	            res = 15 * (returnDate.getDayOfMonth() - expectDate.getDayOfMonth());
	        } else if (returnDate.getYear() == expectDate.getYear()) {
	            res = 500 * (returnDate.getMonthValue() - expectDate.getMonthValue());
	        } else {
	            res = 10000;
	        }
		
		return res;
	}
}
