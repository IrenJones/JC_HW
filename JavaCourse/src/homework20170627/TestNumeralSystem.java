package homework20170627;

import firstframework.SimpleUnit;

public class TestNumeralSystem {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toString(14, 16), "E"));
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toString(255, 2), "11111111"));
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toString(13, 3), "111"));
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toString(14031996, 8), "65416174"));
		
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toBinaryString(255), "11111111"));
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toHexString(14), "E"));
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toOctalString(14031996), "65416174"));

		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toString(14, 1), "error base"));
		System.out.println(SimpleUnit.assertEquals(NumeralSystem.toString(14, 37), "error base"));
	}
}
