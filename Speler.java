package voetbalvereniging;

public class Speler extends Lid implements Omkoopbaar {

//	Speler(String naam, int maandenAchterStand){
//		super(naam, maandenAchterStand);
//	}
	Speler(String naam) {
		super(naam);
	}

	public int omkopen(int geld, String dreigBrief) throws NietTeVertrouwenException {

		return 0;
	}
}
