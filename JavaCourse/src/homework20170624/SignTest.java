package homework20170624;

public class SignTest {
	public static void main(String [] args){
		System.out.println(SimpleUnit.assertEquals(Sign.sign(5),1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(5),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(5),0));
		
		System.out.println(SimpleUnit.assertEquals(Sign.sign(-6),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-6),1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-6),0));
		
		System.out.println(SimpleUnit.assertEquals(Sign.sign(0),0));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0),1));
		
		System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MAX_VALUE),1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MAX_VALUE),0));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MAX_VALUE),-1));
		
		System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MIN_VALUE),-1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MIN_VALUE),0));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MIN_VALUE),1));
	}
}
