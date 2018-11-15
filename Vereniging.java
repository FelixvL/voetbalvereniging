package voetbalvereniging;

import java.util.ArrayList;

public class Vereniging {
	ArrayList<Lid> leden = new ArrayList();
	int aantalBezoekersInStadion;
	String naam;
	int hoogteContributiePerMaand;
	int kasInhoud;

	void toonAlleLeden() {
		for (Lid lid : leden) {
			System.out.println(lid.naam + ">>");
		}
	}

	int berekenContributieSchuld() {
		int totaal = 0;
		for (Lid lid : leden) {
			if (lid instanceof AmateurSpeler) {
				totaal = totaal + ((AmateurSpeler) lid).contributiePerMaand * hoogteContributiePerMaand;
			}
		}
		return totaal;
	}

	Vereniging(String naam, int stadionCapaciteit, int contributie) {
		this.naam = naam;
		aantalBezoekersInStadion = stadionCapaciteit;
		hoogteContributiePerMaand = contributie;

	}

	void wedstrijdSpelen(int prijs) {
		System.out.println("jojo in wedstrijdspelen" + prijs * aantalBezoekersInStadion);
		kasInhoud = kasInhoud + prijs * aantalBezoekersInStadion;
	}

	int toonKasInhoud() {
		System.out.println("In de kas zit" + kasInhoud);
		System.out.println("Van de leden krijgen wij nog" + berekenContributieSchuld());
		System.out.println("Het totaal is dus: " + (kasInhoud + berekenContributieSchuld()));
		return kasInhoud;
	}
	int toonSalaris() {
		int salarisTotaal = 0;
		for (Lid lid : leden) {
			if (lid instanceof ProfSpeler) {
				salarisTotaal = salarisTotaal + ((ProfSpeler) lid).salaris;
			}	
		}
		return salarisTotaal;
	}
}
