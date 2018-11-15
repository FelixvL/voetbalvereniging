package voetbalvereniging;

import java.util.ArrayList;

public class Vereniging {
	ArrayList<Lid> leden = new ArrayList();
	
	void toonAlleLeden() {
		for(Lid lid : leden) {
			System.out.println(lid.naam + ">>" + lid.maandenAchterStand);
		}
	}
}
