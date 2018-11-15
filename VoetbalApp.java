package voetbalvereniging;

import java.util.ArrayList;

public class VoetbalApp {

	public static void main(String[] args) {
		
		VoetbalBond knvb = new VoetbalBond();
		knvb.seizoenAfdraaien();
	}
	static ArrayList<Lid> genereerLeden(){
		ArrayList<Lid> leden = new ArrayList();
		leden.add(new AmateurSpeler("Frits", 2));
		leden.add(new ProfSpeler("Joost", 100));
		leden.add(new ProfSpeler("Jan", 200));
		leden.add(new AmateurSpeler("Marian", 1));		
		return leden;
	}
}
