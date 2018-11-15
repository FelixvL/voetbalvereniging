package voetbalvereniging;

import java.util.ArrayList;

public class VoetbalApp {

	public static void main(String[] args) {
		System.out.println(">");
		Vereniging vereniging1 = new Vereniging("Feyenoord", 57_000, 10);
		vereniging1.leden = genereerLeden();
		vereniging1.wedstrijdSpelen(33);
		System.out.println("De contributieSchuld is "+vereniging1.berekenContributieSchuld());
		vereniging1.toonKasInhoud();
		vereniging1.wedstrijdSpelen(20);
		vereniging1.toonKasInhoud();
	}
	static ArrayList<Lid> genereerLeden(){
		ArrayList<Lid> leden = new ArrayList();
		leden.add(new Speler("Frits", 2));
		leden.add(new Speler("Joost", 2));
		leden.add(new Speler("Jan", 3));
		leden.add(new Speler("Marian", 1));		
		return leden;
	}
}
