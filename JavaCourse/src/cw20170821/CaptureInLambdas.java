package cw20170821;

public class CaptureInLambdas {

	public static void main(String[] args) {

		X x = new X();
		x.m(13);
	}

}

class X {

	static int classField = 30;
	int instanceFiled;

	void m(int formalParameter) {
		int localVariable = 10;
		Runnable r = () -> {
			System.out.println(localVariable + formalParameter + instanceFiled + classField);
		};
		
		r.run();
	}
}

