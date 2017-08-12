package hw20170811;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchAlgo {
	public static void main(String[] args) {

		int n = 10;
		Integer[] arr = new Integer[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(100);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int key = r.nextInt(200);
		System.out.println("key : "+ key + " " + ". index : " + binarySearch(arr, key));
	}

	/**
	 * 
	 * @param arr
	 * @param key
	 * @return index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1)
	 */
	private static int binarySearch(Integer[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > key) {
				end = mid - 1;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		if (start==0 && start>=end){
			return -1;
		}
		if (end == arr.length -1 && start >=end){
			return -(end+1)-1;
		}
		else{
			return -start-1;
		}
	}

}
