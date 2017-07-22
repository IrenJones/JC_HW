package HackerRank;

import java.util.Scanner;

public class Day10Solution {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	StringBuilder res = new StringBuilder();
        while(n > 0){
        	res.append(n%2);
        	n = n/2;
        }
        int lMax = 0;
        int lcur = 0;
        boolean flag = false;
        for(int i=0;i<res.length();i++){
        	if (flag && res.charAt(i) == '1'){
        		lcur++;
        	}
        	else{
        		if (flag == false && res.charAt(i) == '1'){
        			lcur++;
        			flag = true;
        		}
        		else{
        			flag = false;
        			lMax = Math.max(lMax, lcur);
        			lcur  = 0;
        		}
        	}
        }
        if (flag){
        	lMax = Math.max(lMax, lcur);
        }
        System.out.println(lMax);
        sc.close();
      }
}
