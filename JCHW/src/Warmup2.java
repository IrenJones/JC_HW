
public class Warmup2 {

	public String stringTimes(String str, int n) {
		String res = "";
		for (int i = 0; i < n; i++) {
			res += str;
		}
		return res;
	}

	public String frontTimes(String str, int n) {
		String res = "";
		String substr;
		if (str.length() > 3) {
			substr = str.substring(0, 3);
		} else {
			substr = str;
		}
		for (int i = 0; i < n; i++) {
			res += substr;
		}
		return res;
	}

	int countXX(String str) {
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (flag) {
				if (str.charAt(i) == 'x')
					count++;
				else
					flag = false;
			}
			if (str.charAt(i) == 'x') {
				flag = true;
			}
		}
		return count;
	}

	boolean doubleX(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1 && str.charAt(i) == 'x') {
				if (str.charAt(i + 1) == 'x')
					return true;
				else
					return false;
			}
		}
		return false;
	}

	public String stringBits(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0)
				res += str.charAt(i);
		}
		return res;
	}

	public String stringSplosion(String str) {
		String res = "";
		String cur = "";
		for (int i = 0; i < str.length() - 1; i++) {
			cur += str.charAt(i);
			res += cur;
		}
		return res + str;
	}

	public int last2(String str) {
		if (str.length() <= 3) {
			return 0;
		}
		String find_me = str.substring(str.length() - 2, str.length());
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals(find_me))
				count++;
		}
		return count;
	}

	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9)
				count++;
		}
		return count;
	}

	public boolean arrayFront9(int[] nums) {
		int n = 4;
		if (nums.length < 4)
			n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 9)
				return true;
		}
		return false;
	}

	public boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1)
				if (nums[i + 1] == 2)
					if (nums[i + 2] == 3)
						return true;
		}
		return false;
	}

	public int stringMatch(String a, String b) {
		String ss = "";
		String s = "";
		String cur = "";
		int count = 0;
		if (a.length() > b.length()) {
			ss = a;
			s = b;
		} else {
			ss = b;
			s = a;
		}
		for (int i = 0; i < ss.length() - 1; i++) {
			cur = ss.substring(i, i + 2);
			for (int j = 0; j < s.length() - 1; j++) {
				if (s.substring(j, j + 2).equals(cur) && j == i)
					count++;
			}
		}
		return count;
	}

	public String stringX(String str) {
		if (str.length() <= 2)
			return str;
		String s = "" + str.charAt(0);
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != 'x')
				s += str.charAt(i);
		}
		s = s + str.charAt(str.length() - 1);
		return s;
	}

	public String altPairs(String str) {
		String s = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (count <= 1) {
				count++;
				s += str.charAt(i);
			} else {
				count = 0;
				i++;
			}
		}
		return s;
	}

	public String stringYak(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'y') {
				if (i + 2 < str.length() && str.charAt(i + 2) == 'k') {
					i = i + 2;
				} else {
					s += str.charAt(i);
				}
			} else {
				s += str.charAt(i);
			}
		}
		return s;
	}

	public int array667(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				if (i + 1 < nums.length && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
					count++;
				}
			}
		}
		return count;
	}

	public boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
				return false;
		}
		return true;
	}

	public boolean has271(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] + 5 == nums[i + 1]) && (Math.abs((nums[i + 2] - nums[i] + 1)) <= 2))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Second task!");
	}
}
