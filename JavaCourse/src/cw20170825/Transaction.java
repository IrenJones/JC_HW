package cw20170825;

public class Transaction {

	private final Trader trader;
	private final int year;
	private final int value;
	
	Transaction(Trader tr, int y, int v){
		this.trader = tr;
		this.year = y;
		this.value = v;
	}
	
	public Trader getTrader(){
		return this.trader;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int getYear(){
		return this.year;
	}
	
	@Override
	public String toString(){
		return this.year + " : " + this.value + " tr: " + this.trader;
	}
}
