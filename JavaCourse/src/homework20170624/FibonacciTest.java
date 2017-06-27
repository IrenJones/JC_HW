package homework20170624;

import firstframework.SimpleUnit;

public class FibonacciTest {
	public static void main(String[] args){
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(34), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(10946), true));
		
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(1), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(0), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(-13), false));
		
		System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(13), false));
		System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(54), true));
		System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(-13), true));
	}
	
}
