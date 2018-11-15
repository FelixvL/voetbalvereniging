package voetbalvereniging.wedstrijd;

import java.util.Random;

import voetbalvereniging.Vereniging;

public class Wedstrijd {
	int doelpuntenThuisclub;
	int doelpuntenUitclub;
	int kaartPrijs;
	Vereniging thuisClub;
	Vereniging uitClub;
	int per = new Random().nextInt(5);

	public Wedstrijd(Vereniging thuisClub, Vereniging uitClub, int kaartPrijs) {
		this.thuisClub = thuisClub;
		this.uitClub = uitClub;
		this.kaartPrijs = kaartPrijs;
	}

	public void spelen() throws Exception{
		if (per == 0) {
			throw new WedstrijdNietKunnenAfmakenException("Wedstrijd niet kunnen afmaken");
		}
		Random random = new Random();
		doelpuntenThuisclub = random.nextInt(4);
		doelpuntenUitclub = random.nextInt(4);
		System.out.println("De uitslag is " + doelpuntenThuisclub + " " + doelpuntenUitclub);
		System.out.println("De bezoekersaantal " + thuisClub.aantalBezoekersInStadion);
		System.out.println("De kaartprijs " + kaartPrijs);
		int totaalOpbrengst = thuisClub.aantalBezoekersInStadion * kaartPrijs;
		System.out.println("totaalOpbrengst " + totaalOpbrengst);
		int teVerdelen = totaalOpbrengst - thuisClub.stadionKosten;
		System.out.println("Te verdelen" + teVerdelen);
		Vereniging winnaar = bepaalWinnaar();
		uitbetalen(winnaar, teVerdelen);
	}

	public Vereniging bepaalWinnaar() {
		if (doelpuntenThuisclub > doelpuntenUitclub) {
			return thuisClub;
		}
		if (doelpuntenUitclub > doelpuntenThuisclub) {
			return uitClub;
		}
		return null;
	}

	void uitbetalen(Vereniging winnaar, int brutoMarge) {
		if (winnaar == null) {
			thuisClub.kasInhoud += brutoMarge / 2;
			uitClub.kasInhoud += brutoMarge / 2;
			return;
		}
		if (winnaar == thuisClub) {
			thuisClub.kasInhoud += brutoMarge * 0.75;
			uitClub.kasInhoud += brutoMarge * 0.25;
			return;
		}
		uitClub.kasInhoud += brutoMarge * 0.75;
		thuisClub.kasInhoud += brutoMarge * 0.25;

	}

}
class WedstrijdNietKunnenAfmakenException extends Exception{
	
	public WedstrijdNietKunnenAfmakenException(String bericht) {
		super(bericht);
	}
}