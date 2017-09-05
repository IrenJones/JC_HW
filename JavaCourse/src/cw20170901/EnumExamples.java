package cw20170901;

public class EnumExamples {

	public static void main(String[] args) {

		for (Seasons s : Seasons.values()) {
			System.out.println(s + " " + s.ordinal());
		}

		Seasons curSeason = Seasons.AUTUMN;

		switch (curSeason) {
		case WINTER:

			break;
		case SPRING:

			break;
		case AUTUMN:
			System.out.println("oh no");
			break;
		case SUMMER:

			break;
		default:
			System.out.println("We have some problems");
		}

	}

}
