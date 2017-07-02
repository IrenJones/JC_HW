package homework20170701;

public class SumArray {

	public static int findSum(int[][] arr) {
		int sum = 0;
		int locSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int[] row = arr[i];
			for (int j = 0; j < row.length; j++) {
				if (row[j] < 0){
					locSum =0;
					break;
				}
				else{
					locSum+=row[j];
				}
			}
			sum+=locSum;
			locSum=0;
		}
		return sum;
	}

}
