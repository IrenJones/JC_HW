package cw20170901;

public enum Seasons {

	WINTER("Low"), SPRING("Medium"), SUMMER("High"), AUTUMN("Medium");
	
	private String temp;
	
	private Seasons(String temp){
		this.temp = temp;
	}
	
	public String getTemp(){
		return this.temp;
	}
}
