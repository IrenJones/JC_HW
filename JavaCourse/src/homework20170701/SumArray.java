package homework20170701;

public class SumArray {

	public static void findSum(int[][] arr) {
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
			System.out.println(locSum);
			locSum=0;
		}
	}
}
