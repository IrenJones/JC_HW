package homework20170624;

public class Mod {

	public static int findMod(int a, int b) {
		if (b == 0){
			System.err.println("The second operand is zero, so the behavior is undefined");
			return a;
		}
		else{
			return a - a/b *b;
		}
	}

}
