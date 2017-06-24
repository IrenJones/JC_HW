package cw20170624;

public class SignTest {
	public static void main(String [] args){
		System.out.println(UnitTest.assertEquals(Sign.findSign(5),1));
		System.out.println(UnitTest.assertEquals(Sign.findSign(-5),-1));
	}
}
