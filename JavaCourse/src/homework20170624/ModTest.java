package homework20170624;

import firstframework.SimpleUnit;

public class ModTest {
	public static void main(String [] args){
		System.out.println(SimpleUnit.assertEquals(Mod.mod(10, 6), 4));
		System.out.println(SimpleUnit.assertNotEquals(Mod.mod(10, 6), 6));
		
		System.out.println(SimpleUnit.assertEquals(Mod.mod(10, 10), 0));
		System.out.println(SimpleUnit.assertEquals(Mod.mod(1, 10), 1));
		
		System.out.println(SimpleUnit.assertEquals(Mod.mod(10, Integer.MAX_VALUE), 10));
		System.out.println(SimpleUnit.assertEquals(Mod.mod(-15, 26), -15));
		System.out.println(SimpleUnit.assertEquals(Mod.mod(-50, 11), -6));
		
		//System.out.println(SimpleUnit.assertEquals(Mod.mod(-50, 0), -50));
	}
}
