package HackerRank;

import java.util.Scanner;

public class Day12Solution {
	
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String fn = in.next();
	String ln = in.next();
	int id = in.nextInt();
	int numScores = in.nextInt();
	int [] testScores = new int[numScores];
	for(int i = 0; i< numScores; i++){
		testScores[i] = in.nextInt();
	}
	StudentDay12 st = new StudentDay12(fn, ln, id, testScores);
	st.printPerson();
	System.out.println("Grade: " + st.calculate());
	in.close();
	}
}
