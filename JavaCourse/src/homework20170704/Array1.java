package homework20170704;

public class Array1 {

	public boolean firstLast6(int[] nums) {
		boolean result = false;
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			result = true;
		}
		return result;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public int[] rotateLeft3(int[] nums) {
		int tmp = 0;
		tmp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = tmp;
		return nums;
	}

	public int[] reverse3(int[] nums) {
		int tmp = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			tmp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = tmp;
		}
		return nums;
	}

	public int[] maxEnd3(int[] nums) {
		int maxi = nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = maxi;
		}
		return nums;
	}

	public int sum2(int[] nums) {
		int sum = 0;
		if (nums.length == 1) {
			sum += nums[0];
		} else if (nums.length >= 2) {
			sum = nums[0] + nums[1];
		}
		return sum;
	}

	public int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };
	}

	public int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}

	public boolean has23(int[] nums) {
		boolean res = false;
		for (int i = 0; i < 2; i++) {
			if (nums[i] == 2 || nums[i] == 3) {
				res = true;
				break;
			}
		}
		return res;
	}

	public boolean no23(int[] nums) {
		boolean res = true;
		for (int i = 0; i < 2; i++) {
			if (nums[i] == 2 || nums[i] == 3) {
				res = false;
				break;
			}
		}
		return res;
	}

	public int[] makeLast(int[] nums) {
		int[] res = new int[2 * nums.length];
		res[res.length - 1] = nums[nums.length - 1];
		return res;
	}

	public boolean double23(int[] nums) {
		boolean res = false;
		if (nums.length == 2) {
			if (nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3)) {
				res = true;
			}
		}
		return res;
	}

	public int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 3) {
				nums[i + 1] = 0;
			}
		}
		return nums;
	}

	public int start1(int[] a, int[] b) {
		int result = 0;
		if (a.length > 0) {
			result += a[0] == 1 ? 1 : 0;
		}
		if (b.length > 0) {
			result += b[0] == 1 ? 1 : 0;
		}
		return result;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int[] res;
		int sumFirst = 0;
		int sumSec = 0;
		for (int i = 0; i < a.length; i++) {
			sumFirst += a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sumSec += b[i];
		}
		if (sumFirst >= sumSec) {
			res = a;
		} else {
			res = b;
		}
		return res;
	}

	public int[] makeMiddle(int[] nums) {
		int[] res = new int[2];
		int middle = nums.length / 2 - 1;
		for (int i = middle, j = 0; i < middle + 2; i++, j++) {
			res[j] = nums[i];
		}
		return res;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++, k++) {
			res[k] = a[i];
		}
		for (int i = 0; i < a.length; i++, k++) {
			res[k] = b[i];
		}
		return res;
	}

	public int[] swapEnds(int[] nums) {
		int tmp = nums[nums.length - 1];
		nums[nums.length - 1] = nums[0];
		nums[0] = tmp;
		return nums;
	}

	public int[] midThree(int[] nums) {
		int[] res = new int[3];
		int middle = nums.length / 2 - 1;
		for (int i = middle, k = 0; i < middle + 3; i++, k++) {
			res[k] = nums[i];
		}
		return res;
	}

	public int maxTriple(int[] nums) {
		int res = nums[0];
		int middle = nums.length / 2;
		if (res < nums[middle]) {
			res = nums[middle];
		}
		if (res < nums[nums.length - 1]) {
			res = nums[nums.length - 1];
		}
		return res;
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length < 2) {
			return nums;
		} else {
			int res[] = new int[2];
			res[0] = nums[0];
			res[1] = nums[1];
			return res;
		}
	}

	public boolean unlucky1(int[] nums) {
		boolean result = false;
		if (nums.length >= 2) {
			C: for (int i = 0; i < nums.length - 1; i++) {
				if (i > 1 && i < nums.length - 2) {
					continue C;
				} else {
					if (nums[i] == 1 && nums[i + 1] == 3) {
						result = true;
					}
				}
			}
		}
		return result;
	}

	public int[] make2(int[] a, int[] b) {
		int[] res = new int[2];
		int k = 0;
		for (int i = 0; i < a.length && k < 2; i++, k++) {
			res[k] = a[i];
		}
		for (int i = 0; i < b.length && k < 2; i++, k++) {
			res[k] = b[i];
		}
		return res;
	}

	public int[] front11(int[] a, int[] b) {
		int size = 0;
		if (a.length >= 1) {
			size++;
		}
		if (b.length >= 1) {
			size++;
		}
		if (size == 2) {
			return new int[] { a[0], b[0] };
		} else if (size == 1) {
			if (a.length >= 1) {
				return new int[] { a[0] };
			} else {
				return new int[] { b[0] };
			}
		} else {
			return new int[] {};
		}
	}

	public static void main(String[] args) {
		System.out.println("");
	}
}
