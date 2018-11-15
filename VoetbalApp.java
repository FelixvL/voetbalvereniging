package voetbalvereniging;

import java.util.ArrayList;

public class VoetbalApp {

	public static void main(String[] args){
		VoetbalBond knvb = new VoetbalBond();
		knvb.seizoenAfdraaien();
	}
	static ArrayList<Lid> genereerLeden(Vereniging club)throws Exception{
		ArrayList<Lid> leden = new ArrayList();
		if(club.naam.equals("ajax")) {
			leden.add(new AmateurSpeler("Frits", 2));
			leden.add(new ProfSpeler("Ziyech", 100));
			leden.add(new ProfSpeler("Tadic", 200));
			leden.add(new AmateurSpeler("Marian", 1));		
		}
		if(club.naam.equals("feyenoord")) {
			leden.add(new AmateurSpeler("Frits", 2));
			leden.add(new ProfSpeler("Jorgensen", 120));
			leden.add(new ProfSpeler("Berghuis", 150));
			leden.add(new AmateurSpeler("Marian", 1));		
		}
		if(leden.size() == 0) {
			throw new ClubOnbekendException("Onbekende club");
		}
		return leden;
	
	}
}
class ClubOnbekendException extends Exception{
	ClubOnbekendException(String a){
		super(a);
	}
}

