package voetbalvereniging;

import voetbalvereniging.wedstrijd.*;

public class VoetbalBond {
	Wedstrijd wedstrijd;

	public void seizoenAfdraaien() {
		Vereniging ajax = new Vereniging("ajax", 50, 10, 2500 );
		Vereniging feyenoord = new Vereniging("Feyenoord", 57, 8, 3300 );
		wedstrijd = new Wedstrijd(feyenoord, ajax, 100);
		System.out.println(ajax.kasInhoud);
		System.out.println(feyenoord.kasInhoud);
		wedstrijd.spelen();
		System.out.println(ajax.kasInhoud);
		System.out.println(feyenoord.kasInhoud);
	}
}
