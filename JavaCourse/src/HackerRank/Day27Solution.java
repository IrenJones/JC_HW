package HackerRank;

import java.util.Random;

public class Day27Solution {
    public static void main(String[] args) {
        int T = 5;
        System.out.println(T);
        Random r = new Random();
        int N,K,tim;
        for (int i=0;i<T;i++){
            N = r.nextInt(199)+1;
            K = r.nextInt(N-1)+1;
            System.out.println(N + " " + K);
            System.out.print(0 + " ");
            for (int j=1;j<N;j++){
                tim = r.nextInt(2000)-1000;
                System.out.print(tim + " ");
            }
            System.out.println();
        }
    }
}
