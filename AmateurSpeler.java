package voetbalvereniging;

public class AmateurSpeler extends Speler{
	int contributiePerMaand;
	
	AmateurSpeler(String naam, int contributie) {
		super(naam);
		contributiePerMaand = contributie;
	}
}
