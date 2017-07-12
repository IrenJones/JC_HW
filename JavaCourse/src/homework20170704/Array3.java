package homework20170704;

public class Array3 {

	public int maxSpan(int[] nums) {
		int maxi = 0;
		int left = 0;
		int right = 0;
		int element;
		for (int i = 0; i < nums.length; i++) {
			element = nums[i];
			left = i;
			right = i;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					if (j < left) {
						left = j;
					}
					if (j > right) {
						right = j;
					}
				}
			}
			if (maxi < right - left + 1) {
				maxi = right - left + 1;
			}
		}

		return maxi;
	}

	public int[] fix34(int[] nums) {
		int tmp = 0;
		int prev = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i + 1] != 4) {
				for (int j = prev; j < nums.length; j++) {
					if (nums[j] == 4 && nums[j - 1] != 3) {
						tmp = nums[i + 1];
						nums[i + 1] = nums[j];
						nums[j] = tmp;
						prev = j;
						break;
					}
				}
			}
		}
		return nums;
	}

	public int[] fix45(int[] nums) {
		int tmp = 0;
		int prev = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 4 && nums[i + 1] != 4) {
				for (int j = prev; j < nums.length; j++) {
					if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
						tmp = nums[i + 1];
						nums[i + 1] = nums[j];
						nums[j] = tmp;
						prev = j;
						break;
					}
				}
			}
		}
		return nums;
	}

	public boolean canBalance(int[] nums) {
		boolean result = false;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j <= i) {
					sum1 += nums[j];
				} else {
					sum2 += nums[j];
				}
			}
			if (sum1 == sum2) {
				result = true;
				break;
			} else {
				sum1 = 0;
				sum2 = 0;
			}
		}
		return result;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		boolean res = false;
		int count = 0;
		int j = 0;
		if (inner.length == 0) {
			res = true;
		} else {
			for (int i = 0; i < outer.length && j < inner.length; i++) {
				if (outer[i] == inner[j]) {
					j++;
					count++;
				}
			}
			if (count == inner.length) {
				res = true;
			}
		}
		return res;
	}

	public int[] squareUp(int n) {
		int[] arr = new int[n * n];
		int c = n * n - 1;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - i - 1; j < n; j++) {
				arr[c - n + j + 1] = n - j;
			}
			c -= n;
		}
		return arr;
	}

	public int[] seriesUp(int n) {
		int[] r = new int[n * (n + 1) / 2];
		int k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				r[k] = j;
				k++;
			}
		}
		return r;
	}

	public int countClumps(int[] nums) {
		int c = 0;
		int res = 0;
		boolean f = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					if (f == false) {
						f = true;
						res++;
					}
					c = nums[j];
				}
				if (nums[j] != c) {
					f = false;
					break;
				}
				i = j;
			}
		}
		return res;
	}

	public static int maxMirror(int[] nums) {
		int res = 1;
		int curres = 1;
		boolean flag = false;
		int index;

		if (nums.length == 0) {
			res = 0;
		} else {
			for (int i = 0; i < nums.length; i++) {
				curres = 1;
				index = i;

				for (int j = nums.length - 1; j >= 0 && index < nums.length; j--) {
					if (flag == false && nums[index] == nums[j]) {
						flag = true;
						index++;
					} else if (flag == true && nums[index] == nums[j]) {
						curres++;
						index++;
						res = (curres > res) ? curres : res;

					} else if (flag == true && nums[i] != nums[j]) {
						flag = false;
						index = i;
						curres = 1;
					} else if (j - index <= 1) {
						flag = false;
						break;
					}

				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] r = { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 };
		System.out.println(maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 }));
	}
}
