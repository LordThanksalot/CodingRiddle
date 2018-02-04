package main;

public class App {
	
	//optie: locaties at random kiezen, daar de som van nemen en zo totdat at random alle locatiecombinaties afgegaan zijn
	//aantal mogelijke combinaties 3x3=6, 4x4=24, 5x5=120, 15x15=1.3 biljoen
	//dit is teveel om volgens deze methode te kunnen toepassen
	//MAAR: de vraag komt neer op een geheel aantal permutaties bvb 1,2,3 -> 1,2,3 - 1,3,2 - 2,1,3 - 2,3,1 - 3,1,2 - 3,2,1
	//waarbij de index de rij is de waarde de kolom
	//deze twee coördinaten stellen de positie voor in array2d om de waarde ervan te achterhalen, die op te tellen in een som die na
	//het bereiken van de array2d size toegevoegd wordt aan een array van solutions
	
	public static void main(String[] args) {
		SquareArray sa = new SquareArray();
		sa.permutingArray(java.util.Arrays.asList(0, 1, 2, 3, 4), 0);
	}
}
