package voetbalvereniging;

public abstract class Lid {
	int maandenAchterStand;
	String naam;
	Lid(String naam, int maandenAchterStand){
		this.naam = naam;
		this.maandenAchterStand = maandenAchterStand;
	}
}
