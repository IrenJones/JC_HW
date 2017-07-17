package cw20170717;

public class UseInstruments {
	public static void main(String [] args){
		MusicalInstrument [] instruments = new MusicalInstrument[]{new Clarinet("wood"), new Balalaika()};
		
		for (MusicalInstrument mi: instruments){
			System.out.println(mi.getSound());
		}
	}
}
