package homework20170624;

public class PrimeTest {
	public static void main(String[] args){
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(11), true));
		System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(11), false));
		
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(11113), true));
		System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(11113), false));
		
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(4), false));
		System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(4), true));
	}
}
