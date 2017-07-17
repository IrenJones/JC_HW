package cw20170717;

abstract public class WindInstruments extends MusicalInstrument{
	private String material;
	
	public WindInstruments(String material){
		this.material = material;
	}
	
	abstract public int powerOfWind();
	
	public String getMaterial(){
		return this.material;
	}
}
