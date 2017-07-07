package homework20170704;

public class Array2 {

	public int countEvens(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int bigDiff(int[] nums) {
		int mini = nums[0];
		int maxi = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < mini) {
				mini = nums[i];
			}
			if (nums[i] > maxi) {
				maxi = nums[i];
			}
		}
		return maxi - mini;
	}

	public int centeredAverage(int[] nums) {
		int mini = 0;
		int maxi = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[mini]) {
				mini = i;
			}
			if (nums[i] >= nums[maxi]) {
				maxi = i;
			}
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i != mini && i != maxi) {
				sum += nums[i];
			}
		}
		return sum / (nums.length - 2);
	}

	public int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
			} else {
				sum += nums[i];
			}
		}
		return sum;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				flag = true;
			}
			if (flag == false) {
				sum += nums[i];
			}
			if (nums[i] == 7) {
				flag = false;
			}
		}
		return sum;
	}

	public boolean has22(int[] nums) {
		boolean res = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && nums[i] == 2) {
				res = true;
				break;
			}
		}
		return res;
	}

	public boolean lucky13(int[] nums) {
		boolean res = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				res = false;
				break;
			}
		}
		return res;
	}

	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				sum += nums[i];
			}
		}
		return sum == 8 ? true : false;
	}

	public boolean more14(int[] nums) {
		int numbOne = 0;
		int numbFour = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				numbOne++;
			}
			if (nums[i] == 4) {
				numbFour++;
			}
		}
		return numbOne > numbFour ? true : false;
	}

	public int[] fizzArray(int n) {
		int[] res = new int[n];
		for (int i = 1; i < n; i++) {
			res[i] = i;
		}
		return res;
	}

	public boolean only14(int[] nums) {
		boolean res = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				res = false;
				break;
			}
		}
		return res;
	}

	public String[] fizzArray2(int n) {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = Integer.toString(i);
		}
		return res;
	}

	public boolean no14(int[] nums) {
		boolean res = true;
		int numbOne = 0;
		int numbFour = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				numbOne++;
			}
			if (nums[i] == 4) {
				numbFour++;
			}
		}
		if (numbOne != 0 && numbFour != 0) {
			res = false;
		}
		return res;
	}

	public boolean isEverywhere(int[] nums, int val) {
		boolean res = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val) {
				res = false;
				break;
			}
		}
		return res;
	}

	public boolean either24(int[] nums) {
		boolean containstwo = false;
		boolean containsfour = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				containstwo = true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				containsfour = true;
			}
		}
		return containstwo ^ containsfour;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int res = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
				res++;
			}
		}
		return res;
	}

	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7) {
				if (nums[i + 1] == 7) {
					return true;
				} else if (i + 2 < nums.length && nums[i + 2] == 7) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean has12(int[] nums) {
		boolean flag = false;
		boolean res = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && flag == true) {
				res = true;
			}
			if (nums[i] == 1) {
				flag = true;
			}
		}
		return res;
	}

	public boolean modThree(int[] nums) {
		boolean res = false;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0
					|| nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
				res = true;
				break;
			}
		}
		return res;
	}

	public boolean twoTwo(int[] nums) {
		boolean res = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				if (i >= 1 && nums[i - 1] == nums[i]) {
					res = true;
				} else {
					res = false;
				}
			}
		}
		return res;
	}

	public boolean sameEnds(int[] nums, int len) {
		boolean res = true;
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - len + i]) {
				res = false;
				break;
			}
		}
		return res;
	}

	public boolean tripleUp(int[] nums) {
		boolean res = false;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 2] == nums[i + 1] + 1 && nums[i + 1] == nums[i] + 1) {
				res = true;
				break;
			}
		}
		return res;
	}

	public int[] fizzArray3(int start, int end) {
		int[] res = new int[end - start];
		for (int i = 0; i < res.length; i++) {
			res[i] = start + i;
		}
		return res;
	}

	public int[] shiftLeft(int[] nums) {
		if (nums.length >= 2) {
			int first = nums[0];
			for (int i = 0; i < nums.length - 1; i++) {
				nums[i] = nums[i + 1];
			}
			nums[nums.length - 1] = first;
		}
		return nums;
	}

	public int[] tenRun(int[] nums) {
		int value = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				value = nums[i];
				flag = true;
			}
			if (flag == true) {
				nums[i] = value;
			}
		}
		return nums;
	}

	public int[] pre4(int[] nums) {
		int index = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				index = i;
				break;
			}
		}
		int[] res = new int[index];
		for (int i = 0; i < index; i++) {
			res[i] = nums[i];
		}
		return res;
	}

	public int[] post4(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				index = i;
			}
		}
		int[] res = new int[nums.length - index - 1];
		for (int i = 0; i < nums.length - index - 1; i++) {
			res[i] = nums[index + i + 1];
		}
		return res;
	}

	public int[] notAlone(int[] nums, int val) {
		for (int i = 0; i < nums.length; i++) {
			if ((i != 0 && i != nums.length - 1) && val == nums[i] && nums[i - 1] != val && nums[i + 1] != val) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
		return nums;
	}

	public int[] zeroFront(int[] nums) {
		int count = 0;
		int val = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			} else {
				val = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (i < count) {
				nums[i] = 0;
			} else {
				nums[i] = val;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		System.out.println("");
	}
}
