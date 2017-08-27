package cw20170825;

public class Trader {

	private final String name;
	private final String city;
	
	Trader(String name, String city){
		this.name = name;
		this.city = city;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		return this.name + " : " + this.city;
	}
}
