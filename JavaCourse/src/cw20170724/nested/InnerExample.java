package cw20170724.nested;

public class InnerExample {
	int state = 0;
	
	public void change(){
		state++;
	}
	
	class Processor{
		
		public void process(){
			state = 0;
			change();
			change();
		}
	}
}
