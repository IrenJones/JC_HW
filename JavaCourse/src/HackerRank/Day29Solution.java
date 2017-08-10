package HackerRank;

import java.util.Scanner;

public class Day29Solution {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int N, k;
		for (int i = 0; i < n; i++) {
			N = in.nextInt();
			k = in.nextInt();
			System.out.println(findMaxi(N, k));
		}
		in.close();
	}
    /*  Another solution
	private static int findMaxi(int N, int k) {
		int res = 0;
		 if(((k-1)|k) > N && k%2==0){
             res = k-2;
         }else{
             res = k-1;               
         }
		return res;
	}
    */
	private static int findMaxi(int N, int k) {
		int res = 0;
		for (int i = 1; i < N; i++) {
			for (int j = i + 1; j <= N; j++) {
				int tmp = i & j;
				if (tmp < k && tmp > res) {
					res = tmp;
				}
			}
		}
		return res;
	}
	
}
