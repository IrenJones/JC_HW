package cw20170624;

public class MaxTest {
	public static void main(String [] args){
		
		System.out.println(UnitTest.assertEquals(MathUtils.max(10,20), 20));
		System.out.println(UnitTest.assertNotEquals(MathUtils.max(10,20), 10));
		System.out.println(UnitTest.assertEquals(MathUtils.max(-100,20), 20));
		System.out.println(UnitTest.assertNotEquals(MathUtils.max(-100,20), -100));
		System.out.println(UnitTest.assertEquals(MathUtils.max(Integer.MAX_VALUE,Integer.MIN_VALUE), Integer.MAX_VALUE));
		System.out.println(UnitTest.assertNotEquals(MathUtils.max(Integer.MAX_VALUE,Integer.MIN_VALUE), Integer.MIN_VALUE));
		
		
		System.out.println(UnitTest.assertEquals(MathUtils.min(10,20), 10));
		System.out.println(UnitTest.assertNotEquals(MathUtils.min(10,20), 20));
		System.out.println(UnitTest.assertEquals(MathUtils.min(-100,20), -100));
		System.out.println(UnitTest.assertNotEquals(MathUtils.min(-100,20), 20));
		System.out.println(UnitTest.assertEquals(MathUtils.min(Integer.MAX_VALUE,Integer.MIN_VALUE), Integer.MIN_VALUE));
		System.out.println(UnitTest.assertNotEquals(MathUtils.min(Integer.MAX_VALUE,Integer.MIN_VALUE), Integer.MAX_VALUE));
		
	}
}
