package homework20170701;

import firstframework.SimpleUnit;

public class TestSumArray {
	public static void main(String [] args){
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] arrSec = {{1,2,3},{4,5,-6},{7,-8,9}};
		int [][] arrTr = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
		
		System.out.println(SimpleUnit.assertEquals(SumArray.findSum(arr), 45));	
		System.out.println(SimpleUnit.assertEquals(SumArray.findSum(arrSec), 6));
		System.out.println(SimpleUnit.assertEquals(SumArray.findSum(arrTr), 0));
		
		System.out.println(SimpleUnit.assertNotEquals(SumArray.findSum(arr), 6));
	}
}
