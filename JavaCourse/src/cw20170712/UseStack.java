package cw20170712;

public class UseStack {
	public static void main(String [] args){
		StringStack stack = new StringStack();
		System.out.println(stack.toString());
		stack.push("one");
		stack.push("two");
		stack.push("three");
		System.out.println(stack.toString());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.tos());
		
		System.out.println(stack.toString());
		
	}
}
