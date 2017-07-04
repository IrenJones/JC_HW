package homework20170701;

public class TestSumArray {
	public static void main(String [] args){
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] arrSec = {{1,2,3},{4,5,-6},{7,-8,9}};
		int [][] arrTr = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
		
		SumArray.findSum(arr);	
		SumArray.findSum(arrSec);
		SumArray.findSum(arrTr);
	}
}
