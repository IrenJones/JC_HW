package HackerRank;

import java.util.Scanner;

public class Day11Solution {
	private static final int GLOBAL_MIN = 7*(-9);

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int locMax = 0;
		int globMax = GLOBAL_MIN;
		
		for (int i=0;i<4;i++){
			for (int j =0;j<4;j++){
				locMax = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
						+ arr[i+1][j+1] 
								+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				globMax = locMax > globMax? locMax:globMax;
						
			}
		}
		System.out.println(globMax);
		
		in.close();
	}
}
