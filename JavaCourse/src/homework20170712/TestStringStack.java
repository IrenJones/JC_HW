package homework20170712;

import firstframework.SimpleUnit;

public class TestStringStack {
	public static void main(String[] args){
		StringStack stack = new StringStack();
		System.out.println(SimpleUnit.assertEquals(stack.size(), 0));
		System.out.println(SimpleUnit.assertEquals(stack.push("one"),true));
		System.out.println(SimpleUnit.assertEquals(stack.push("two"),true));
		System.out.println(SimpleUnit.assertEquals(stack.push("three"),true));
		System.out.println(SimpleUnit.assertEquals(stack.push("four"),true));
		System.out.println(SimpleUnit.assertEquals(stack.push("five"),true));
		System.out.println(SimpleUnit.assertEquals(stack.size(), 5));
		System.out.println(SimpleUnit.assertEquals(stack.pop(), "five"));
		System.out.println(SimpleUnit.assertEquals(stack.push("six"),true));
		System.out.println(SimpleUnit.assertEquals(stack.toString(),"[one, two, three, four, six]"));
		System.out.println(SimpleUnit.assertEquals(stack.tos(),"six"));
	}
}
