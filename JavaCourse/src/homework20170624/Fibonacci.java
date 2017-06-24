package homework20170624;

public class Fibonacci {

	public static boolean isFibonacci(int n) {
		if (n <=1 && n>=0)
			return true;
		else{
			int f = 1;
			int s = 1;
			int tmp;
			while (s<=n){
				if (s==n)
					return true;
				else{
					tmp = s;
					s+=f;
					f = tmp;
				}
			}
			return false;
		}
	}

}
