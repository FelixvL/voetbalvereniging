package voetbalvereniging;

import java.util.ArrayList;

public class Vereniging {
	ArrayList<Lid> leden = new ArrayList();
	int aantalBezoekersInStadion;
	String naam;
	
	void toonAlleLeden() {
		for(Lid lid : leden) {
			System.out.println(lid.naam + ">>" + lid.maandenAchterStand);
		}
	}
}
