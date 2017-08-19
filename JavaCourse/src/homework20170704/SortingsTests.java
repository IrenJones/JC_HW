package homework20170704;

import java.util.Arrays;
import java.util.Random;

public class SortingsTests {
	public static void main(String[] args) {
		int n = 1_000_000;
		int[] arr = new int[n];
		int[] arrSec = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(100);
			arrSec[i] = arr[i];
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.println();
		long start = System.nanoTime();
		radixsort(arr, n);
		long stop = System.nanoTime();
		//System.out.println(Arrays.toString(arr));
		//System.out.println();
		System.out.println(stop-start);
		
		start = System.nanoTime();
		Arrays.sort(arrSec);
		stop = System.nanoTime();
		System.out.println(stop-start);
	}

	private static void radixsort(int[] arr, int n) {
		int maxi = findMax(arr);
		int[] b = new int[n];
		
		for(int exp=1;maxi / exp > 0;exp*=10) {
			int[] count = new int[10];

			// find count of each last digit in arr
			for (int i = 0; i < n; i++) {
				int index = (arr[i] / exp) % 10;
				count[index]++;
			}
			
			// find actual position
			for (int i = 1; i < 10; i++) {
				count[i] += count[i - 1];
			}
			
			//
			for (int i = n - 1; i >= 0; i--) {
				int pos = (arr[i] / exp) % 10;
				count[pos]--;
				int index = count[pos];
				b[index] = arr[i];
			}
			
			// contains sorted numbers according to current digit
			for (int i = 0; i < n; i++) {
				arr[i] = b[i];
			}
		}
	}

	private static int findMax(int[] arr) {
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (result < arr[i]) {
				result = arr[i];
			}
		}
		return result;
	}
}
