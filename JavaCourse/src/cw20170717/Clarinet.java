package cw20170717;

public class Clarinet extends WindInstruments{

	private int windPower = 10;
	
	public Clarinet(String material) {
		super(material);
	}

	@Override
	public String getSound() {
		return "Sounds of clarinet!";
	}

	@Override
	public void clean() {
		System.out.println("Cleaning clarinet");
		
	}

	@Override
	public int powerOfWind() {
		return this.windPower;
	}

}
