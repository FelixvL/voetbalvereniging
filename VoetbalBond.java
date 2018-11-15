package voetbalvereniging;

import voetbalvereniging.wedstrijd.*;

public class VoetbalBond {
	Wedstrijd wedstrijd;


	
	public void seizoenAfdraaien() {
		Vereniging ajax = new Vereniging("ajax", 50, 10, 2500);
		Vereniging feyenoord = new Vereniging("feyenoord", 57, 8, 3300);
		System.out.println(">>"+ajax.leden.size());
		try {
			ajax.leden = VoetbalApp.genereerLeden(ajax);
			feyenoord.leden = VoetbalApp.genereerLeden(feyenoord);
		}catch(Exception e) {
			System.out.println("Geen club gevonden");
		}
		System.out.println(">>"+feyenoord.leden.size());
		wedstrijd = new Wedstrijd(feyenoord, ajax, 100);
		System.out.println(ajax.kasInhoud);
		System.out.println(feyenoord.kasInhoud);
		new Maffia().recruteren(((Speler) ajax.leden.get(0)));

		try {
			wedstrijd.spelen();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("op een andere dag inboeken");
		}
		System.out.println(ajax.kasInhoud);
		System.out.println(feyenoord.kasInhoud);
	}
	int kopen(String lopen) throws Exception{
		return 4;
	}
}


