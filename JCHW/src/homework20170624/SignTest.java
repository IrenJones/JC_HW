package homework20170624;

public class SignTest {
	public static void main(String [] args){
		System.out.println(SimpleUnit.assertEquals(Sign.findSign(5),1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(5),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(5),0));
		
		System.out.println(SimpleUnit.assertEquals(Sign.findSign(-5),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(-5),1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(-5),0));
		
		System.out.println(SimpleUnit.assertEquals(Sign.findSign(0),0));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(0),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(0),1));
		
		System.out.println(SimpleUnit.assertEquals(Sign.findSign(Integer.MAX_VALUE),1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(Integer.MAX_VALUE),0));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(Integer.MAX_VALUE),-1));
		
		System.out.println(SimpleUnit.assertEquals(Sign.findSign(Integer.MIN_VALUE),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(Integer.MIN_VALUE),0));
		System.out.println(SimpleUnit.assertNotEquals(Sign.findSign(Integer.MIN_VALUE),1));
	}
}
