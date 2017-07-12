package cw20170712;

// Procedural programming
// Data and methods are separated
// We need to use stack as a parameter of function
// That's why it's really useful to use OOP
public class OldApproach {
	static class Stack {
		String[] elements;
		int size;
	}
	
	public static boolean push(Stack stack, String value){
		if (stack.size>=stack.elements.length){
			return false;
		}
		stack.elements[stack.size++] = value;
		return true;
	}
}
