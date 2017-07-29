package HackerRank;

import java.util.Scanner;

public class Day17Solution {
	static class Calculator{
	    
	    int power(int a ,int b) throws Exception{
	        if (a>0 && b >0){
	            return (int)Math.pow(a,b);
	        }
	        else {
	         throw new Exception("n and p should be non-negative");
	        }
	    }
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator c = new Calculator();
			try{
				int ans = c.power(n,p);
				System.out.println(ans);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		in.close();
	}
}
