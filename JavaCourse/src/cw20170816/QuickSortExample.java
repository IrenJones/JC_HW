package cw20170816;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSortExample {

	public static void main(String[] args) {
		int [] arr = new int[]{3,5,7,2,1,5,8,9,13,72,0,0,-3};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		List <Integer> list = new ArrayList<Integer>();
		for (int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
		    arr[i] = list.get(i);
		  } 
		sort(arr, 0, list.size()-1);
		
	}

	private static void sort(int [] a, int lo, int hi) {
		
		if (lo>=hi){
			return;
		}
		int j = partition(a, lo, hi);
		sort(a,lo, j-1);
		sort(a, j+1, hi);
		
	}

	private static int partition(int[] a, int lo, int hi) {
		int i = lo;
		int j= hi+1;
		int v = a[lo];
		
        while (true) { 

            while (a[++i] < v && i <hi) {}

            // find item on hi to swap
            while (v < a[--j] && j>lo){}

            // check if pointers cross
            if (i >= j) {
				break;
			}

            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        // put partitioning item v at a[j]
        a[lo] = a[j];
        a[j] = v;

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
	}

}
